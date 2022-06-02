package com.syntax.class06;

public class SwitchDemo {
public static void main(String[] args) {
	
	char choice = 'Y';
	String meaning;
	
	//variable and matching cases MUST be if the same type. char to char here
	//switch does not allow to have duplicated cases(there can only be one Case Y)
	switch (choice) {
	case 'Y':
		meaning = "Yes";
		break;
	case 'M':
		meaning = "Maybe";
		break;
	case 'N':
		meaning = "No";
		break;
	default: 
			meaning = "Unknown";
			break;
	}
	System.out.println(meaning);
}
}
