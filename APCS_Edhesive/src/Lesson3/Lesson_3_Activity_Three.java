package Lesson3;
/*
 * Lesson 3 Coding Activity Question 3
 * 
 * Write a program that will ask the user to enter an adjective and a name. 
 * Print the following sentence, replacing the ______ with the words they entered.
 * 
 * My name is _____. I am _____.
 *
 * Sample Run:

Hi there. What is your name?
Ada
What adjective describes you?
logical
My name is Ada. I am logical.

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_3_Activity_Three {
    public static void main(String[] args) {
      
    	String name;
    	String adjective;
    	
    	Scanner scan = new Scanner (System.in);
    	
    	System.out.println("Hi there. What is your name?");
    	name = scan.nextLine();
    	
    	System.out.println("What adjective describes you?");
    	adjective = scan.nextLine();
    			
    	System.out.println("My name is " + name + ". I am " + adjective + ".");

    }
}