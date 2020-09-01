package com.jadinec.config;

import org.testng.TestNG;

import com.jadinec.cases.GetOrgInfoByIdTest;

public class Entry {

	public static void main(String[] args) {
		TestNG testNG = new TestNG();
		Class[] classes = {GetOrgInfoByIdTest.class};
		testNG.setTestClasses(classes);
		testNG.run();

	}

}
