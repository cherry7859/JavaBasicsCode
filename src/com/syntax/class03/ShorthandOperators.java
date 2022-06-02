package com.syntax.class03;

public class ShorthandOperators {
	public static void main(String[] args) {

		int num = 100;
		num = num + 100; // adding on to the variable "num"
		System.out.println(num); // 200

		num = num + 50;
		System.out.println(num);// 250

		num += 100; // Shorthand way of adding 100 and assigning to same variable= num=num+100
		num -= 10; // num=num-10
		System.out.println(num);// 340

		num /= 10; // 34
		num *= 2; //
		System.out.println(num);// 68

		num %= 2;
		System.out.println(num);// 0

		int a = 10;
		int b = 20;
		int c = 30;

		a += b;// 30
		a += b + c;// 80 b/c Line 28=30
		a *= 10;// 800 b/c Line 29=80
		System.out.println(a);

	}
}
