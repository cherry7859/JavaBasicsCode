package com.syntax.class02;

public class NonPrimitives {
	
	public static void main(String[] args) {
		//All non primitives start with Upper-case letter (ex: String)
		String name="Cherylle";
		String lastName="Finley";
		
		long phone=7134447859l; 
		
		//xxx - xxx - xxxx
		String phoneNumber="713-444-7859";
		String address="12415 Caren Ct.";
		
		int age=24;
		String city="Houston";
		
		 //shortcut for printing: "syso" +ctrl +space
		
		 //When we want to attach String to anything else, use "+"
		//Add a space btwn names with +" "+
		System.out.println(name+" "+lastName);//Cherylle Finley
		
		//Cherylle lives in Houston
		System.out.println(name+" lives in "+city);
		
		//Cherylle is 24 years old
		System.out.println(name+" is "+age+" years old");
		
		
	}

}
