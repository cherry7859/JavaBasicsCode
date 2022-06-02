package com.syntax.class07;
import java.util.Scanner;
public class LoopWithScanner {

	public static void main(String[] args) {
		
/*
 * We are going to ask you if you got a job
 * We will continuously be asking if you get a job until you say yes!
 * 
 * Once you say yes -> Congratulations!
 */
		
		Scanner obama = new Scanner(System.in);
		String job;
		
		do {
		System.out.println("Did you get a job?");
		job = obama.nextLine();
		} while (!job.equalsIgnoreCase("yes")); // not true
		
		System.out.println("Congratulations!");
		
		
		
	}

}
