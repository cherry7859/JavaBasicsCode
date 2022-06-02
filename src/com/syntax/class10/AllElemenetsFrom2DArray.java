package com.syntax.class10;

public class AllElemenetsFrom2DArray {

	public static void main(String[] args) {
		
		//print all elements
		
String[][] usa = {
				
				{"New York City", "Albany", "Buffalo"},
				{"Los Angeles", "San Francisco","San Jose", "San Diego","Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond", "Leesburg"}			
		};

//outer loop iterates over rows
//inner loop iterates over columns

for (int row = 0; row < usa.length; row++) {
	
	for (int column = 0; column < usa[row].length; column++) {
	
		System.out.print(usa[row][column]+" ");
	}
	System.out.println();
}

System.out.println("-----Print all values using for each loop-----");

for (String[] state:usa) {
	
	for (String city:state) {
		System.out.print(city+" ");
	}
	System.out.println();
	
	
}

	}

}
