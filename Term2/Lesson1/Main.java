package Lesson1;
/*
Write a Java program that allows a user to input words at the command line.  Your program should stop accepting words when the user enters "STOP".  Store the words in an ArrayList.  The word STOP should not be stored in the list.

Next, print the size of the list, followed by the contents of the list.

Then, remove the first and last words stored in the list, but only if the list has a length greater than two.  Finally, reprint the contents of the list.

Sample Run:

Please enter words, enter STOP to stop the loop.
cup
spoon
fork
bowl
plate
knife
STOP

6
[cup, spoon, fork, bowl, plate, knife]
[spoon, fork, bowl, plate]
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String input = null;
    	ArrayList<String> list = new ArrayList<String>();
    	
    	System.out.println("Please enter words, enter STOP to stop the loop.");
    	
    	input = scan.nextLine();
    	while(true) {
    		input = scan.nextLine();
    		if(input.equalsIgnoreCase("STOP")) {
    			break;
    		}
    		else {
    			list.add(input);
    		}
    	}
    	
    	System.out.println("\n" + list.size());
    	
    	ArrayList<String> newList = new ArrayList<String>(list);
    	if(list.size()>2) {
	    	newList.remove(newList.size()-1);
	    	newList.remove(0);
    	}
    	
    	System.out.println(list);
    	System.out.println(newList);
    	
    	scan.close();

    }
}