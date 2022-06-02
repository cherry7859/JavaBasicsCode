package com.syntax.class02;

public class Variables {
	
	public static void main(String[] args) {
		
		String studentName="Denaro";
		String studentLastName="McKenzie";
		int grade=95;
		String city="Houston";
		String state="Texas";
		String phoneNumber="281-555-0855";
System.out.println("My name is "+studentName);
System.out.println("I am A/B student");
System.out.println("I live in "+city+", "+state);
System.out.println("And my phone number is "+phoneNumber);

city="Atlanta";
state="Georgia";
phoneNumber="657-583-8976";
grade=73;
System.out.println("My name is "+studentName);
System.out.println("I moved to "+city+", "+state);
System.out.println("My new phone number is "+phoneNumber);
System.out.println("My grade is now "+grade);


/*
 * Rules for identifiers
 * 1. no space
 * 2. no keywords
 * 3. cannot start with numbers, but can contain
 * 4. cannot have with special character (except _ and $)
 */

//String break="Hello"; results in error b/c "break" is a JAVA keyword
//int 1number=10; results in error b/c num before name
int number1=10;

//int num%=20; error b/c symbol
double $price=3.99;
float f_=2.09f;

/*
 * Naming Conventions:
 * follow camel casing
 * packages, methods, and variable names should start with lowercase then follow camelcasing
 * class names should start with uppercase
 * cannot contain space
 */
String myCity="Tysons";

	}

}
