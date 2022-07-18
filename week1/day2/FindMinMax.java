package week1.day2;

import java.util.Arrays;

public class FindMinMax {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * Sort the given array
		 * Find the first element using index 0 -> min
		 * Find the last element using length-1 -> max
		 * 
		 */
		
		int[] nums = {22, 3981, -19, 82, 0, 45, 37};
		
		//Arrays.sort(nums);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if(min > nums[i]) {
				min = nums[i];
			}
			if(max <nums[i]) {
				max = nums[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		//System.out.println("The min is "+nums[0]);
		//System.out.println("The min is "+nums[nums.length-1]);
		
		
		
		
	}

}
