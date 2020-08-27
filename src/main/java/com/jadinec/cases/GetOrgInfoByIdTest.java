package com.jadinec.cases;

import java.io.IOException;

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jadinec.config.TestConfig;
import com.jadinec.model.GetOrgInfoByIdCase;
import com.jadinec.model.InterfaceName;
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
	}

}
