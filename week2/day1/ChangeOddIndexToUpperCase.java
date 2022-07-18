package week2.day1;

public class ChangeOddIndexToUpperCase {
	
	/*
	 Pseudo Code
	 
	 * Declare String Input as Follow
	  
	 * String test = "changeme";
	 
	 * a) Convert the String to character array
	 
	 * b) Traverse through each character (using loop)
	 
	 * c)find the odd index within the loop (use mod operator)
	 
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	  
	 */


	public static void main(String[] args) {
		
		String test = "changeme";
		String output = "";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(i%2 == 0) {
				output = output + Character.toUpperCase(charArray[i]);
			}else {
				output = output + charArray[i];
			}
		}
		System.out.println(output);

	}

}
