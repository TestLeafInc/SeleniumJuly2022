package com.salesforce.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class HooksImplementation extends ProjectSpecificMethods{
	@Before
	public void beforeScenario(Scenario sc) {
		testName.set(sc.getName());
		setNode();

	}

}
