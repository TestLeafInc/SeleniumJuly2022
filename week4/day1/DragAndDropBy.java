package week4.day1;

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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropBy {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		// We have to call WDM for the browser driver !!
		WebDriverManager.chromedriver().setup(); // verify the version, download, set up !
		
		// Launch the browser (chrome)
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		// Maximize the browser 
		driver.manage().window().maximize();
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Switch to the frame
		driver.switchTo().frame(0);
		
		// Find the element
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		
		// Find the initial
		System.out.println(drag.getLocation());
		
		// Drag and drop by adjacent 
		// Actions !!
		Actions builder = new Actions(driver);
		
		// Remember this !! All actions need to end with method -> perform.
		builder.dragAndDrop(drag, drop).perform();
		
		// Point to remember: There is no exception thrown by Action !
		
		// Best practice: Verify
		System.out.println(drop.getText());

		

	}

}
