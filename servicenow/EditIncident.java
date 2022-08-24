package servicenow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class EditIncident {
	public static void main(String[] args) {
		
		//1. Launch ServiceNow application
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev111725.service-now.com/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. Login with valid credentials username and password 
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Xk/9QvNi/0iL");
		driver.findElement(By.id("sysverb_login")).click();
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		
		//3. Click All
		shadow.findElementByXPath("//div[@id='all']").click();
		
		//4.Click  Incidents in Filter navigator
		shadow.findElementByXPath("//span[text()='Incidents']").click();
		WebElement eleFrame= shadow.findElementByXPath(("//iframe[@title='Main']"));
		driver.switchTo().frame(eleFrame);
		
		//4. Search for the existing incident and click on the incident
		driver.findElement(By.xpath("//th[@name='number']/following::td[@class='linked formlink']")).click();
		
		//5. Update the incident with Urgency as High and State as In Progress
		WebElement eleCallerID = driver.findElement(By.id("sys_display.incident.caller_id"));
		eleCallerID.clear();
		eleCallerID.sendKeys("abel",Keys.TAB);

		WebElement eleShortDesc = driver.findElement(By.id("incident.short_description"));
		eleShortDesc.clear();
		eleShortDesc.sendKeys("Edited Via Automation");
		driver.findElement(By.xpath("//button[text()='Update']")).click();	
		
		//6. Verify the update information is available in the incident
		
	}
}
