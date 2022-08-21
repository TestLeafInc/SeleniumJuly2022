package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadPage extends ProjectSpecificMethods{
	
	
	@And("Change the existing company name (.*)$")
	public void changeCompanyName(String companyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
	}
	
	@And("Click Update Button")
	public void clickUpdate() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	
	

}
