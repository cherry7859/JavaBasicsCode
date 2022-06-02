package com.syntax.class05;

public class LogialNot {

	public static void main(String[] args) {
		
		boolean boo=!true;
		
		System.out.println(boo);//false
		
		boolean boo1=!false;
		System.out.println(boo1);//true
		
		/*
		 * if there is no traffic -> I will reach work on time
		 */
		
		boolean traffic =false;
		
		if(!traffic) { //! converts "traffic" to true
			System.out.println("I will reach work on time");
		}
		
		String name = "Reza";
		if (!name.equals("Emre")) {
			System.out.println("You are not Emre, and I need Emre");
		}
	}
}
