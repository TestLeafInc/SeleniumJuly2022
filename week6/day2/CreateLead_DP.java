package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead_DP extends ProjectSpecificMethods{
	
	@DataProvider(name="create")
	public String[][] fetchData() {
		String[][] data = new String[2][3];
		
		// 1st data set
		data[0][0] = "TestLeaf";
		data[0][1] = "Babu";
		data[0][2] = "Manickam";
		
		// 1st data set
		data[1][0] = "Qeagle";
		data[1][1] = "Hari";
		data[1][2] = "Radhakrishnan";

		return data;
	}
	
	

	@Test(dataProvider = "create")
	public void createLead(String company, String first, String last) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(first);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(last);
		driver.findElement(By.name("submitButton")).click();
		
	}
	
	
	
}
