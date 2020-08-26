package com.jadinec.config;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.DefaultHttpClient;

@SuppressWarnings("deprecation")
public class TestConfig {

	public static String getOrgInfoByIdUrl;
	public static String addOrgInfoUrl;
	public static String editOrgInfoUrl;
	public static String deleteOrgInfoUrl;
	
	public static DefaultHttpClient defaultHttpClient;
	public static CookieStore cookieStore;
}
