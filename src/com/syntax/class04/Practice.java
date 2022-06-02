package com.syntax.class04;

public class Practice {

	public static void main(String[] args) {

		int num1 = 0;
		if (num1 > 0) {
			System.out.println("The number is positive.");
		} else if (num1 == 0) {
			System.out.println("The number is not positive or negative");
		} else {
			System.out.println("The number is negative.");
		}
		
		System.out.println("-----------------------------");
		
		boolean hasDiploma = true;
		double gpa = 3.6;

		if (hasDiploma == true) {
			System.out.println("Congratulations");
			if (gpa >= 3.5) {
				System.out.println("You are eligible for a scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("You should get a degree");
		}
		
		System.out.println("------------------------------");
		
		double mortgageRate = 4.5;
		int mortgagePrice = 45000;

		if (mortgageRate > 4.5) {
			System.out.println("We will not buy the house");
		} else {
			System.out.println("We will consider buying the house");
			if (mortgagePrice > 50000) {
				System.out.println("We will take out a loan");
		} 	else {
				System.out.println("We will pay cash for the house");
			}
		}
	}
}