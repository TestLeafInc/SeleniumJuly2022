package week6.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer {

	int maxRetry = 0; // starting index
	
	public boolean retry(ITestResult result) {
		
		if(maxRetry < 1) {
			maxRetry++;
			return true; // retry will continue
		}
		
		return false; // false -> Retry will stop !
	}

}
