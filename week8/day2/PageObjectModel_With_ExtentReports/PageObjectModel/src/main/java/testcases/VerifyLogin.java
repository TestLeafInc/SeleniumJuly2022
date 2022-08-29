package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setup() {
		excelFileName = "Login";
		testName = "VerifyLogin";
		testDescription = "Login with positive data";
		testAuthor = "Hari";
		testCategory = "smoke";
	}

	
	@Test(dataProvider="fetch")
	public void runLogin(String username, String password) throws InterruptedException, IOException {
		System.out.println(getDriver());
		LoginPage lp = new LoginPage();
		
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.verifyHomePage();
		
	}

}
