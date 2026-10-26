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
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a width: ");
		int width = sc.nextInt();
		System.out.println("Please enter a height: ");
		int height = sc.nextInt();

		int num2 = 0;
		while(true){
			if(num2 == height){
				break;
			}
			  int num1 = 0;
		    while(true){
			if(num1 == width){
				break;
			}
			System.out.print("*");
			num1++;
		}
		System.out.println();
			num2++;
		}
		
		


		

	}
}
