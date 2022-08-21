package stepDefs;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	@And("Click Create Leads Link")
	public void clickCreateLeadsLink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@And("Click Find Leads Link")
	public void clickFindLeadsLink() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@And("Click Merge Leads Link")
	public void clickMergeLeadsLink() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	
}
