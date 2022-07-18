package week1.day2;

import java.util.Arrays;

public class IsAnagram {
	
	/*
	 * 
	 * String str1 = "hello";
	 * String str2 = "eolhl";
	 * 
	 * Psuedocode:
	 * 
	 * 1) Convert to character array
	 * 2) compare both arrays !!
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "eolhh";
		boolean bAnagram = true;
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for (int i = 0; i < ch2.length; i++) {
			if(ch1[i] != ch2[i]) {
				System.out.println("Not anagram");
				bAnagram = false;
				break;
			}
		}
		
		if(bAnagram)
			System.out.println("They are anagram");
		
	}

}
