package Lesson6;
/*
 * Lesson 6 Coding Activity Question 1
 
double x = (11+4)/2
 
 * What answer do you get? The answer is imprecise!
 *
 * Write a Java program that precisely calculates the average 
 * between two integers that input from the keyboard, and prints 
 * the answer to the screen. The average must include the integer 
 * and decimal portions of the calculation.
 *
 * Sample Run:
 
Please enter two integers:
4
11

The average is: 7.5

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_6_Activity_One {
    public static void main(String[] args) {
      
        int one;
        int two;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Please enter two integers:");
        one = scan.nextInt();
        two = scan.nextInt();
        
        System.out.println("The average is: " + ((double)(one+two)/2));
        


    }
}