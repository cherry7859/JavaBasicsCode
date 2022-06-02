package com.syntax.class08;

public class ForLoopsTask {
public static void main(String[] args) {
	
	//Print sum of all odd and even numbers from 1 to 70
	int sum1 = 0;
	
	for (int a = 1; a <=70; a++) {
		if ( a%2 == 0) {
			sum1 +=a;
		}
	} System.out.println("Sum of all even = "+ sum1);
	
	int sum2 = 0;
	
	for (int a = 1; a <=70; a++) {
		if (a%2!=0) {
			sum2 +=a;
		}
	}System.out.println("Sum of all odds = "+ sum2);
	
	//Simplified into one loop
	
	int sumEven = 0;
	int sumOdd = 0;
	
	for (int a = 1; a <=70; a++) {
		if (a % 2 == 0) {
			sumEven+=a;
		} else {
			sumOdd+=a;
		}
	}System.out.println("Sum even numbers = "+sumEven);
	 System.out.println("Sum odd numbers = "+sumOdd);
}
}
