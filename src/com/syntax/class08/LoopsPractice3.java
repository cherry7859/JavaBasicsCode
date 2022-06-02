package com.syntax.class08;
import java.util.Scanner;
public class LoopsPractice3 {
public static void main(String[] args) {
	
	int secret = 69;
	int guess;
	Scanner obama = new Scanner(System.in);
	
	do {
		System.out.println("Can you guess my secret number?");
		 guess = obama.nextInt();
	} while (guess != secret);
		System.out.println("Congratulations, you got it!");
		
	}
}

