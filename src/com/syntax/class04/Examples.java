package com.syntax.class04;

public class Examples {

	public static void main(String[] args) {

		boolean mothersDay = true;
		if (mothersDay) {
			System.out.println("Happy Mother's Day!");
		} else {
			System.out.println("Good Morning!");
		}

		System.out.println("----------------------");

		boolean vaccine = true;
		int dose = 1;

		if (vaccine) {
			System.out.println("How many doses do you have?");
			if (dose < 2) {
				System.out.println("You need 1 more dose");
			} else {
				System.out.println("You are fully vaccinated");
			}
		} else {
			System.out.println("You need to get vaccinated");
		}

		System.out.println("------------------------");

		String month = "June";
		int day = 19;

		if (month.equals("May")) {
			System.out.println("Let me check what is today's date");
			if (day == 8) {
				System.out.println("Today is Mother's Day");
			}
		} else if (month.equals("June")) {
			System.out.println("Let me check what is today's date");
		}
		if (day == 19) {
			System.out.println("Today is Father's Day");
		}
	}
}
