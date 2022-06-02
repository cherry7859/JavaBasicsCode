package com.syntax.class08;

public class ContinueKeyword {
public static void main(String[] args) {
	
	//continue - skips current execution/iteration; needs to be inside a condition "if"
	
	for (int a = 1; a <= 5; a++) {
		
		if (a == 2) {
		continue; // will skip rest of "for" block, so doesn't print 2, then goes back to beginning
		}
		System.out.print(a+" ");
	}
	System.out.println();
	
	//print numbers from 1 to 10 except number 5 and 7
	
	for (int a = 1; a <=10; a++) {
		
		if (a == 5 || a == 7) {
			continue;
		}
		System.out.print(a+" ");
	}
}
}
