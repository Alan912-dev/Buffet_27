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
		System.out.println("What's your name?");
		String character = sc.nextLine();
		System.out.println("What's your title?");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String role = sc.nextLine();
		if(role.equals("Wizard") || role.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(role.equals("Warrior") || role.equals("warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(role.equals("Rogue") || role.equals("rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else{
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.println("Strength (1-10): ");
		int num1 = sc.nextInt();

		
		if(num1 > 10){
			System.out.println("Please input smaller value. Strength (1-10)");
			num1 = sc.nextInt();
			System.out.println("You have " + (20 - num1) + " left to spend.");
		}
		else{
			System.out.println("You have " + (20 - num1) + " left to spend.");
		}
		int leftover = 20 - num1;
		System.out.println("Dexterity (1-10):");
		int num2 = sc.nextInt();
		if((num2 > 10) || (num2 > leftover)){
			System.out.println("Please input smaller value. Dexterity (1-10)");
			num2 = sc.nextInt();
			System.out.println("You have " + (leftover - num2) + " left to spend.");
		}
		else{
			System.out.println("You have " + (leftover - num2) + " left to spend.");
		}
		int leftover2 = leftover - num2;
		System.out.println("Intelligence (1-10):");
		int num3 = sc.nextInt();

		if((num3 > 10) || (num3 > leftover2)){
			System.out.println("Please input smaller value. Intelligence (1-10)");
			num3 = sc.nextInt();
			System.out.println("You have " + (leftover2 - num3) + " left to spend.");
		}
		else{
			System.out.println("You have " + (leftover2 - num3) + " left to spend.");
		}
		int leftover3 = leftover2 - num3;
		System.out.println("Charisma (1-10):");
		int num4 = sc.nextInt();
		if((num4 > 10) || (num4 > leftover3)){
			System.out.println("Please input smaller value. Charisma (1-10)");
			num4 = sc.nextInt();
		}
		else{
			
		}
		System.out.println("You are "+ character+", the "+ title + " of CVHS.");
		System.out.println("You're a "+ role + " with the following stats!");
		System.out.println("Strength - " + num1);
		System.out.println("Dexterity - " + num2);
		System.out.println("Intelligence - " + num3);
		System.out.println("Charisma - " + num4);
		System.out.println("Good luck on your quest " + character + "!");

		
	}
}
 
	

