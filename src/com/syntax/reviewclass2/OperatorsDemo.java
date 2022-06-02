package com.syntax.reviewclass2;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Operators in Java
		 *Arithmetic Operators: +, -, /, *, %
		 *	Shorthand: +=, -=, *=, /=, %=
		 *Relational & Equality Operators: ==, !=, >=, <=, <, >
		 */
		int num = 10;
		int num2 = 10;
		
		System.out.println(num+num2);
		System.out.println(num>=num2); //num>num2=>t f+t=t
		//whole 0-infinity Negative infinity to Positive infinity
		System.out.println(Long.MAX_VALUE); //Gives us the maximum range
		System.out.println(Long.MIN_VALUE); //Gives us the minimum range
		// works for everything except integer and char
		System.out.println(num/num2); // Answer: 1
		System.out.println(num%num2);// Answer: Remainder 0
		System.out.println(10.0/3);// Widening, converts integer 10 to double
	}

}
