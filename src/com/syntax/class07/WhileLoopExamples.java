package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		
		//print numbers from 1 to 10;
		
		int num = 1;
		while(num<=10) {
			
			System.out.print(num+" "); // all numbers on one line
			num++; // counter variable to control our loop. W/o it the loop would continue forever cause always equal to 1
		}
		System.out.println();
		int num1 = 1;
		
		while (num1<10) {
			num1++;
			System.out.print(num1+" "); // will be 2-10, because variable increases after condition is checked, before the print
		}
		// print numbers from 10 to 100;
		System.out.println();
		
		int a = 10;
		
		while (a<=100) {
			System.out.print(a+" "); // will be 10-100
			a++;
		}
		
		//print numbers from 10 to 1;
		System.out.println();
		
		int  b = 10;
		
		while (b>=1) {
		System.out.print(b+" ");
		b--;
		}
		
		// print numbers from 100 to 50;
		System.out.println();
		int c = 100;
		while (c>=50) {
			System.out.print(c+ " ");
			c--;
		}
		
		// print numbers from -1 to -10;
		
		System.out.println();
		int d = -1;
		while (d>=-10) {
			System.out.print(d+" ");
			d--;
		}
		
		//print number from 1 to 20, but only evens
		
		System.out.println();
		
		int e = 2;
		
		while (e<=20) {
			System.out.print(e+" ");
			e+=2;
		}
		
		//print even numbers from 20 to 100
		
		System.out.println();
			int f = 20;
			while (f<=100) {
				System.out.print(f+" ");
				f+=2;
			}
			
			//print odd numbers 100 to 1
			
		System.out.println();
			int g = 100;
	
			while (g>=1) {
				if (g%2==1) {
					System.out.print(g+" ");
				}
				g-=1;
			}
			

}
}