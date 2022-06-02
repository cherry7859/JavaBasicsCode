package com.syntax.class08;

public class ForLoopIntro {

	public static void main(String[] args) {

		// I want to say GM 5 times

		for (int a = 1; a <= 5; a++) {
			System.out.println("Good Morning"); // the increment occurs after the execution happens once, then increment occurs before testing condition 
		}
		
		System.out.println("------------------------");
		
		for (int a = 1; a >= 5; a++) {
			System.out.println("How are you?"); // no output
		}
		
		System.out.println("------------------------");
		
		/*
		 * for (int a = 1; a <=5; a--) {
		 * 	System.out.println("Hello");//infinite
		 * }
		 */
		 }

	}


