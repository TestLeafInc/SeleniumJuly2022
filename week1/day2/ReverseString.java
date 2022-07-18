package week1.day2;

public class ReverseString {

	/*
	 * 
	 * Convert the String to characters, 
	 * get the characters in reverse order and 
	 * print every character without white space.
	 * 
	 */
	
	public static void main(String[] args) {
		
		String str = "amazon";
		
		char[] charArray = str.toCharArray();
		
		for (int i = charArray.length-1; i >= 0 ; i--) {
			System.out.print(charArray[i]);
		}

		
	}

}
