package com.jadinec.cases;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
//import org.json.JSONArray;
//import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jadinec.config.TestConfig;
import com.jadinec.model.GetOrgInfoByIdCase;
import com.jadinec.model.InterfaceName;
import com.jadinec.model.OrganizationInfo;
import com.jadinec.utils.ConfigFile;
import com.jadinec.utils.DatabaseUtil;

public class GetOrgInfoByIdTest {

	@BeforeTest
	public void beforeTest() {
		TestConfig.getOrgInfoByIdUrl = ConfigFile.getUrl(InterfaceName.GetOrgInfoById);
		// System.err.println(TestConfig.getOrgInfoByIdUrl);
		TestConfig.defaultHttpClient = new DefaultHttpClient();
	}

	@Test
	public void getOrgInfoByIdTest() throws IOException {
		SqlSession sqlSession = DatabaseUtil.getSqlSession();
		GetOrgInfoByIdCase getOrgInfoByIdCase = sqlSession.selectOne("getorginfobyid", 1);
		System.out.println(getOrgInfoByIdCase.toString());
		System.out.println(TestConfig.getOrgInfoByIdUrl);
		
		//发送请求，获取结果
		JSONArray result = getJsonResult(getOrgInfoByIdCase);
		System.out.println(result);
		
		String data = null;
		for(int i=0;i<result.size();i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data = jsonObject.getString("data");
			
		}
		JSONArray ja = new JSONArray();
		JSONArray jsa = ja.element(data);
		Object result_id = null;
		JSONObject jsonObject = new JSONObject();
		jsonObject = (JSONObject) jsa.get(0);
		result_id = jsonObject.get("id");
		//System.out.println(result_id);
		
		
		OrganizationInfo org = sqlSession.selectOne(getOrgInfoByIdCase.getExpected(),getOrgInfoByIdCase);
		
		List<OrganizationInfo> list = new ArrayList<OrganizationInfo>();
		list.add(org);
		Object json_id = null;
		JSONArray jsonArray = JSONArray.fromObject(list);
		for(int i=0;i<jsonArray.size();i++) {
			JSONObject jObject = new JSONObject();
			jObject = (JSONObject) jsonArray.get(i);
			json_id = jObject.get("id");
		}
		//System.out.println(json_id);
		Assert.assertEquals(result_id, json_id);
	}

	private JSONArray getJsonResult(GetOrgInfoByIdCase getOrgInfoByIdCase) throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.getOrgInfoByIdUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		param2.put("id", getOrgInfoByIdCase.getOrg_id());
		param1.put("client", "web");
		param1.put("content", param2);
		param1.put("version", "1.0");
		
		post.setHeader("Content-Type","application/json;charset=UTF-8");
		post.setHeader("access_token","913724ca-7dd8-4574-896d-f8781fc76e17");
		post.setHeader("client","web");
				
		StringEntity entity = new StringEntity(param1.toString(),"UTF-8");
		post.setEntity(entity);
		
		String result;
		HttpResponse response = TestConfig.defaultHttpClient.execute(post);
		result = EntityUtils.toString(response.getEntity(),"UTF-8");
		
		List<String> list = Arrays.asList(result);
		JSONArray array = JSONArray.fromObject(list);
		return array;
	}

}
