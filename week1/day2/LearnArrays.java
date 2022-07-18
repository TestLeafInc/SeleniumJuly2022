package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		//int[] scores = new int[5];
		
		int[] scores = {80, 82, 78, 92, 79,80, 82, 78, 92, 7980, 82, 
				78, 92, 79,80, 82, 78, 92, 7980, 82, 78, 92, 7980, 82, 78, 
				92, 7980, 82, 78, 92, 7980, 82, 78, 92, 79,80, 82, 78, 92, 
				79,80, 82, 78, 92, 7980, 82, 78, 92, 79,80, 82, 78, 92, 2001, 20012};
		
		int length = scores.length;
		System.out.println("The count is: " +length);
		
		// read the first value
		System.out.println("The first score is: "+scores[0]);
		
		// read the last value
		System.out.println("The last score is: "+scores[length-1]);
		
		// goal : find out how many 78 is available !!
		
		/*
		 * declare the value you want to find !
		 * 
		 * loop through every array item 
		 * if the array item matches the expected value
		 * increment the counter
		 * 
		 * finally, print the count
		 * 
		 */
				
		int num = 78;
		int count = 0;
		
		Arrays.sort(scores); // whenever you want data to be in ascending order
		
		for (int i = scores.length-1; i >=0 ; i--) {
			System.out.println(scores[i]);
		}
		
		/*
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			if(scores[i] == num) {
				count++;
			}
			
		}
		System.out.println("The number of occurances "+count);
		*/
		
		
		
		
		
		
		
		
	}

}
