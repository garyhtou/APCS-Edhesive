package Lesson5;
/*
 * Lesson 5 Coding Activity Question 1
 * 
 * Input two double values and print the difference between them. 
 * (The difference can be found by subtracting the second value from the first).
 *
*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_5_Activity_One {
    public static void main(String[] args) {
      
        double one;
        double two;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Hey! Plase enter two numbers");
        one = scan.nextDouble();
        two = scan.nextDouble();
        System.out.println("THe difference between the two numbers is " + (two - one));

    }
}