package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecifcMethods{
	
	

	
	@Test(groups="Vidya")
	public void createNewLead() throws InterruptedException {
		
		
		// Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click Leads Tab
		driver.findElement(By.linkText("Leads")).click();
				
		
	}
	
	

}
