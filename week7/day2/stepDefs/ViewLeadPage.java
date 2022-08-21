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

public class ViewLeadPage extends ProjectSpecificMethods{
	
	@Then("Verify the View Leads Page")
	public void verifyViewLeads() {
		String title = driver.getTitle();
		if(title.contains("View Leads")) {
			System.out.println("Got It !!");
		}
	}
	
	@And("Click Edit Lead Link")
	public void clickEditLeadLink() {
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@Given("Click Delete Lead Link")
	public void clickDeleteLink() {
		driver.findElement(By.linkText("Delete")).click();
	}
	
	@Then("Verify company name contains as (.*)$")
	public void verifyCompanyName(String companyName) {
		String company = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(company.contains(companyName)) {
			System.out.println("Got It !!");
		}
	}
	
}
