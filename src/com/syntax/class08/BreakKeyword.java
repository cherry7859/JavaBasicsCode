package com.syntax.class08;

public class BreakKeyword {
public static void main(String[] args) {
	
	//break - breaks block of code; needs to be placed inside a condition "if"
	
	for (int a = 1; a <= 5; a++) {
		System.out.println("Hello");// 5 times
		
		//break; //will print "hello" once and then break out the loop
	}
	
	boolean summer = true;
	int temp = 95;
	while (summer) {
		System.out.println("It is hot");// infinite
		
		if (temp<70) {
			System.out.println("It isn't hot anymore");
			break; // will break code once temp is below 70
		}
		temp -= 10;
	}
	
	
}
}
