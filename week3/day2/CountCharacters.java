package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountCharacters {
	
	
	public static void main(String[] args) {
		
		
		String companyName = "amazon india"; // O(n*n) = 1000*1000 
		// Not optimal to do nested for loops as it is time consuming ! 
		// a - 3, m -1, z - 1, o -1, n-2, d - 1, i -2 
		
		// Character -> Key !
		// Integer -> Value !
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		/*
		 * Convert String to character array
		 * loop through every character
		 * add the character to the map
		 * 
		 */
		
		/*
		char[] charArray = companyName.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char key = charArray[i];
			
			// check whether key is already available in map !
			if(map.containsKey(key)) { // update the key value count
				int value = map.get(key);
				map.put(key, value+1);
			} else { // create a new entry : key, 1
				map.put(key, 1);
			}
		}
		System.out.println(map); 
		*/
		
		char[] charArray = companyName.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);
		}
		System.out.println(map);
		
		// Print only one occurance character
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
		
		// find out max occuring character
		int maxOccurance = 0; // abcd
		char maxOccChar = 0;
		for (Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() > maxOccurance) {
				maxOccurance = entry.getValue();
				maxOccChar = entry.getKey();
			}
			
		}
		System.out.println("Max Occuring is "+maxOccChar+ " and by number of occurances as: "+maxOccurance);
	}

}
