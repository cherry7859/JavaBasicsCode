package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		int x = 10;
		
		x = x + 1;
		x += 1; // these are exactly the same
		
		System.out.println(x); //12
		
		x++; //increments value of a variable by 1
		System.out.println(x); //13
		
		x--; //decrements value of variable by 1
		System.out.println(x); //12
		
		// only works with variables, not direct numbers
		
		int num = 100;
		num++;
		System.out.println(num); // 101
		

	}

}
