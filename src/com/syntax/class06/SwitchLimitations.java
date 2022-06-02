package com.syntax.class06;

public class SwitchLimitations {
public static void main(String[] args) {
	
	/* switch can work with byte, short, int, char, String
	 * 
	 * switch has a datatype limitations
	 * 
	 * switch cannot work with double, float, long, boolean
	 */
	
	double price = 10;
	
	//switch(price) { -> Compiler error, switch does not work with double
	
	/*
	 * switch has operator limitations also
	 * cannot use logical operators inside switch
	 */

	char choice = 'Y';
	String meaning;
	
	/*
	 * 
	 * switch(choice) {
	 * case 'Y' || 'y': -> CE: cannot use ||
		meaning = "Yes";
		break;
	}
	*/
	
	/*int day = 5;
	 * switch(day) {
	 * 	case > 5: -> cannot check if greater than, simply checks for equality
	 * }
	 */ 

}
}
