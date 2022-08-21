package week6.day2;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	
	RemoteWebDriver driver;
	String excelFileName = "";
	String browserName = "chrome";
	static WebDriverWait wait;	
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void setup(String url, String username, String password) {
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup(); // verify the version, download, set up !
			driver = new ChromeDriver();
		}else if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup(); // verify the version, download, set up !
			driver = new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();

	}

	@DataProvider(name="fetch", indices = {0})
	public String[][] fetchData() throws IOException {
		
		String[][] data = ReadData.readData(excelFileName);
		return data;
	}
	

}
