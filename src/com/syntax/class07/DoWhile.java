package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {
		
		int num=10;
		
		while (num<=3) {
			System.out.print(num+" "); // no output 
			num++;
		}
		System.out.println("-----------------");
		
		int num1 = 10;
		
		do {
			System.out.print(num1 + " "); // output 10 only
			num1++;
			
		} while (num1 <=3);
		
		//print numbers 1 - 30
		
		System.out.println();
		int num2 = 1;
		do {
			System.out.print(num2+" ");
			num2++;
		} while (num2<=30);
		
		//print even numbers from 70 to 30
		
		System.out.println();
		int num3 = 70;
		do {
			System.out.println(num3+ " ");
			num3-=2;
		} while (num3>=30);
	}
	

}
