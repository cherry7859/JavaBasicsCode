package com.syntax.class03;

public class PrimitivesCasting {

	//ctrl+space = auto complete
	
	public static void main(String[] args) {
		
		int i=100;
		double d=100;
		System.out.println(i); //100
		System.out.println(d); //100.0; Type casting occurred to convert int. into double(Widening)
		
		long l=10000; //int value stored in "Long box"
		
		// byte b=130; // error b/c trying to store larger value inside smaller box
		int x=(int)100.99; // narrowing. lost ".99" b/c int dataType
		System.out.println(x);
		
		byte b= (byte)130;
		System.out.println(b);// -126; will get crazy value b/c lost some data
	} 
}
