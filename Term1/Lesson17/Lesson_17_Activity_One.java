package Lesson17;
/*
 * Lesson 17 Coding Activity 1
 * Write a program that will input a list of test scores in from the keyboard. 
 * When the user enters -1, print the average.
 * 
 * What do you need to be careful about when using -1 to stop a loop?
 * 
 *     Sample Run:
 *         Enter the Scores:
 *         45
 *         100
 *         -1
 *
 *         The average is: 72.5
 * 
 * 
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_17_Activity_One {
    public static void main(String[] args) {
    	Scanner scan = new Scanner (System.in);
    	int score = 0, sum = 0, count = 0;
    	double average = 0;
    	
    	while (score != -1) {
    		if(score>=0 && score<=100) {
    			sum+=score;
    			score = scan.nextInt();
    			count++;
    		}
    	}
    	count--;
    	average = (double)sum/count;
    	System.out.println("The average is " + average);
    	
    	
    	
    	
    	
    }
}