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
		Scanner sc = new Scanner(System.in);
		int num1 = (int)(Math.random() * (1000 - 1)+1);
		System.out.print("Pick a number between 1 -1000: ");
		int num2 = sc.nextInt();
		if(num1 > num2){
			System.out.println("Your number is smaller than the number. The number was "+num1);
		}
		else if(num1 < num2){
			System.out.println("Your number is bigger than the number. The number was "+num1);
		}
	}
}
