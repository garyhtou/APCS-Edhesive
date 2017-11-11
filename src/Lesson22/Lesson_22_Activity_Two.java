package Lesson22;
/*
 * Lesson 22 Coding Activity 2
 * Write the code to take a String and print it diagonally.

  Sample run:

  Enter a string:
  bought
  b
      o
          u
              g
                  h
                      t
  Use a tab character for every four spaces in the sample.

  Hint: You may need more than one loop.
  
*/ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_22_Activity_Two {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
    	String word = scan.nextLine();
    	
    	for (int i = 0; i < word.length(); i++) {
    		for (int k = 0; k < i; k++) {
    			System.out.print("\t");
    		}
    		System.out.println(word.substring(i, i+1));
    	}
    	
    	
    	
	}
}