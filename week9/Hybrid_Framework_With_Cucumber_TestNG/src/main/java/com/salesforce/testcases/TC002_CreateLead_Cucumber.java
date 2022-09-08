package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/main/java/features/F02_CreateLead.feature", glue= {"com.salesforce.pages"}, monochrome=true)
public class TC002_CreateLead_Cucumber extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "CreateLead";
		testDescription ="Verify CreateLead functionality";
		authors="Hari";
		category ="Smoke";
	}
	
	

}
