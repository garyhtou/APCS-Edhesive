package Lesson3;
/*
 * Lesson 3 Coding Activity Question 1
 * 
 * Write the code to ask the user to enter their name and print the following message:

Hi ______, nice to see you.
	
 * Remember, you'll need to use the method println and Scanner class method nextLine.
*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_3_Activity_One {
    public static void main(String[] args) {
      
        Scanner nameScan = new Scanner (System.in);
        String name;
        
        System.out.println("What is your name?");
        name = nameScan.nextLine();
        
        System.out.println("Hi " + name + ", nice to see you.");


    }
}