package com.syntax.class08;
import java.util.Scanner;
public class KeywordPractice {
public static void main(String[] args) {
	
	//Print numbers from 1 to 50, except those that are divisible by 3
	
	for (int a = 1; a <= 50; a++) {
		if (a%3==0) {
			continue;
		}
		System.out.print(a+" ");
	}
	System.out.println();
	
	//Create a program that will keep asking user to apply for a credit card. 
	//As soon as you get "yes" from user, program should stop asking
	
	Scanner obama = new Scanner(System.in);
	String answer = null;
	
	do {
		System.out.println("Would you like to apply for a credit card?");
		answer = obama.next();
		
		if (answer.equalsIgnoreCase("yes")) {
			break;
	} }while (answer.equalsIgnoreCase("no")); {
		}
	obama.close();
}
}
	


