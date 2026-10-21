/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random() * 1001 + 1); 
		System.out.println("Welcome to the guessing game!");
		System.out.println("Please guess a number: ");
		int num1 = sc.nextInt();
		while(true){
			if (num1 == num){
				System.out.println("You guessed it!");
				break;
			}
			else if(num1 < num){
				System.out.println("The number is higher");
				System.out.println("Please guess a number: ");
				num1 = sc.nextInt();
			}
			else if(num1 > num){
				System.out.println("The number is lower");
				System.out.println("Please guess a number: ");
				num1 = sc.nextInt();
			}
		}
	}
}
	


		



		
	


