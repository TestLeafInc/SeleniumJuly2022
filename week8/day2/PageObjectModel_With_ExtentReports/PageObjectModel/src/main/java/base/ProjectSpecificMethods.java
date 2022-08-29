package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadData;

public class ProjectSpecificMethods {
	public String excelFileName = "";
	private static final ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<RemoteWebDriver>();
	public static ExtentReports extent;
	public static ExtentTest test, node;
	
	public String testName, testDescription, testAuthor, testCategory; //null
	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	@BeforeClass
	public void testCaseDetails() {
		test = extent.createTest(testName, testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);
	}
	
	public int takeSnap() throws IOException {
		int ranNum = (int) (Math.random()*999999+1000000);
		
		File source = getDriver().getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/img"+ranNum+".png"); //img434234.png
		FileUtils.copyFile(source, target);
		
		return ranNum;
	}	
		
	public void reportStep(String stepDesc, String status) throws IOException {
		
		int ranNum = takeSnap(); //will execute takeSanp()
		MediaEntityModelProvider img = null;
		try {
			img = MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+ranNum+".png").build();
		} catch (IOException e) {
			
		}
		
		if(status.equalsIgnoreCase("pass")) {
			node.pass(stepDesc, img);
		}else if(status.equalsIgnoreCase("fail")) {
			node.fail(stepDesc,img);
			throw new RuntimeException("Look into the report for more details");
		}

	}
	
	
	
	
	
	
	@AfterSuite
	public void stopReport() {
		extent.flush();
	}

	// setter method for driver
	public void setDriver() {
		remoteWebDriver.set(new ChromeDriver());
	}

	public RemoteWebDriver getDriver() {
		return remoteWebDriver.get();
	}

	@DataProvider(name = "fetch")
	public String[][] fetchData() throws IOException {
		String[][] data = ReadData.readData(excelFileName);
		return data;
	}

	@BeforeMethod
	public void init() {
		
		node = test.createNode(testName);

		WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		// to initialize the driver
		setDriver();
		getDriver().get("http://leaftaps.com/opentaps");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void closeBrowser() {
		getDriver().close();
	}

}
