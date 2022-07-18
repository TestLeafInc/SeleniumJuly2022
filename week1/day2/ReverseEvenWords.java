package week1.day2;

public class ReverseEvenWords {
	
	/*
	 * Hello this is me --> Hello siht is em
	 * 
	 * 1) Convert the String into words[] 
	 * 2) Check if the word is odd or even index
	 * 3) even if it even index -> reverse the string 
	 * 4) finally print 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		String str = "Hello this is me";
		
		String[] words = str.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			if(i%2 != 0) { // this is even
				char[] charArray = words[i].toCharArray();
				for (int j = charArray.length-1; j >= 0 ; j--) {
					System.out.print(charArray[j]);
				}
			} else {
				System.out.print(words[i]);
			}
			System.out.print(" ");
			
		}
		
		
		
	}
	
	

}
