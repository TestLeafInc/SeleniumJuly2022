package week6.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setup() {
		excelFileName = "CreateLead";
	}

	@Test(dataProvider = "fetch")
	public void createLead(String company, String first, String last) {
		driver.findElement(By.linkText("Create Lead1")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(first);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(last);
		driver.findElement(By.name("submitButton")).click();
		
	}
	
	
	
}
