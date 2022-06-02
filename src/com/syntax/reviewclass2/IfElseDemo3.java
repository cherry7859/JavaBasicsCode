package com.syntax.reviewclass2;

import java.util.Scanner;// Don't forget to import!

public class IfElseDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obama=new Scanner(System.in); //allows you to take the input from the keyboard, makes interactive
		System.out.println("Please enter your Account Balance");
		double accountBalance=obama.nextDouble();
		System.out.println("Please enter the amount that you would like to lend to your friend");
		double amountToLend=obama.nextDouble(); //Don't need .nextLn for enter key b/c going from same dataype to same
		
		if (accountBalance>=amountToLend) {
			System.out.println("Yes I can help you");
		} else {
			System.out.println("Sorry, I don't have enough money");
		}
	}
}
