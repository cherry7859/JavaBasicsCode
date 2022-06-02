package com.syntax.class10;

public class ArrayPractice3 {
public static void main (String[] args) {
	
	//from an array of integer elements find the largest number
	
	int[] num = {659, 754, 10909, 43, 11909}; 
	int max = 0;
	
	for (int num1 = 0; num1 < num.length; num1++) {
		if (num[num1] > max) {
			max = num[num1];
		}
	}
		System.out.println(max + " is the largest number");
		
		System.out.println("-----ANOTHER WAY------");
		
		max = num[0];
		
		for (int num1 : num) {
			if (num1 > max) {
				max = num1;
			}
		}
		System.out.println(max+" is the largest number");
		
		System.out.println("-----PROBLEM 2------");
		//Create an array to store char values and then print those in reverse order
		
		char[] values = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		for (int all = values.length - 1; all >= 0; all--) {
			
			System.out.print(values[all] + " ");
			
		}
	
}
}
