package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	public ViewLeadPage verifyFirstName(String expName) {
		String actName = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
		
		Assert.assertEquals(actName, expName);
		return this;
	}

}
