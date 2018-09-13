package Lesson2;
/*
Write a program that allows a user to input words at the command line. Your program should stop accepting words when the user enters "STOP". Store the words in an ArrayList. The word STOP should not be stored in the list.

Next, your program should loop through the list and print out only the words that contain the letter "a".

Sample Run:

Please enter words, enter STOP to stop the loop.
dog
zebra
cat
fish
STOP

zebra
cat
Note: For this activity, you must use the class name, Main and the method, main.
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
    	
    	//input = scan.nextLine();
    	while(true) {
    		input = scan.nextLine();
    		if(input.equals("STOP")) {
    			System.out.println("");
    			break;
    		}
    		else {
    			list.add(input);
    		}
    	}
    	
    	for(String item : list) {
    		if(item.contains("a")) {
    			System.out.print(item);
    		}
    	}

    }
}