package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTable {

	public static void main(String[] args) throws InterruptedException {
		
		// We have to call WDM for the browser driver !!
		WebDriverManager.chromedriver().setup(); // verify the version, download, set up !
		
		// Launch the browser (chrome)
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL 
		driver.get("https://erail.in/");
			
		// Maximize the browser 
		driver.manage().window().maximize();
		
		// Type and TAB
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS", Keys.TAB);		
		
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("SBC", Keys.TAB);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		
		WebElement eleTrainName = driver.findElement(By.xpath("//a[text()='22502']/following::td[1]"));
		
		String name = eleTrainName.getText();
		System.out.println(name);
		
		
	}

}
