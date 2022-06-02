package com.syntax.class10;

public class AnotherWayof2DArray {

	public static void main(String[] args) {
		
		//create 2D array of states
		
		/*
		 * 1 array --> NY --> all cities of NY
		 * 2 array --> CA --> all cities of CA
		 * 3 array --> FL --> all cities of FL
		 * 4 array --> VA --> all cities of VA
		 */
		
		String[][] usa = {
				
				{"New York City", "Albany", "Buffalo"},
				{"Los Angeles", "San Francisco","San Jose", "San Diego","Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond", "Leesburg"}			
		};
		System.out.println(usa[1][2]);//San Jose
		System.out.println(usa[2][0]);//Miami
		System.out.println(usa.length);//4 = total number of 1d arrays
		
		//I want to see how many elements inside my 1st array 
		int elem1array = usa[0].length; 
		
		
	}

}
