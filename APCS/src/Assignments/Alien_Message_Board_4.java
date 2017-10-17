package Assignments;
import java.util.Scanner;


public class Alien_Message_Board_4 {
	
	static int swear1 = 0, swear2 = 0, swear3 = 0; //swear1 = ^^, swear2 = QEY, swear3 = $
	static boolean swear = false;
	
	static Scanner scan = new Scanner (System.in);
	static String input = scan.nextLine();
	
	static String username = input.substring(0, input.indexOf(' '));
	static String message = (input.substring(input.indexOf(' ') + 3)).toUpperCase();
	
	
	
	public static void main(String[] args) {
		//System.out.println(message);
		
		
		
		
		String splitString = message;
		
		if(splitString.indexOf(' ') > -1) {
			
			while (splitString.indexOf(' ') > -1) {
				String currentWord = splitString.substring(0, splitString.indexOf(' '));
				checkSwear(currentWord);
				splitString = splitString.substring(splitString.indexOf(' ')+1);
			}
			
			checkSwear(splitString);
			
		}
		else {
			checkSwear(splitString);
		}
		
		
		
		printStats();
	}
	
	public static void checkSwear(String checkSwearMessage) {
		//System.out.println(checkSwearMessage);
		if ((checkSwearMessage.compareTo("^^")) == 0) {
			swear1++;
			swear = true;
		}
		if ((checkSwearMessage.compareTo("QEY") == 0)) {
			swear2++;
			swear = true;
		}
		if ((checkSwearMessage.compareTo("$")) == 0) {
			swear3++;
			swear = true;
		}

	}
	
	public static void printStats() {
		if(!swear) {
			System.out.println("Results:\nCLEAN");
		}
		else {
			System.out.println("Results:\nBAD");
			System.out.println(username);
			
			System.out.println("^^: " + swear1);
			System.out.println("qey: " + swear2);
			System.out.println("$: " + swear3);
			
		}
	}
}
