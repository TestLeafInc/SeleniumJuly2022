package week1.day2;

public class CharCount {
	
	/*
	 * 2 input
	 * 
	 * String, char
	 * 
	 * 1) Convert to char array
	 * 2) loop through every char
	 * 3) compare and count
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		String str = "amazon dEvelopment center";
		char ch = 'e';
		int count = 0;
		
		char[] charArray = str.toLowerCase().toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == ch) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
