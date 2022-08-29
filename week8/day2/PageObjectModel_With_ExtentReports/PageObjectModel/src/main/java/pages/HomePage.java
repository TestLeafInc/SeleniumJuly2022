package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage verifyHomePage() throws IOException {
		try {
			String expTitle = "Leaftaps - TestLeaf Automation Platform";
			String actTitle = getDriver().getTitle();
			Assert.assertEquals(actTitle, expTitle);
			reportStep("Title is matching","pass");
		} catch (Exception e) {
			reportStep("Title is not matching","fail");
		}
		
		return this;

	}
	
	public MyHomePage clickCrmsfaLink() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();

		return new MyHomePage();
	}

}
