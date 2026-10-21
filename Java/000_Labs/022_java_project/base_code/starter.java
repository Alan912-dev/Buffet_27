/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:"); 
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("-------------------------------------------------");
		
		System.out.println("Would you like to play the slots? (Yes/yes/Y/y) :");
		String answer = sc.nextLine();
		if(answer.equals(Yes) || (yes) || (Y) || (y)){
			System.out.println("You have $100. How much would you likr to wager?");
			int num1 = sc.nextInt();

			System.out.println("Great! Let's play!!!");
			System.out.println("Your rolls are:");
			int num2 = (int)(Math.random() * 0 + 11);
			int num3 = (int)(Math.random() * 0 + 11);
			int num4 = (int)(Math.random() * 0 + 11);
			System.out.println("-----------------------");
			System.out.println("| num2 | num3 | num4 |");
			System.out.println("-----------------------");
			if((num2 == num3) || (num3 == num4) || (num2 == num4)){

			}
		}
	


	}
}
