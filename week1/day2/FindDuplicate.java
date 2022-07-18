package week1.day2;

import java.util.Arrays;

public class FindDuplicate {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * Sort the given array
		 * Find the adjacent value and compare
		 * If same, print as duplicate
		 * 
		 */
		
		int[] nums = {8, 4, 13, 12, 8, 9, 4, 13, 6, 8};
		
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] == nums[i+1]) {
				System.out.println("Dups: "+ nums[i]);
			}
		}
		
	}

}
