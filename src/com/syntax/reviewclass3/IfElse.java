package com.syntax.reviewclass3;

public class IfElse {
public static void main(String[] args) {
	
	String user = "Asghar";
	String password = "pass123";
	/*
	 * when we use primitive data types: byte, short, int, long, float, char, boolean
	 * 		use ==
	 * when we use non-primitive datatypes (like String) 
	 * 		use .equals method
	 */
	
	if(user == "Asghar" && password.equals(password)) {
		System.out.println("Welcome back to Syntax");
	}else {
		System.out.println("username or password is not correct");
	}
	
}
}
