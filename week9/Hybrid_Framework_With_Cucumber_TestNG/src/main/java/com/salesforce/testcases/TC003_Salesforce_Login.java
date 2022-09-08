package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC003_Salesforce_Login extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TestNG Testcase";
		testDescription ="Login for Salesforce";
		authors="Hari";
		category ="Smoke";
		
	}
	
	@Test
	public void runLogin() {
		new LoginPage()
		.enterUsername("hari.radhakrishnan@qeagle.com")
		.enterPassword("India$321")
		.clickLogin()
		.verifyHomePage();

	}

}
