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
		int num = 100;
		
		while(true){
			if(num == 0){
				System.out.println("You ran out of money!");
				break;
			}
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y) :");
		    String answer = sc.nextLine();
			if(answer.equals("Yes") || answer.equals("yes") || answer.equals("Y") || answer.equals("y")){
				System.out.println("You have " + num +". How much would you like to wager?");
				int num1 = sc.nextInt();
				sc.nextLine();
        		System.out.println("Great! Let's play!!!");
				System.out.println("Your rolls are:");
				int num2 = (int)(Math.random() * 10 + 1);
				int num3 = (int)(Math.random() * 10 + 1);
				int num4 = (int)(Math.random() * 10 + 1);
				System.out.println("-----------------------");
				System.out.println("|" + num2 +"|" + num3 + "|" + num4 + "|");
				System.out.println("-----------------------");
				num = num - num1;
			    if((num2 == num3) || (num3 == num4) || (num2 == num4)){
					System.out.println("You won! Your wager has now been doubled!");
					num = num1*2 + num;
					System.out.println("You now have $" +num);
			    }
				else if((num2 == num3) && (num3 == num4) && (num2 == num4)){
					System.out.println("It's jackpot! Your wager has now been tripled!");
					num = num1*3 + num;
					System.out.println("You now have $" + num);
					
				}
				else if((num2 != num3) && (num3 != num4) && (num2 != num4)){
					System.out.println("Didn't win this time, better luck next time!");
					System.out.println("You now have $" + num);
			    }
			}
			else if(answer.equals("No") || answer.equals("no") || answer.equals("N") || answer.equals("n")){
				System.out.println("Sad to see you go! You still have $" + num + " left. Come again soon! Thanks!");
				break;	
			}
			else{
				System.out.println("That wasn't quite the correct answer. Try again.");
			}
		

		
		
	


	}
}
}
