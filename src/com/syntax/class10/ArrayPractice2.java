package com.syntax.class10;



public class ArrayPractice2 {
public static void main (String []args) {
	

	//from an array of integer elements find the largest number
	int[] num = {20, 75, 68, 54, 43}; 
	int max = num[0];//gives us something to compare to

	for (int a = 1; a < num.length; a++) {
		if (num[a] > max) {
			max = num[a];
		}
	}
	System.out.println("The largest element is "+max);
	//another way to solve
	max = num[0];
	
	
	
	
	//create an array to store char values 
	//and then print them in reverse order
	//can't do enhanced for loop for reverse order
	char[] letter = {'A', 'B', 'C', 'D'};
	
	for (int a = letter.length - 1; a >= 0; a--) {
		System.out.println(letter[a]+" ");
	}

}
}
