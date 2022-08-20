package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefs.ProjectSpecificMethods;

@CucumberOptions(features = "src/test/java/features", 
				 glue = "stepDefs",
				 monochrome = true,
				 publish = true)
public class RunCucumberTests extends ProjectSpecificMethods {

}
