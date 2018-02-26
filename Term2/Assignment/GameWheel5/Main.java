package Assignment.GameWheel5;

import java.util.*;

/*
For this assignment, you will simulate spinning a Game Wheel with 40 designated spots, each marked with an ID number, color, and cash prize amount. To help envision this Game Wheel, imagine a circular pie, with 40 evenly cut “slices”. Each “slice” is called a Prize Card (for the purposes of this assignment), and contains an ID number, color, and cash prize amount.

Click here (Links to an external site.)Links to an external site. to download the starter files for this assignment. The Java class PrizeCard has been completed and provided to you. You do not need to modify PrizeCard.java.

Class GameWheel

The first class you will be working on is GameWheel. To help represent this wheel, an ArrayList of PrizeCard objects will be used in the GameWheel class. When initialized, the first PrizeCard in the ArrayList will have an ID #1, the second will have ID #2, and so on. A Prize Card with an odd ID # will be the color red, and a Prize Card with an even ID # will be the color blue, except if the ID # is a multiple of 10, in which case it will be the color black.

Please download the starting template, GameWheel.java. You will need to implement the following method:

public ArrayList<PrizeCard> scramble() - This method will scramble the ordering of the Prize Cards in the Game Wheel. Be careful, because the pattern of the coloring must be maintained (i.e. the “first” Prize Card should still be a card that is red, but likely a different ID number and prize amount, the “second” Prize Card should still be a card that is blue, the “tenth” Prize Card should still be black). In other words, once a color is assigned to a Prize Card, it does not change; when the wheel is scrambled, it is only putting cards that are already red in the places where red cards belong (odd numbered places), black cards where black cards belong (multiples of 10), and blue cards where blue cards belong (even numbered places).
For a simplified example, let’s think about the Prize Cards by just their ID numbers. Let’s say we have a Game Wheel with 10 Prize Cards, initially in the order [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]. After calling scramble(), the order could possibly now be [7, 4, 3, 6, 9, 2, 5, 8, 1, 10]. Notice the pattern is still red (odd ID), blue (even ID), red, blue, red, blue, red, blue, red, black (ID is multiple of 10).

Please refer to the specification above for how the colors were determined. (Hint: Remember that the coloring is determined by some specific characteristic of the Prize Card ID. Also, don’t be afraid to create “temporary” ArrayLists to help complete the work.) The newly scrambled wheel should then be returned.

Class Main

The second class you will be working on will be the Main class. Main should have a main method. Here, you will utilize the PrizeCard and GameWheel classes to simulate two players who will spin the wheel. The first player will get to spin 5 consecutive times. Then the second player will get to spin 5 consecutive times.

If either player’s spin results in a Prize Card they have already landed on, the player will ignore that spin and spin again. Thus, when a player is done spinning, the player should have 5 unique prize cards.

In order to simulate a spin of the wheel, use GameWheel’s method spinWheel() which is already implemented for you. The method spinWheel() will return a PrizeCard object, the PrizeCard that the spin landed on.

At the end the total cash prize amount for the first player should be calculated then printed out. Following the total amount, the Prize Cards that the player’s spins landed on should also be printed out using PrizeCard’s toString() method. For example, in the Sample Run below, Player 1’s five spins landed on Prize Cards with ID # 21, 4, 6, 11, 27.

The same should then be done for the second player.

At the very end, the players’ total cash prize amounts should be compared to one another, and a statement should be printed out indicating which player won more money, as well as how much more money that player won by. If the result is a tie, the output should simply say "It’s a tie!"

Final Notes

Remember, all variables should have an access level of private and all required methods should have an access level of public.

There is no Student Runner File for this assignment. To test your code, run the Main.java file in DrJava and verify that the class output matches the Sample Run pattern that follows. Since the assignment involves an element of randomized results, your own results will vary from the sample run. However, note that neither player has a repeated spin result. We will use our own runner to grade the program.

When you are ready, follow the links below to submit your entire GameWheel and Main classes separately. You must submit both, and you must paste your entire class into the appropriate boxes (including all methods that were implemented for you). Each class is worth 5 points, out of a total of 10.

Sample run #1 of Main.java:

Player 1 Total: $1590
ID: 21, Color: red, Prize Amount: $210
ID: 4, Color: blue, Prize Amount: $400
ID: 6, Color: blue, Prize Amount: $600
ID: 11, Color: red, Prize Amount: $110
ID: 27, Color: red, Prize Amount: $270

Player 2 Total: $9390
ID: 19, Color: red, Prize Amount: $190
ID: 34, Color: blue, Prize Amount: $3400
ID: 18, Color: blue, Prize Amount: $1800
ID: 12, Color: blue, Prize Amount: $1200
ID: 28, Color: blue, Prize Amount: $2800

Player 2 won by $7800!
 Sample run #2 of Main.java:

Player 1 Total: $7170
ID: 20, Color: black, Prize Amount: $4000
ID: 26, Color: blue, Prize Amount: $2600
ID: 37, Color: red, Prize Amount: $370
ID: 15, Color: red, Prize Amount: $150
ID: 5, Color: red, Prize Amount: $50

Player 2 Total: $1340
ID: 29, Color: red, Prize Amount: $290
ID: 23, Color: red, Prize Amount: $230
ID: 3, Color: red, Prize Amount: $30
ID: 39, Color: red, Prize Amount: $390
ID: 4, Color: blue, Prize Amount: $400

Player 1 won by $5830!
Submit your GameWheel using the following link.
NOTE: You MUST use the class name "GameWheel" for this submission.

Assignment 5: Game Wheel - GameWheel Class Submission 

Submit your Main class using the following link.
NOTE: You MUST use the class name "Main" for this submission.

Assignment 5: Game Wheel - Main Class Submission
 */

public class Main {
	static GameWheel gw = new GameWheel();
	static ArrayList<PrizeCard> playerOne = new ArrayList<PrizeCard>();
	static ArrayList<PrizeCard> playerTwo = new ArrayList<PrizeCard>();
	
	public static void main (String[] args) {
		//player one
		for(int i = 1; i <= 5; i++) {
			PrizeCard spunCard = gw.spinWheel();
			if(check(playerOne, spunCard)) {
				playerOne.add(spunCard);
			} else {
				i--;
			}
		}
		//player two
		for(int i = 1; i <= 5; i++) {
			PrizeCard spunCard = gw.spinWheel();
			if(check(playerTwo, spunCard)) {
				playerTwo.add(spunCard);
			} else {
				i--;
			}
		}
		
		int oneTotal = 0;
		int twoTotal = 0;
		for(PrizeCard card : playerOne) {
			oneTotal += card.getPrizeAmount();
		}
		for(PrizeCard card : playerTwo) {
			twoTotal += card.getPrizeAmount();
		}
		
		//print
		System.out.println("Player 1 Total: $" + oneTotal);
		for(PrizeCard card : playerOne) {
			System.out.println(card);
		}
		System.out.println("Player 2 Total: $" + twoTotal);
		for(PrizeCard card : playerTwo) {
			System.out.println(card);
		}
	}
	
	/**
	 * checks if card is already in arr
	 * returns false if already in
	 * @param arr arr to be checked from
	 * @param card card to check with
	 * @return 
	 */
	public static boolean check(ArrayList<PrizeCard> arr, PrizeCard card) {
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).equals(card)) {
				return false;
			}
		}
		return true;
	}
}
