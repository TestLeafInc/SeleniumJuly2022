package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EditLead extends ProjectSpecifcMethods{

	
	@Test(groups="Subraja") //(enabled=false)
	public void editLead() throws InterruptedException {
		
		
		// Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click Leads Tab
		driver.findElement(By.linkText("Leads")).click();
		
		// Click Find Leads 
		driver.findElement(By.linkText("Find Leads")).click();
		
		// Type the first name
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("Babu");

		
		// Click Find Leads Button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		// Click First Resulting Lead
		WebElement ele = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a"));
		
		
		try {
			ele.click(); // all success 
		} catch (StaleElementReferenceException e) { // staless
			System.out.println("Failed due to Staleness of the element");
			wait.until(ExpectedConditions.stalenessOf(ele));
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		} catch (ElementClickInterceptedException e1) { // clickability
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")));
			ele.click();
		} catch(Exception e2) { // all other exceptions 
			throw new RuntimeException("Stopped because of failure");
		}
		
		
		
	}

}
