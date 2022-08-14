package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecifcMethods {
	
	RemoteWebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod(groups="Babu")
	public void setup() {
		
		// We have to call WDM for the browser driver !!
		WebDriverManager.chromedriver().setup(); // verify the version, download, set up !
		
		// Launch the browser (chrome)
		driver = new ChromeDriver();
		
		// Load the URL 
		driver.get("http://leaftaps.com/opentaps");
			
		// Maximize the browser 
		driver.manage().window().maximize();
		
		// Wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Timeouts
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Find the user name and enter the username value (demosalesmanager)
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		// Find the password field and enter the password (crmsfa)
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@AfterMethod(groups="Babu")
	public void tearDown() {
		driver.quit();
	}

}
