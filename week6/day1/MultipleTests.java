package week6.day1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class MultipleTests {
	
	// ASCII order
	
	@Test(priority = 2)
	public void run() {
		
	}
	
	@Test(priority = -1)
	public void sleep() {
		
	}
	
	@Test(priority = 4)
	public void Walk() {
		
	}

}
