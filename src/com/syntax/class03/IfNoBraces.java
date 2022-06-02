package com.syntax.class03;

public class IfNoBraces {

	public static void main(String[] args) {
		
		
		String time="Morning";
		
		if(time.equals("Morning")) 
			System.out.println("Say Good Morning");
		 else 
			System.out.println("Say Good Day");
			System.out.println("Or say Good Evening");
		
		System.out.println("Make sure to use {} with if statement");
		
	}
	
}
// Without Braces Java can only identify one statement per block