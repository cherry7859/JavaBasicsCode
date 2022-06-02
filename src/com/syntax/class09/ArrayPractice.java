package com.syntax.class09;

public class ArrayPractice {
public static void main (String []args) {
	
	char[] grade = new char[6];
	
	grade[0] = 'A';
	grade[1] = 'B';
	grade[2] = 'C';
	grade[3] = 'D';
	grade[4] = 'E';
	grade[5] = 'F';
	
	System.out.println(grade[1]);
	
	System.out.println("----PROBLEM 2-------");
	
	//All values from Array
	
	char[] grade2 = {'A', 'B', 'C', 'D', 'E', 'F'};
	
	for (int a = 0; a < grade2.length; a++) {
		System.out.print(grade2[a]+" ");
	}
	
	System.out.println(" ");
	System.out.println("----PROBLEM 3-------");
	
	String[] words = {"Java", "Saturday", "day", "coding", "is"};
	System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	
	//Retreive all elements 
	
	for (int a = 0; a < words.length; a ++) {
		System.out.print(words[a]+" ");} // Java Saturday day coding is
		System.out.println();
		
		System.out.println("--------ENHANCED FOR LOOP1---------");
		/*
		 * Enhanced/advanced for loop/for each loop
		 *  can be used only when we work with array OR collections
		 */
		String[] colors = {"pink", "blue", "white", "black"};
		for (String color:colors) {
			System.out.print(color+" ");
		}
		System.out.println();
		System.out.println("-------ENHANCED FOR LOOP2--------");
		
		int[] numbers = {10,20,30,40};
		
		for (int num:numbers) {
			System.out.print(num+" ");
		}
		System.out.println("-------Calculate the sum of integers--------");
		//Create an array of integers and calculate the sum of all elements in the array
		
		int[] numbers2 = {10,222,3,4,5};
		int sum = 0;
		
		for (int a = 0; a < numbers2.length; a++) {
			sum +=numbers2[a];//sum = sum + numbers2[a];
		}
		System.out.println(sum);
		
		System.out.println("-------Calculate the sum of integers with enhanced loop--------");
		
		sum = 0;
		for (int n:numbers2) {
			sum+=n;
		}
	
	
	
	
	
	
}
}
