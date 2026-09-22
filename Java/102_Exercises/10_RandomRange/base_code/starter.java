/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Enter 2 numbers to create a range for your random number");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int smallboi = sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first): ");
		int largeboi = sc.nextInt();
		
		System.out.println("Your range is " + smallboi + " to " + largeboi);
		System.out.println("Here are 5 numbers generated in that range.");
		int num1 = (int)(Math.random() * (largeboi-smallboi) + smallboi);
		int num2 = (int)(Math.random() * (largeboi-smallboi) + smallboi);
		int num3 = (int)(Math.random() * (largeboi-smallboi) + smallboi);
		int num4 = (int)(Math.random() * (largeboi-smallboi) + smallboi);
		int num5 = (int)(Math.random() * (largeboi-smallboi) + smallboi);
		System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + "," + num5);
	}

}
