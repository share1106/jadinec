package com.jadinec.cases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jadinec.config.TestConfig;
import com.jadinec.model.AddOrgInfoCase;
import com.jadinec.model.OrganizationInfo;
import com.jadinec.utils.DatabaseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class AddOrgInfoTest {

	@Test(enabled=false)
	public void addOrgInfoTest() throws IOException {

		SqlSession sqlSession = DatabaseUtil.getSqlSession();
		AddOrgInfoCase addOrgInfoCase = sqlSession.selectOne("addorginfo", 1);
		System.out.println(addOrgInfoCase.toString());
		System.out.println(TestConfig.addOrgInfoUrl);

		// 发送请求，获取结果
		JSONArray result = getJsonResult(addOrgInfoCase);
		//System.out.println(result);

		String expectedData = null;
		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			expectedData = jsonObject.getString("data");

		}
		System.out.println(expectedData);
		
		OrganizationInfo org = sqlSession.selectOne("addOrgInfo", 524);
		System.out.println(org);
		/*
		List<OrganizationInfo> list = new ArrayList<OrganizationInfo>();
		list.add(org);
		JSONArray jsonArray = JSONArray.fromObject(list);
		System.out.println(jsonArray);
		
		String actualData = null;
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			actualData = jsonObject.getString("data");

		}
		System.out.println(actualData);
		
		 
		  Assert.assertEquals(result_id, json_id);
		 */
	}

	private JSONArray getJsonResult(AddOrgInfoCase addOrgInfoCase) throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.addOrgInfoUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		param2.put("accountOpenLicenseCode", addOrgInfoCase.getAccountOpenLicenseCode());
		param2.put("businessLicenseCode", addOrgInfoCase.getBusinessLicenseCode());
		param2.put("contactMobile", addOrgInfoCase.getContactMobile());
		param2.put("legalRepPerson", addOrgInfoCase.getLegalRepPerson());
		param2.put("logoImg", addOrgInfoCase.getLogoImg());
		param2.put("nickName", addOrgInfoCase.getNickName());
		param2.put("officeAddress", addOrgInfoCase.getOfficeAddress());
		param2.put("openBackAccount", addOrgInfoCase.getOpenBackAccount());
		param2.put("openBank", addOrgInfoCase.getOpenBank());
		param2.put("orgAddress", addOrgInfoCase.getOrgAddress());
		param2.put("orgCategory", addOrgInfoCase.getOrgCategory());
		param2.put("orgCode", addOrgInfoCase.getOrgCode());
		param2.put("orgEmail", addOrgInfoCase.getOrgEmail());
		param2.put("orgName", addOrgInfoCase.getOrgName());
		param2.put("orgType", addOrgInfoCase.getOrgType());
		param2.put("orgWebSite", addOrgInfoCase.getOrgWebSite());
		param2.put("regAddress", addOrgInfoCase.getRegAddress());
		param2.put("regCapital", addOrgInfoCase.getRegCapital());
		param2.put("securityCertCode", addOrgInfoCase.getSecurityCertCode());
		param2.put("superCompanyCode", addOrgInfoCase.getSuperCompanyCode());
		param2.put("unifiedSocialCreditCode", addOrgInfoCase.getUnifiedSocialCreditCode());
		param1.put("client", "web");
		param1.put("content", param2);
		param1.put("version", "1.0");

		post.setHeader("Content-Type", "application/json;charset=UTF-8");
		post.setHeader("access_token", "913724ca-7dd8-4574-896d-f8781fc76e17");
		post.setHeader("client", "web");

		StringEntity entity = new StringEntity(param1.toString(), "UTF-8");
		post.setEntity(entity);

		String result;
		HttpResponse response = TestConfig.defaultHttpClient.execute(post);
		result = EntityUtils.toString(response.getEntity(), "UTF-8");
		System.out.println(result);
		List<String> list = Arrays.asList(result);
		JSONArray array = JSONArray.fromObject(list);
		return array;
	}
}
