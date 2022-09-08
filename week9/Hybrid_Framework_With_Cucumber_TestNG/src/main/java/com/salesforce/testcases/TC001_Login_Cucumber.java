package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/main/java/features/F01_Login.feature", glue= {"com.salesforce.pages"}, monochrome=true)
public class TC001_Login_Cucumber extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyLogin";
		testDescription ="Verify Login functionality";
		authors="Hari";
		category ="Smoke";
		
	}
	
	

}
