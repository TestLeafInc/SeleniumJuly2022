package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLead {

	public static void main(String[] args) throws InterruptedException {
		
		// We have to call WDM for the browser driver !!
		WebDriverManager.chromedriver().setup(); // verify the version, download, set up !
		
		// Launch the browser (chrome)
		ChromeDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		
		// Load the URL 
		driver.get("http://leaftaps.com/opentaps");
			
		// Maximize the browser 
		driver.manage().window().maximize();
		
		// Find the user name and enter the username value (demosalesmanager)
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		Thread.sleep(5000);
		
		// Find the password field and enter the password (crmsfa)
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Get the text
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		// Finally, we need to check if we are correct page !!
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		
		// findElement --> find the first matching element by the given locator in the DOM / web page !
		// if there is no match -> it will throw exception -> NoSuchElement !!
		
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
