package com.syntax.class09;

public class Review {
public static void main (String []args) {
	

	// Nested Loop Review
	for (int a = 1; a <= 5; a++) {
		System.out.println("Hello");//5
		
		for (int b = 1; b <= 3; b++) {
			System.out.println("Bye");//15
		}
	}
	
	for (int a = 1; a <= 5; a--) {
		System.out.println("Hello");// infinite loop
		
		for ( int b = 1; b <= 3; b ++) {
			System.out.println("Bye");//3
		}
	}
	
	for (int a = 1; a <=5; a++) {
		System.out.println("Hello");//1
		
		for (int b = 1; b <=3; b--) {
			System.out.println("Bye");// Infinite loop
		}
	}
	
	for ( int a = 1; a <= 5; a++) {
		System.out.println("Hello");//1
		
		for (int b = 1; b <= 3; b++) {
			System.out.println("Bye");//3
		}
		break; // placed inside outer loop, but inner loop is able to complete cycle
	}
	
	for (int a = 1; a <= 5; a++) {
		System.out.println("Hello");//5
		
		for (int b = 1; b <= 3; b++) {
			System.out.println("Bye");//5
			break;// break occurs in inner loop, keeps b = 1 as long as outer loop is true
		}
	}
	
	/*
	 * for (int a = 1; a <= 5; a++) {
	 * System.out.println("Hello");// 5
	 * 	for (int b = 1; b <=3; b++) { // runs 15 times, no output
	 * 		continue; // skips over the output, sends back to beginning of inner loop
	 * System.out.println("Bye"); // 0
	 * }
	 * }
	 */
}
}
