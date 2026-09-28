/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int num1 = (int)(Math.random() * (9-0));
		System.out.println("An integer between 0 and 9: " + num1);
		int num2 = (int)(Math.random()*(100-1)+1);
		System.out.println("An integer between 1 and 100: "+num2);
		double num3 = (Math.random()*(3.5-2.5)+2.5);
		System.out.println("A double between 2.5 and 3.5: "+num3);
		double num4 = (Math.random()*(589-14)+14);
		System.out.println("A double betweeen 14 and 589: "+num4);
		
		

	}
}
