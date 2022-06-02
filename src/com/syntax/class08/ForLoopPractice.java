package com.syntax.class08;

public class ForLoopPractice {

	public static void main(String[] args) {

		// Print even numbers from 20 to 1 (2 ways)
		for (int c = 20; c >= 1; c -= 2) {
			System.out.print(c + " ");
		}

		System.out.println();

		for (int d = 20; d >= 1; d--) {
			if (d % 2 == 0) {
				System.out.print(d + " ");
			}
		}

		System.out.println();

		// Print odd numbers between 20 to 50 (2 ways)
		for (int f = 21; f <= 50; f += 2) {
			System.out.print(f + " ");
		}

		System.out.println();

		for (int e = 20; e <= 50; e++) {
			if (e % 2 == 1) {
				System.out.print(e + " ");
			}
			

		}
		}
	}
