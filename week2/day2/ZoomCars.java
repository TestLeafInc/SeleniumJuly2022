package week2.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomCars {

	public static void main(String[] args) throws InterruptedException, IOException {


		// We have to call WDM for the browser driver !!
		WebDriverManager.chromedriver().setup(); // verify the version, download, set up !

		// Launch the browser (chrome)
		ChromeDriver driver = new ChromeDriver();

		// Load the URL 
		driver.get("https://www.zoomcar.com/in/bangalore/");
		
		// manage timeout -> findElement(s)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Maximize the browser 
		driver.manage().window().maximize();

		//3) Click on Pickup City -> class : placeholder
		driver.findElement(By.className("placeholder")).click();
		
		// 4) Click the fist suggested pick up location 
		     // xpath -> //h3[text()='Suggested Pick Up Locations']/following::div[1]/div
		     // ellipsis -> class
		
		driver.findElement(By.className("ellipsis")).click();
		     
		// 5) Click on Calendate date 
		   //  class -> field-date
		    //span[@class='field-date start-time']
		 driver.findElement(By.className("field-date")).click();
		 
		 
		//6) Click on Date 19 (twice)

		 driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
		 driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();

		//7) Click Continue
		    //button[contains(text(),'Continue')]
		 driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

		//8) Click Find Cars
		    //button[contains(text(),'Find cars')]
		 driver.findElement(By.xpath("//button[contains(text(),'Find cars')]")).click();

		//9) Find the price of maruti swift dzire 
		  // (//h3[text()='Maruti Swift Dzire']/following::div[@class='price-book-ctr']/div/div)[1]
		 String price = driver.findElement(By.xpath("(//h3[text()='Maruti Swift Dzire']/following::div[@class='price-book-ctr']/div/div)[1]")).getText();
		 System.out.println(price.replace("₹ ",""));
		 
		 
		 // Step 1: Take a snapshot --> local mem file 
		 File source = driver.getScreenshotAs(OutputType.FILE); // limitation : take snapshot of viewable port
		 
		 // Step 2: You need to save it to your local dir !
		 File dest = new File("snap1.png");
		 FileUtils.copyFile(source, dest);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
