package com.syntax.class01;

public class DataTypes {

	public static void main(String[] args) {
		
		//to create a variable: datatype AND name
		
		//whole numbers
		byte box1=21;	
		short box2=2022;	
		int box3=76666; //mostly will be used
		long box4=45678909876543L;//need "l" to denote it's long
		
		//decimal numbers
		float container=1.99F;//need "f" to denote it's a float
		double container2=89.99;

		// to represent 1 character
		char gender='m';//need single quotes for single character
		char dollar='$';
		
		//to represent true or false
		boolean hungry=true;
		boolean sleepy=false;
		
		//how to access values from variables?
		System.out.println(container2);//don't use " " to access variables
		
		//HW: Access and print values from all variables
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		System.out.println(container);
		System.out.println(gender);
		System.out.println(dollar);
		System.out.println(hungry);
		System.out.println(sleepy);
		
		int year=2022; //create a variable and store value
				System.out.println(year);
			year=2023; //value was changed, because variable had already been created
				System.out.println(year);
			
	}
}
