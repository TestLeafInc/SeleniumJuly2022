package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadData;

public class ProjectSpecificMethods {
	public String excelFileName = "";

	private static final ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<RemoteWebDriver>();

	// setter method for driver
	public void setDriver() {
		remoteWebDriver.set(new ChromeDriver());
	}

	public RemoteWebDriver getDriver() {
		return remoteWebDriver.get();
	}
	

	@DataProvider(name = "fetch", indices = { 0 })
	public String[][] fetchData() throws IOException {
		String[][] data = ReadData.readData(excelFileName);
		return data;
	}

	@BeforeMethod
	public void init() {
		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		//to initialize the driver
		setDriver();
		getDriver().get("http://leaftaps.com/opentaps");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterMethod
	public void closeBrowser() {
		getDriver().close();
	}

}
