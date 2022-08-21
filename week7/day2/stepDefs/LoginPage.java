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

public class LoginPage extends ProjectSpecificMethods{
	
	@Given("Type the username as {string}")
	public void typeUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@And("Type the password as {string}")
	public void typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("Click on the Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Verify the home page is displayed")
	public void verifyHomePage() {
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		if(text.contains("Welcome")) {
			System.out.println("Home page is displayed");
		}else {
			System.err.println("Home page is not displayed");
		}
	}
	
	@But("Error message is displayed")
	public void verifyErrorMessage() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		System.out.println(text);
	}

	
	/*
	@Given("Type the username and password")
	public void readDataTable(DataTable data) {
	
		// To get all records in data table
		List<List<String>> asLists = data.asLists();
		System.out.println(asLists);
		
		// to get particular row by index (0)
		List<String> row = data.row(1); // 1 -> if you have header
		System.out.println(row);
		
		// Using a Map only when the index of the column is unknown
		List<Map<String, String>> asMaps = data.asMaps();
		System.out.println(asMaps);
		
		// Just print the second username
		String secondUserName = asMaps.get(1).get("username");
		System.out.println(secondUserName);
		
	}
	*/
	
	
	
	
	
	
	
	
}
