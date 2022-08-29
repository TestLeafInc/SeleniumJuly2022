package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	// action+ElementName
	public LoginPage enterUsername(String uName) throws InterruptedException, IOException {

		try {
			getDriver().findElement(By.id("username")).sendKeys(uName);
			reportStep(uName+" Username is entered successfully","pass");
		} catch (Exception e) {
			reportStep("Username is not entered successfully....."+e,"fail");
		}

		return this; // this keyword represents the same java class

	}

	public LoginPage enterPassword(String pWord) throws IOException {
		try {
			getDriver().findElement(By.id("password")).sendKeys(pWord);
			reportStep(pWord+" password is entered successfully","pass");
		} catch (Exception e) {
			reportStep(pWord+" password is not entered successfully...."+e,"fail");
		}

		return this;
	}

	public HomePage clickLoginButton() throws IOException {
		try {
			getDriver().findElement(By.className("decorativeSubmit")).click();
			reportStep("Login button is clicked","pass");
		} catch (Exception e) {
			reportStep("Login button is not clicked..."+e,"fail");
		}

		return new HomePage();

	}

}
