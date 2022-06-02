package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		
		int time = 10;
		
		if (time < 12) {
			
			System.out.println("Morning"); //1
			
		}
		System.out.println("----------------------------------");
		
		while(time<12) {
			System.out.println("Morning");
			time++; // will continue the loop until condition is false. Morning will print 2 times before exiting loop
		}
		System.out.println("Hello");
	}

}
