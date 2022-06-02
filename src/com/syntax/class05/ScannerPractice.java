package com.syntax.class05;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {

		Scanner obama = new Scanner(System.in);

		System.out.println("Please enter your name");
		String name = obama.next(); // capture String; nextLine() allows to capture whole string, spaced included
		System.out.println(name);

		System.out.println("Please enter your age");
		int age = obama.nextInt(); // capture int
		System.out.println(age);

		System.out.println("Please enter price");
		double price = obama.nextDouble(); // capture double
		System.out.println(price);

		System.out.println("Please enter boolean");
		boolean boo = obama.nextBoolean(); // capture boolean
		System.out.println(boo);

		System.out.println("Please enter any character");
		char character = obama.next().charAt(0);// capture char, the "0" is which character will be captured. Ex: J(0)
												// O(1) H(2) N(3)
		System.out.println(character);
	}

}
