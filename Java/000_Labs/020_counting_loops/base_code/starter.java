/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = sc.nextLine();
		System.out.println("How many times we should print out your name?");
		int num1 = sc.nextInt();
		while(true){
			if(name.equals(num1)){
				break;
			}
			System.out.println(name);
			num1 = num1 + 1;
		}



		
	}
}
