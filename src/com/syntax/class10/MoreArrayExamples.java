package com.syntax.class10;

public class MoreArrayExamples {

	public static void main(String[] args) {
		
		int[][] nums = {{1, 2, 3, 4, 5}, {199, 300, 588, 700}, {1900, 4578, 98787}};

		for (int a = 0; a < nums.length; a++) {
			
			for (int b = 0; b <nums[a].length; b++) {
				System.out.print(nums[a][b]+" ");
			}
			System.out.println();
}
		
		System.out.println("-----All values using enhanced for loop------");
		/*
		 * enhanced for loop uses variables to access elements from an array
		 * outer loop --> iterates over 1D arrays
		 * inner loop --> iterates over elements of each 1D array
		 */
	
		for (int[] num:nums) {
			for (int n:num) {
				System.out.print(n+" ");
					
				}
			System.out.println();
			}
		}
	}

