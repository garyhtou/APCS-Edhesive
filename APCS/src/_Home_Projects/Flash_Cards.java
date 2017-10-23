package _Home_Projects;

import java.util.Scanner;
import java.lang.Math;

//import _Interfaces.IC_General;

	
public class Flash_Cards /*extends IC_General*/{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int quizSide = 0;
		boolean showAnswer = true;

		System.out.println("How many Flash Cards would you like to make?");
		int numOfCards = scan.nextInt();
		if(numOfCards == 0) {
			System.out.println("Hm, why are you even using this program if you need \"0\" Flash Cards");
			throw new IllegalArgumentException("You can't put in 0 Flash Cards");
			//System.exit(0);
		}
		else if(numOfCards<0) {
			System.out.println("Hm, i'm pretty sure it isn't possible to have \"" + numOfCards +"\" Flash Cards");
			throw new IllegalArgumentException("You can't put in 0 Flash Cards");
			//System.exit(0);
		}
		
		
		String[] side1 = new String[numOfCards];
		String[] side2 = new String[numOfCards];
		
		
			scan.nextLine();
		for (int i = 1; i <= numOfCards; i++) {
			
			System.out.println("Please enter side ONE of the " + i + numEnding(i) + " Flash Card");
			//side1[i-1]=scan.nextLine();
			side1[i-1]=Math.round((Math.random()*19)+1)+" a";
			System.out.println("gen- " + side1[i-1]);
			
			System.out.println("Please enter side TWO of the " + i + numEnding(i) + " Flash Card");
			//side2[i-1]=scan.nextLine();
			side2[i-1]=Math.round((Math.random()*19)+1)+" a";
			System.out.println("gen- " + side2[i-1]);
			
		}
		
		
		
		System.out.println("\n----------\nYou have entered all of the flash cards\n"
				+ "Which side would you like to be quized on?\n"
				+ "\"Side One\"  or \"Side Two\".");
		String UIquizSide;
		while (quizSide == 0) { 
			UIquizSide = scan.nextLine();
			UIquizSide = UIquizSide.toUpperCase();
			if(UIquizSide.compareTo("SIDE ONE")==0) {
				quizSide = 1;
			}
			else if(UIquizSide.compareTo("SIDE TWO")==0) {
				quizSide = 2;
			}
			else {
				System.out.println("Invalid, please enter \"Side One\"  or  \"Side Two\".");
				quizSide = 0;
			}
		}
		
		
		System.out.println("\nWould you like to the correct answer if you enter an incorrect answer?  Please answer \"Yes\"  or  \"No\".");
		String UIshowAnswer;
		
		int showAnswerChanged = 0;
		
		while (showAnswerChanged != 1) {
			UIshowAnswer = scan.nextLine();
			UIshowAnswer = UIshowAnswer.toUpperCase();
			
			if(UIshowAnswer.compareTo("YES")==0 || UIshowAnswer.compareTo("Y")==0) {
				showAnswerChanged = 1;
				showAnswer = true;
			}
			else if(UIshowAnswer.compareTo("NO")==0 || UIshowAnswer.compareTo("N")==0) {
				showAnswerChanged = 1;
				showAnswer = false;
			}
			else {
				System.out.println("Invalid, please enter \"Yes\"  or  \"No\".");
			}
		}
		
		
		System.out.println("\n\n----------\nLet's Play!");
		System.out.println("\tTo stop, type \"STOP\" instead of the answer\n----------");
		play(side1, side2, numOfCards, quizSide, showAnswer);

	}
	
	public static void play(String[] side1, String[] side2, int numOfCards, int quizSide, boolean showAnswer) {
		Scanner scan = new Scanner (System.in);
		
		int[] wrong = new int[numOfCards];
		
		
		boolean cont = true;
		int correctAnswers = 0, answered = 0;
		while(cont) {
			if (quizSide == 1) {
				int randomCard = randomCard(numOfCards);
				String print = side1[randomCard];
				//g.DebugPrint(randomCard);
				answered++;
				System.out.println(answered + ":  " + print);
				
				String UIresponce = scan.nextLine();
				if (UIresponce.compareTo("STOP")==0) {
					answered--;
					System.out.println("\n\n\n\n----------");
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
					
					System.out.println("\nYou got " + correctAnswers + " out of " + answered + ".\t " + (int)((double)correctAnswers/answered*100) + "%.");
					
					//MOST OFTEN MISSED
					
					if((correctAnswers/answered) != 100) {
						System.out.println("\n\nMost often missed:\n");
						int most_missed_1=0, most_missed_2=0, most_missed_3=0;
						
						for(int i = 0; i <= numOfCards-1; i++) {
							if(wrong[i] > wrong[most_missed_1]) {
								most_missed_1 = i;
							}
						}
						
						wrong[most_missed_1]=0;
						for(int i = 0; i <= numOfCards-1; i++) {
							if(wrong[i] > wrong[most_missed_2]) {
								most_missed_2 = i;
							}
						}
						
						wrong[most_missed_2]=0;
						for(int i = 0; i <= numOfCards-1; i++) {
							if(wrong[i] > wrong[most_missed_3]) {
								most_missed_3 = i;
							}
						}
					
					// TODO NOT WORKING
					if(wrong[most_missed_3]>0) {
						System.out.println(side1[most_missed_1] + ", " + side1[most_missed_2] + ", " + side1[most_missed_3]);
					}
					else if(wrong[most_missed_2]>0) {
						System.out.println(side1[most_missed_1] + ", " + side1[most_missed_2]);
					}
					else {
						System.out.println(side1[most_missed_1]);
					}	
						
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					System.out.println("\nWould you like to play again?  Please enter \"Yes\" or \"No\"");
					String playAgain;
					boolean changed = false;
					while (!changed) {
					playAgain = scan.nextLine();
					playAgain = playAgain.toUpperCase();
					if(playAgain.compareTo("YES")==0) {
						cont = true;
						answered = 0;
						correctAnswers = 0;
						changed = true;
					}
					else if (playAgain.compareTo("NO")==0) {
						cont = false;
						answered = 0;
						correctAnswers = 0;
						changed = true;
					}
					else {
						System.out.println("Invalid, please enter \"Yes\"  or  \"No\".");
						changed = false;
					}
					}
				}
				else {
					if(UIresponce.compareTo(side2[randomCard])==0) {
						System.out.println("\nCorrect!\n-----\n\n");
						correctAnswers++;
					}
					else if(showAnswer) {
						System.out.println("\nIncorrect\nCorrect Answer: " + side2[randomCard] + "\n-----\n\n");
						wrong[randomCard]++;
						//g.DebugPrint(wrong[randomCard]);
					}
					else {
						System.out.println("\nIncorrect\n-----\n\n");
						wrong[randomCard]++;
						//g.DebugPrint(wrong[randomCard]);
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
		int randomCard = (int)(Math.random() * (numOfCards));
		return randomCard;
	}
	
	
	
	
	
}
