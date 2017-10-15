package Assignments;

import java.util.Scanner;

public class Crack_the_Code {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		boolean incorrect = false; //false, not incorrect
		int one, two, three;
		
		System.out.println("Welcome. What is your name?");
		String name = scan.nextLine();
		System.out.println("Hello " + name + ". Try your best to crack the code!\n");
		
		//PHASE ONE
		if(!incorrect) {
			System.out.println("PHASE 1\nEnter a number:");
			one = scan.nextInt();
			if (one == 3) {
				System.out.println("Correct!\n");
			}
			else {
				System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
				incorrect = true;
			}
		}
		
		
		//PHASE TWO
		if(!incorrect) {
			System.out.println("PHASE 2\nEnter a number:");
			two = scan.nextInt();
			if ((two == 1) || ((two >= 33) && (two <=100))) {
				System.out.println("Correct!\n");
			}
			else {
				System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
				incorrect = true;
			}
		}
		
		
		//PHASE THREE
		if(!incorrect) {
			System.out.println("PHASE 3\nEnter a number:");
			three = scan.nextInt();
			if ((three > 0) && ((three % 3 == 0) || (three % 7 == 0))) {
				System.out.println("Correct!\n");
			}
			else {
				System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
				incorrect = true;
			}
		}
		
		if(!incorrect) {
			System.out.println("You have cracked the code!");
		}
		
		scan.close();

	}

}