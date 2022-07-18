package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		// We have to call WDM for the browser driver !!
		WebDriverManager.chromedriver().setup(); // verify the version, download, set up !
		
		// Launch the browser (chrome)
		ChromeDriver driver = new ChromeDriver();
		
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
		
		// Get the attribute and print
		String attribute = logout.getAttribute("value");
		System.out.println(attribute);
		if(attribute.equals("Logout")) {
			System.out.println("Successfully Logged In");
		}
		
		// Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click Leads Tab
		driver.findElement(By.linkText("Leads")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
