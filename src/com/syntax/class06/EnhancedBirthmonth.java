package com.syntax.class06;

import java.util.Scanner;

public class EnhancedBirthmonth {
	public static void main(String[] args) {

		Scanner obama = new Scanner(System.in);

		System.out.println("In what month were you born?");
		String month = obama.next();
		
		String season;

		if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season = "winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "spring";
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "fall";
		} else {
			season = "Invalid";
		}
		if (!season.equals("Invalid")) {
			System.out.println("You were born in"+season);
		}
}
}