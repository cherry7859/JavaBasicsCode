package com.syntax.class08;

public class ForLoopsPractice2 {
public static void main(String[] args) {
	
	int sum = 0;
	
	for(int a = 1; a < 6; a++) {
		sum += a;                    	// a = 1, 2, 3, 4, 5 ... next loop a >6, so stop
	} System.out.println(sum);// 15    sum =   1, 3, 6, 10, 15 
	
	
	int sum2 = 0;
	
	for(int b = 1; b < 6; b++) {
		System.out.println(sum2);//0, 1, 3, 6, 10
		sum2+=b;
		//System.out.println(sum2+" ");//1, 3, 6, 10, 15
	}
}

}

