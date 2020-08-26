package com.jadinec.cases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jadinec.config.TestConfig;
import com.jadinec.model.InterfaceName;
import com.jadinec.utils.ConfigFile;

public class GetOrgInfoByIdTest {

	@BeforeTest
	public void beforeTest() {
		TestConfig.getOrgInfoByIdUrl = ConfigFile.getUrl(InterfaceName.GetOrgInfoById);
	}
	
	@Test
	public void getOrgInfoByIdTest() {
		
	}
}
