package Lesson5;
/*
 * Lesson 5 Coding Activity Question 2
 * 
 * Input four integer values and print the sum of all four values.
 *
*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_5_Activity_Two {
    public static void main(String[] args) {
      
        int one;
        int two;
        int three;
        int four;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Please enter 4 integers");
        one = scan.nextInt();
        two = scan.nextInt();
        three = scan.nextInt();
        four = scan.nextInt();
        System.out.println("The sum of the 4 integers is " + (one+two+three+four));
        
        


    }
}