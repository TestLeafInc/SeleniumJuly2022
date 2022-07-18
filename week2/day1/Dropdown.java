package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		// We have to call WDM for the browser driver !!
		WebDriverManager.chromedriver().setup(); // verify the version, download, set up !
		
		// Launch the browser (chrome)
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL 
		driver.get("http://www.leafground.com/pages/Dropdown.html");
			
		// Maximize the browser 
		driver.manage().window().maximize();
		
		
		// Find the first dropdown
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		
		// Convert to Select (Class)
		Select select = new Select(dropdown1);
		
		// Select selectByIndex
		//select.selectByIndex(2);
		
		// Select selectByValue
		//select.selectByValue("3");
		
		// Select selectByVisible
		//select.selectByVisibleText("");
		
		
		
		
		
		
	}

}
