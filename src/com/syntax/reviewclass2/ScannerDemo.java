package com.syntax.reviewclass2;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner obama = new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age = obama.nextInt();// user enters the number and hits enter key
		
		obama.nextLine();// consumes the enter that user press after number, allows program to accept the string that follows
		
		System.out.println("Please enter your name");
		String name = obama.nextLine();
		
		System.out.println(age+" "+name);
		
		

	}

}
