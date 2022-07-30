package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		// We have to call WDM for the browser driver !!
		WebDriverManager.chromedriver().setup(); // verify the version, download, set up !
		
		// Launch the browser (chrome)
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL 
		driver.get("http://www.leafground.com/pages/Alert.html");
			
		// Maximize the browser 
		driver.manage().window().maximize();
		
		/*
		// Click on the Alert Box
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		// Get the text first from the alert
		Alert alert = driver.switchTo().alert();

		String text = alert.getText();
		System.out.println(text);
		
		// Click Ok
		alert.accept();
		
		
		// Click on the Alert Box
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		// Get the text first from the alert
		Alert alert = driver.switchTo().alert();

		String text = alert.getText();
		System.out.println(text);
		
		// Click Cancel
		alert.dismiss();
		
		// Check cancelled was clicked !
		String text2 = driver.findElement(By.id("result")).getText();
		System.out.println(text2);
		
		*/
		
		// Click on the Alert Box
		//driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		// Get the text first from the alert
		Alert alert = driver.switchTo().alert();
	
		String text = alert.getText();
		System.out.println(text);
		
		 // Step 1: Take a snapshot --> local mem file 
		 File source = driver.getScreenshotAs(OutputType.FILE); // limitation : take snapshot of viewable port
		 
		 // Step 2: You need to save it to your local dir !
		 File dest = new File("snap1.png");
		 FileUtils.copyFile(source, dest);
		 
		
		
		// Click Cancel
		alert.accept();
		
		// Check cancelled was clicked !
		String text2 = driver.findElement(By.id("result1")).getText();
		System.out.println(text2);
		
		
	}

}
