package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLeads {
	
	/*
	1) Open the chrome
	2) Login to leaftaps
	3) Click CRM/SFA link
	4) Click Leads Link
	5) Click Merge Leads Link
	6) Click the icon following the from lead
	7) Switch to new window
	8) Enter the first name as Babu
	9) Click Find Leads Button
	10) Click on the first resulting lead
	11) Move the control back to first window
	
	*/

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		// We have to call WDM for the browser driver !!
		WebDriverManager.chromedriver().setup(); // verify the version, download, set up !
		
		// Launch the browser (chrome)
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		// Maximize the browser 
		driver.manage().window().maximize();
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Find the user name and enter the username value (demosalesmanager)
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		Thread.sleep(5000);
		
		// Find the password field and enter the password (crmsfa)
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// WindowHandle
		String primary = driver.getWindowHandle();
		
		
		// Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click Leads Tab
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Merge Leads")).click();
		
		// Click on the icon
		driver.findElement(By.xpath("//span[text()='From Lead']/following::img")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstWindowHandles = new ArrayList<String>(windowHandles);
		
		// Second window
		driver.switchTo().window(lstWindowHandles.get(1));
		
		// Type name
		driver.findElement(By.name("firstName")).sendKeys("Babu");
		
		// Find Leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		
		// Switch back and print title
		driver.switchTo().window(primary);
		
		System.out.println(driver.getTitle());
		
		

	}

}
