package com.syntax.class06;
import java.util.Scanner;
public class EnhancedCode {
public static void main(String[] args) {
	
Scanner obama = new Scanner(System.in);
System.out.println("Enter your quiz score");
int quiz = obama.nextInt();

System.out.println("Enter your midterm score");
int mid = obama.nextInt();

System.out.println("Enter your final score");
int fin = obama.nextInt();

int avg = ((quiz+mid+fin)/3);

System.out.println("Your average score is "+avg);
char grade;// declare variable here

	if (avg >= 90) {
		grade = 'A'; // initialize variable inside if statement, to condense code
	}else if (avg >= 70 && avg <= 90) {
		grade = 'B';
	}else if (avg >= 50 && avg < 70) {
		grade = 'C'; 
	}else {
		grade = 'F';
	}
	System.out.println("You are a "+grade+" student");
	/* if you are A or B student -> you are doing great
	 * otherwise -> please try to study more
	 */
	if (grade == 'A' || grade == 'B') {
		System.out.println("You are doing great");
	} else {
		System.out.println("Please try to study more");
	}
}
}
