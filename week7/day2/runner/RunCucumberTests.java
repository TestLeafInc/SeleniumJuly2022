package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefs.ProjectSpecificMethods;

@CucumberOptions(features = "src/test/java/features/Login.feature", 
				 glue = {"stepDefs","hooks"},
				 monochrome = true,
				 publish = true,
				 tags="@smoke"
				 )
public class RunCucumberTests extends ProjectSpecificMethods {

}
