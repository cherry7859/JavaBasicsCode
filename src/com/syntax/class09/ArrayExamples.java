package com.syntax.class09;

public class ArrayExamples {
public static void main (String[]args) {
	
	//I want to store prices in array
	
	double[] price = new double[4];//this determines what size array will be; fixed
	
	price[0] = 1.99;
	price[1] = 2.99;
	price[2] = 3.99;
	price[3] = 4.99;
	
	System.out.println(price[3]);
	
	System.out.println("SHORTER WAY TO CREATE ARRAY:");
	
	String[] fruits = {"Mango", "apple", "kiwi", "pear"};
	
	System.out.println("My favorite fruit is "+fruits[0]);
	
	// I want to find the size of an array; how many elements?
	
	int size=fruits.length;// "length" tells Java to give us the size of fruits variable
	System.out.println(size);//4
}
}
