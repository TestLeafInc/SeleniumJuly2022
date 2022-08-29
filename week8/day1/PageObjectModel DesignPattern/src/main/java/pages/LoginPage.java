package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
			// action+ElementName
	public LoginPage enterUsername(String uName) throws InterruptedException {
		System.out.println(getDriver());
		getDriver().findElement(By.id("username")).sendKeys(uName);
		
	//	Thread.sleep(10000);
		return this; //this keyword represents the same java class
		
	}

	public LoginPage enterPassword(String pWord) {
		getDriver().findElement(By.id("password")).sendKeys(pWord);
		
		return  this;
	}

	public HomePage clickLoginButton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		
		return new HomePage();
		
	}

}
