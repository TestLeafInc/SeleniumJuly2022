package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setup() {
		excelFileName = "Login";
	}

	
	@Test(dataProvider="fetch")
	public void runLogin(String username, String password) throws InterruptedException {
		System.out.println(getDriver());
		LoginPage lp = new LoginPage();
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.verifyHomePage();
		
	}

}
