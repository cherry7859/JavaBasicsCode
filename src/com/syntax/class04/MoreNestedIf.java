package com.syntax.class04;

public class MoreNestedIf {
public static void main(String[] args) {
	
	/* We need to check if replit was completed 
	 * If replit is completed, we want to see
	 * 	If you did 15 or more --> great job
	 * 	If you did more than 10 --> good
	 * 	If you did less than 10 --> Try to complete all assignments
	 */
	
	boolean didReplit = false;
	int assignments;
	
	if (didReplit) {
		System.out.println("How many assignments have you done?");
		
		assignments = 8;
		
		if (assignments > 15) {
			System.out.println("You did a great job");
		}else if (assignments >10) {
			System.out.println("You did a good job");
		}else {
			System.out.println("Please complete all replit assignments");
		}
	
	} else {
		System.out.println("You should complete your homework");
	}
}
}
