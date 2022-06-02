package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {

//>,<,>=,<=,==,!=

		int num1 = 20;
		int num2 = 22;

		System.out.println(num1 > num2);// false
		System.out.println(num1 < num2);// true
		System.out.println(num1 != num2);// true

		System.out.println(num1 == num2);// compare
		System.out.println(num1 = num2);// assign

		boolean result = 100 > 200; // false, boolean value b/c relational operator
		int result1 = 100 + 200;// 3; int b/c arithmetic operator
	}
}
