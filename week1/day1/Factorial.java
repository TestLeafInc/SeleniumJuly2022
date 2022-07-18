package week1.day1;

public class Factorial {
	
	public static void main(String[] args) {
		
		// find the factorial 
		int n = 100;
		int fact = 1;
		
		// loop through
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
		
	}

}
