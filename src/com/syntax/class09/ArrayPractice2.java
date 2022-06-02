package com.syntax.class09;

public class ArrayPractice2 {
public static void main (String []args) {
	
	// Create an array of cars and store 6 elements into it
	// Using 2 different loops print all values from the array
	
	String[] cars = {"Honda", "Hyundai", "Ford", "Audi", "Chevrolet", "Buick"};
	
	for (String make:cars) {
		System.out.println(make);
	}
	
	System.out.println("-----ANOTHER WAY-------");
	
	for (int make = 0; make < cars.length; make++) {
		System.out.println(cars[make]);
	}
	
	System.out.println("-----Problem 2-------");
	/* Problem 2
	 * Create an array of animals and store 5 elements into it
	 * Using 2 different loops print all elements from the array
	 */
	
	String [] animals = {"cat", "dog", "zebra", "lion", "squirrel"};
	
	for (String types : animals) {
		System.out.println(types);
	}
	
	System.out.println("-----ANOTHER WAY-------");
	
	for (int types = 0; types < animals.length; types++) {
		
		System.out.println(animals[types]);
	}
	
	
	
	
	
	
}
}
