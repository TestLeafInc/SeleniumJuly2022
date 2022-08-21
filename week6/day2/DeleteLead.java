package week6.day2;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DeleteLead extends ProjectSpecificMethods{

	@Test // (retryAnalyzer = RetryFailedTests.class)
	public void runDeleteLead() throws InterruptedException {

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("91");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

		String text = driver.findElement(By.className("x-paging-info")).getText();
		//Assert.assertEquals(text, "No records will be displayed"); //Hard Assertion
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(text, "No records will be displayed"); // Soft Assertion
		
		
		/*
		if (text.equals("No records to display")) { 
			System.out.println("Text matched");
		} else { 
			System.out.println("Text not matched");
		}
		*/
		
		System.out.println(driver.getTitle());

	}
}






