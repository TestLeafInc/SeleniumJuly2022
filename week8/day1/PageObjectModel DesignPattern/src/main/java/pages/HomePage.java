package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage verifyHomePage() {
		String expTitle = "Leaftaps - TestLeaf Automation Platform";
		String actTitle = getDriver().getTitle();
		Assert.assertEquals(actTitle, expTitle);
		
		return this;

	}
	
	public MyHomePage clickCrmsfaLink() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();

		return new MyHomePage();
	}

}
