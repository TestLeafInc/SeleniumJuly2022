package week3.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.SessionId;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPhonePrice {

	public static void main(String[] args) throws InterruptedException, IOException {


		// We have to call WDM for the browser driver !!
		WebDriverManager.chromedriver().setup(); // verify the version, download, set up !

		// Launch the browser (chrome)
		ChromeDriver driver = new ChromeDriver();

		// Load the URL 
		driver.get("https://amazon.in");
				
		// manage timeout -> findElement(s)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Maximize the browser 
		driver.manage().window().maximize();

		// Type phones -> id: twotabsearchtextbox
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones", Keys.ENTER);
		
		// Print price of every phone
		List<WebElement> allPhoneElements = driver.findElements(By.className("a-price-whole"));
		 
		List<Integer> phonePrices = new ArrayList<Integer>();
		for (int i = 0; i < allPhoneElements.size(); i++) {
			System.out.println(allPhoneElements.get(i).getText());
			String priceStr = allPhoneElements.get(i).getText().replace(",", "");
			int price = Integer.parseInt(priceStr);
			phonePrices.add(price);
		}
		 
		Collections.sort(phonePrices);
		System.out.println(phonePrices.get(0));
		
	}

}
