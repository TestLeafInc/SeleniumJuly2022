package week1.day2;

public class LearnString {
	
	public static void main(String[] args) {
		
		// String literal
		String companyName = "TestLeaf";
		
		// String Object
		String company = new String("testLeaf");
		
		/*
		 * 
		 * length() -> to find how many characters  --> int 
		 * toCharArray() -> convert String to character array -> char[]
		 * equals("") -> to compare String content -> boolean (equalIgnoreCase)
		 * contains("") -> compare the String with matching content -> boolean
		 * indexOf('c') -> will return the index position of the given character -> int 
		 * charAt(i) -> character available in the given position -> character
		 * 
		 */
		
		int length = companyName.length();
		System.out.println("The length of the string is : "+length);
		
		char[] chars = companyName.toCharArray();
		System.out.println(chars);
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
		
		boolean isMatches = companyName.equalsIgnoreCase(company);
		System.out.println(isMatches);
		
		System.out.println(companyName == company);
		
		
		boolean contains = companyName.contains("Test");
		System.out.println("Does it have Test word? "+contains);
		
		
		char third = companyName.charAt(2);
		System.out.println(third);
		
		
		int indexOf = companyName.indexOf('w'); // Test
		System.out.println(indexOf);
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
