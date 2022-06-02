package com.syntax.class02;

public class ArithmeticOperators {
	
	public static void main(String[] args) {
		
	int num1=10;
	int num2=20;
	
	int sum, sub, mult, div;
	
	System.out.println(num2*num1);
	
	sum=num1+num2;
	System.out.println(sum);
	
	sub=num2-num1;
	System.out.println(sub);
	
	double num3=9.99;
	double num4=3.50;

	//sum=num3+num4; won't work because sum is an integer type
	double sum1=num3+num4;
	System.out.println(sum1);//13.49
	
	int a=10;
	int b=3;
	int result=a/b;//=3.33333, but result will just be 3, to make an integer. Cuts it, not rounded
	
	double c=10.0;
	double d=3.0;
	
	double result2=c/d;
	System.out.println(result2);//=3.333...5; accuracy up to 15 decimals
	
	float e=10.0f;
	float f=3.0f;
	float result3=e/f;
	System.out.println(result3);//=3.3333333; accuracy up to 6 decimals	
	
	}
}
