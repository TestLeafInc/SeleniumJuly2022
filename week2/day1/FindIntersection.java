package week2.day1;

public class FindIntersection {

	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */
	
	public static void main(String[] args) {
		
		int[] nums1 = {3,2,11,4,6,7};
		int[] nums2 = {1,2,8,4,9,7};
		
		int count = 0;

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if(nums1[i] == nums2[j]) {
					System.out.println(nums1[i]);
					count++;
				}
			}
		}
		

	}

}
