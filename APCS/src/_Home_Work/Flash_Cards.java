package _Home_Work;

import java.util.Scanner;
import java.lang.Math;


	
public class Flash_Cards {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int quizSide = 0;
		boolean showAnswer = true;
	
		System.out.println("How many Flash Cards would you like to make?");
		int numOfCards = scan.nextInt();
		String[] side1 = new String[numOfCards];
		String[] side2 = new String[numOfCards];
		
		for (int i = 1; i <= numOfCards; i++) {
		//int i = 1;
			System.out.println("Please enter side ONE of the " + i + numEnding(i) + " Flash Card");
			side1[i-1]=scan.nextLine();
			
			System.out.println("Please enter side TWO of the " + i + numEnding(i) + " Flash Card");
			side2[i-1]=scan.nextLine();
			
			
		}
		
		
		
		System.out.println("\n----------\nYou have entered all of the flash cards\n"
				+ "Which side would you like to be quized on?\n"
				+ "\"Side One\"  or \"Side Two\".");
		String UIquizSide = scan.nextLine();
		while (quizSide != 1 || quizSide != 2) { //TODO DEBUG - problem here, won't move past
			if(UIquizSide.compareTo("Side One")==0) {
				quizSide = 1;
			}
			else if(UIquizSide.compareTo("Side Two")==0) {
				quizSide = 2;
			}
			else {
				System.out.println("Invalid, please enter \"Side One\"  or  \"Side Two\".");
			}
		}
		
		
		System.out.println("Would you like to the correct answer if you enter an incorrect answer?  Please answer \"Yes\"  or  \"No\".");
		String UIshowAnswer = scan.nextLine();
		int showAnswerChanged = 0;
		while (showAnswerChanged != 1) {
			if(UIshowAnswer.compareTo("Yes")==0) {
				showAnswerChanged = 1;
				showAnswer = true;
			}
			else if(UIshowAnswer.compareTo("No")==0) {
				showAnswerChanged = 1;
				showAnswer = false;
			}
			else {
				System.out.println("Invalid, please enter \"Yes\"  or  \"No\".");
			}
		}
		
		
		System.out.println("\n\nLet's Play!");
		System.out.println("\tTo stop, type \"STOP\" instead of the answer");
		play(side1, side2, numOfCards, quizSide, showAnswer);

	}
	
	public static void play(String[] side1, String[] side2, int numOfCards, int quizSide, boolean showAnswer) {
		Scanner scan = new Scanner (System.in);
		
		//TODO Add often missed words. how? array- has set length (may set to new array, null old, garbage collect, add and set to old array, null pervious, garbage collect. ETC.
		//TODO "Would you like to try again?" - Yes, No
		
		boolean cont = true;
		int correctAnswers = 0, answered = 0;
		while(cont) {
			if (quizSide == 1) {
				int randomCard = randomCard(numOfCards);
				String print = side1[randomCard];
				answered++;
				System.out.println(answered + ":  " + print);
				
				String UIresponce = scan.nextLine();
				if (UIresponce.compareTo("STOP")==0) {
					answered--;
					if ((correctAnswers/answered)>(int)(answered*.90)) {
						System.out.println("Wonderful Job!");
					}
					else if((correctAnswers/answered)>(int)(answered*.70)) {
						System.out.println("Good Job!");
					}
					else if((correctAnswers/answered)>(int)(answered*.50)) {
						System.out.println("Try Harder Next Time!");
					}
					else {
						System.out.println("Maybe you'll have better lucky next time!");
					}
					

					System.out.println("\nYou got " + correctAnswers + " out of " + answered);
				}
				else {
					if(UIresponce.compareTo(side2[randomCard])==0) {
						System.out.println("Correct!\n\n");
						correctAnswers++;
					}
					else if(showAnswer) {
						System.out.println("Incorrect\nCorrect Answer: " + side2[randomCard]==0 + "\n\n");
					}
					else {
						System.out.println("Incorrect");
					}
				}
			}
		}
		
		
	}
	
	
	
	
	
	//HELPER METHODS
	
	public static String numEnding(int num) {
		String ending;
		if (num == 1) {
			ending = "st";
		}
		else if (num == 2) {
			ending = "nd";
		}
		else if (num == 3) {
			ending = "rd";
		}
		else {
			ending = "th";
		}
		
		return ending;
	}
	
	public static int randomCard(int numOfCards) {
		int randomCard = (int)Math.random() * (numOfCards-1);
		return randomCard;
	}
	
	
	
	
	
}
