package com.syntax.class08;

public class NestedLoopExamples {
public static void main(String[] args) {
	
	for (int a = 1; a <= 3; a++) { 
		
		for (int b = 1; b <=2; b++) {  
			
			System.out.println(a+" "+b);											
		}
	}
	
	System.out.println("-----------------------------------------");
	
	for (int a = 1; a <= 3; a++) {
		
		System.out.println("Hello");
		
		for (int b = 1; b >= 2; b++) {
			
			System.out.println("Bye");
		}
	}
	
	System.out.println("-----------------------------------------");
}
}
