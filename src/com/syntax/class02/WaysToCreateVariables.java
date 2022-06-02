package com.syntax.class02;

public class WaysToCreateVariables {

	public static void main(String[] args) {
	
		/* 
		 * 1st way to create a variable
		 * dataType AND name = value
		 */
		
		int temperature=60;
		
		/*
		 * 2nd way is done in 2 steps
		 * create a variable (DataType AND name)
		 * assign the value
		 * Useful when you know you need the container but don't know the value yet
		 */
		
		int sum;//create/declare a variable
		sum=30;//assign the value
		System.out.println(sum);
		sum=50;//reassign the value
		
		int num1, num2, num3;//created 3 integer variables
		num1=10;
		num2=20;
		num3=30;
		
		System.out.println(sum);//50

	}
}
