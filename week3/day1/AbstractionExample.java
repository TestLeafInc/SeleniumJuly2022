package week3.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AbstractionExample {

	public static void main(String[] args) {

		// Browser ! - 13 methods !
		WebDriver driver = new ChromeDriver();
		driver.close();

		// Browser ! - 13 methods !
		RemoteWebDriver driver1 = new ChromeDriver();
		driver1.switchTo(); 

		// Browser ! - 13 methods !
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get(null);




	}

}
