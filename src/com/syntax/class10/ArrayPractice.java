package com.syntax.class10;

public class ArrayPractice {
public static void main (String []args) {
	
	String[] disney = {"Elsa", "Shrek", "Goofy", "Mulan", "Tom&Jerry"};
	
	System.out.println("------All elements using regular for loop-------");
	
	for (int a = 0; a < disney.length; a++) {
		
		if (disney[a].equalsIgnoreCase("Shrek")) {
			System.out.println(disney[a]+" is my favorite character");
		} else {
			System.out.println(disney[a]);
		}
	}
	System.out.println("------All elements using enhanced for loop-------");
	
	for (String character : disney) {
		
		if (character.equalsIgnoreCase("Mulan")) {
			continue;// skips over Mulan, then finishes rest of outer loop
			//break; // would skip Mulan and every value after
		} else {
			System.out.println(character+" ");
		}
	}
	
}
}
