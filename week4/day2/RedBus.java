package week4.day2;

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
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.javadoc.internal.doclets.toolkit.resources.doclets;

public class RedBus {
	
	public static void main(String[] args)  {
		
		
		// We have to call WDM for the browser driver !!
		WebDriverManager.chromedriver().setup(); // verify the version, download, set up !
		
		// Handle Browser notifications
		ChromeOptions options = new ChromeOptions();
		
		// Notfications
		options.addArguments("--disable-notifications");
		
		// Headless -- invisible !
		//options.setHeadless(true);
				
		// Launch the browser (chrome)
		ChromeDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.redbus.in/");
		
		// Maximize the browser 
		driver.manage().window().maximize();
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		// Find element
		WebElement allRights = driver.findElement(By.xpath("//span[text()=' 2022 ibibogroup All rights reserved']"));
		

		// Move to Actions
		Actions builder = new Actions(driver);
		
		// Mouse over
		builder.scrollToElement(allRights).perform();
		
		// Edit
		//driver.findElement(By.xpath("//span[text()='Edit']")).click();
		
		 // Step 1: Take a snapshot --> local mem file 
		 File source = driver.getScreenshotAs(OutputType.FILE); // limitation : take snapshot of viewable port
		 
		 // Step 2: You need to save it to your local dir !
		 File dest = new File("E:/redbus.png");
		 try {
			FileUtils.copyFile(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

	}

}
