package com.jadinec.utils;

import java.util.Locale;
import java.util.ResourceBundle;

import com.jadinec.model.InterfaceName;

public class ConfigFile {

	private static ResourceBundle bundle = ResourceBundle.getBundle("application",Locale.CHINA);
	
	public static String getUrl(InterfaceName name) {
		String address = bundle.getString("test.url");
		String uri = "";
		//最终测试地址
		String testUrl;
		if(name == InterfaceName.AddOrgInfo) {
			uri = bundle.getString("addOrgInfo.uri");
		}
		if(name == InterfaceName.GetOrgInfoById) {
			uri = bundle.getString("getOrgInfoById.uri");
		}
		if(name == InterfaceName.EditOrgInfo) {
			uri = bundle.getString("editOrgInfo.uri");
		}
		if(name == InterfaceName.DeleteOrgInfo) {
			uri = bundle.getString("deleteOrgInfo.uri");
		}
		
		testUrl = address + uri;
		return testUrl;
	}
}
