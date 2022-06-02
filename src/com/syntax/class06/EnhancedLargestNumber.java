package com.syntax.class06;

public class EnhancedLargestNumber {
public static void main(String[] args) {
	
	int num1 = 20;
	int num2 = 20;
	int num3 = 20;
	
	int largest = 0; // declare variable, to cover if all numbers equal, will go to line 18
	
	if (num1 > num2 && num1 > num3) {
		largest = num1;// reassign "largest" variable if the condition is true
	} else if (num2 > num1 && num2 > num3) {
		largest = num2;
	}else if (num3 > num1 && num3 > num2) {
		largest = num3;
	} else {//if all numbers even, must include "else" statements for a condition to be met 
		System.out.println("All numbers are equal");
	}
	if (largest!= 0) {// b/c largest still equal 0, this statement is false
	System.out.println("The largest number is "+ largest);}
	
	/* compiler can initialize variables to it's default values
	 * int -> 0
	 * double -> 0.0
	 * boolean -> false
	 * String -> null
	 */
}
}
