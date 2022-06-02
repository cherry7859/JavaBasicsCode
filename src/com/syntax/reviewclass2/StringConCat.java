package com.syntax.reviewclass2;

public class StringConCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int num2 = 10;
		String firstName = "Ali";
		String lastName = "Baba";
		String fullName = firstName+lastName;
	
		System.out.println(fullName);// AliBaba
		System.out.println(firstName+num);// Ali10
		System.out.println(firstName+num+num2);//Ali1010
		System.out.println(firstName+(num+num2));//Ali20
		System.out.println(num+firstName+num2);// 10Ali10
	}

}
