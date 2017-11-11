package Assignments;
import java.util.Scanner;


public class Alien_Message_Board_4_ONE_METHOD {

	public static void main(String[] args) {
		
		int swear1 = 0, swear2 = 0, swear3 = 0; //swear1 = ^^, swear2 = QEY, swear3 = $
		boolean swear = false;
		
		Scanner scan = new Scanner (System.in);
		String input = scan.nextLine();
		
		String username = input.substring(0, input.indexOf(' '));
		String message = (input.substring(input.indexOf(' ') + 3)).toUpperCase();
		
		
		String splitString = message;
		//System.out.println("start");
		if(splitString.indexOf(' ') > -1) {
			//System.out.println("in if");
			while (splitString.indexOf(' ') > -1) {
				String currentWord = splitString.substring(0, splitString.indexOf(' '));
				//System.out.println(currentWord);
				if ((currentWord.compareTo("^^")) == 0) {
					swear1++;
					swear = true;
				}
				if ((currentWord.compareTo("QEY") == 0)) {
					swear2++;
					swear = true;
				}
				if ((currentWord.compareTo("$")) == 0) {
					swear3++;
					swear = true;
				}
				
				splitString = splitString.substring(splitString.indexOf(' ')+1);
			}
			
			if ((splitString.compareTo("^^")) == 0) {
				swear1++;
				swear = true;
			}
			if ((splitString.compareTo("QEY") == 0)) {
				swear2++;
				swear = true;
			}
			if ((splitString.compareTo("$")) == 0) {
				swear3++;
				swear = true;
			
			}
		}
			
		else {
			//System.out.println("in else");
			if ((splitString.compareTo("^^")) == 0) {
				swear1++;
				swear = true;
			}
			if ((splitString.compareTo("QEY") == 0)) {
				swear2++;
				swear = true;
			}
			if ((splitString.compareTo("$")) == 0) {
				swear3++;
				swear = true;
			}
		}
		
			//System.out.println("before print");
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
			//System.out.println("end");
			
			scan.close();
	}
}
