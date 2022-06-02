package com.syntax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		/*Scanner is used to get user input, found in java.util package
		 * To read Strings, we use next()
		 * To read sentences, we use nextLine()
		 * To read integer values, we use NextInt()
		 * To read decimal values, we use nextDouble()
		 * To read a single character, we use next().charAt(0)
		 */
		//creating a scanner; Scanner makes program interactive
		Scanner input=new Scanner(System.in);
		
		//send instructions to the console
		System.out.println("Please enter your name");
	
		//we need to grab the values from console
		String name = input.next(); //after you type the value -> hit enter
		System.out.println(name);
		
		//let's send instructions
		System.out.println(name + " Please enter your age");
		
		//need to capture and store age
		int age = input.nextInt();
		System.out.println(name +" is "+age+" years old");
	}
}
