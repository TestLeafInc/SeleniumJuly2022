package week1.day2;

public class IsPrime {
	
	/*
	 * we need find, if given number is prime or not 
	 * 
	 * 1) Declare a input 
	 * 2) loop through 2 --> n
	 * 3) Divide the input with the i -
	 * 		a) if the remainder is 0 (not a prime)
	 * 		b) if it is not divisible by any number --> primt
	 * 
	 */
	
	// = -> assignment 
	// == -> comparison
	
	public static void main(String[] args) {
		
		// 1) Declare a input 
		int n = 13;
		boolean bPrime = true;
		
		// 2) loop through 2 --> n
		for (int i = 2; i < n; i++) {
			if(n % i == 0) {
				System.out.println("This is not prime");
				bPrime = false;
				break;
			} 
		}
		
		if(bPrime) {
			System.out.println("This is prime");
		}
		
		
		
	}

}
