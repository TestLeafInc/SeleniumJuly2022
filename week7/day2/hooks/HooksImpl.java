package hooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import stepDefs.ProjectSpecificMethods;

public class HooksImpl extends ProjectSpecificMethods {
	
	@Before // @BeforeMethod
	public void beforeScenario() {
		System.out.println("This is before running any scneario");
	}
	
	@After // @AfterMethod
	public void afterScenario() {
		System.out.println("This is after running every scenario");
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("This is before starting every step");
	}

	@AfterStep
	public void takeSnap() throws IOException {
		 System.out.println("I am going to take a snap");
		 File source = driver.getScreenshotAs(OutputType.FILE); // limitation : take snapshot of viewable port
		 
		 File dest = new File("snap"+i+".png");
		 FileUtils.copyFile(source, dest);
		 i++;
	}
	
	@BeforeAll
	public static void beforeSuite() {
		System.out.println("Before all the feature files");
	}
	
	@AfterAll
	public static void afterSuite() {
		System.out.println("after all the feature files");
	}
}
