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

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		// We have to call WDM for the browser driver !!
		WebDriverManager.chromedriver().setup(); // verify the version, download, set up !
		
		// Launch the browser (chrome)
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL 
		driver.get("http://www.leafground.com/pages/frame.html");
			
		// Maximize the browser 
		driver.manage().window().maximize();
		
		// Switch to main frame
		WebElement parentFrame = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		driver.switchTo().frame(parentFrame);
		
		// Switch to the child frame
		driver.switchTo().frame("frame2");
		
		// Click on the element
		driver.findElement(By.id("Click1")).click();
		
		// Come out of all the frame
		driver.switchTo().defaultContent();
		
		
	}

}
