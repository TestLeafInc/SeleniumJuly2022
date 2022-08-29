package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setup() {
		excelFileName = "CreateLead";
	}

	
	@Test(dataProvider = "fetch")
	public void runLogin(String username, String password, String firstName, String lastName, String company) throws InterruptedException {
		System.out.println();
		LoginPage lp = new LoginPage();
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterCompanyName(company)
		.clickCreateLeadButton()
		.verifyFirstName(firstName);
		
	}

}
