package week1.day2;

public class Fibbinocci {
	
	/*
	 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 !! 
	 * 
	 * 1) Create 3 variables -- firstNum, secNum, sum 
	 * 2) Loop through from 0 to 11.
	 * 3) Sum the last 2 values and swap the values
	 * 4) Print the series (sum)
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		// 1) Create 3 variables -- firstNum, secNum, sum 
		int firstNum = 0, secNum = 1, sum = 0;
		
		
		System.out.print(firstNum+" ");
		System.out.print(secNum+" ");

		// 2) Loop through from 0 to 11.
		for (int i = 0; i < 9; i++) {
			
			// Sum the last 2 values and swap the values
			sum = firstNum + secNum;
			firstNum = secNum; // 0 <- 1
			secNum = sum; // 1 <- 2
			
			System.out.print(sum+" ");
			
		}
		
		
	}

}
