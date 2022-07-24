package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLinkCount {

	public static void main(String[] args) throws InterruptedException {
		
		
		// We have to call WDM for the browser driver !!
		WebDriverManager.chromedriver().setup(); // verify the version, download, set up !
		
		// Launch the browser (chrome)
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL 
		driver.get("http://www.leafground.com/pages/Link.html");
			
		// Maximize the browser 
		driver.manage().window().maximize();
		
		// How many links?
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		// Second link name ?
		WebElement eleSecondLink = links.get(1);
		
		// Get text
		String text = eleSecondLink.getText();
		System.out.println(text);
		
	}

}
