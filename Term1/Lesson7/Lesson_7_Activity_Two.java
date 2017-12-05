package Lesson7;
/*
 * Lesson 7 Coding Activity Question 2
 *
 * Change the last problem so that it also prints the sum of the digits. 
 * Use the format shown below.
 *
 * Make sure your output is printed in the same order as the sample run.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

6 + 7 + 8 = 21

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_7_Activity_Two {
    public static void main(String[] args) {
      
    	int enteredDigit;
        int digit1;
        int digit2;
        int digit3;
        
        Scanner scan = new Scanner (System.in);
        
        
        System.out.println("Please enter a three digit number:");
        enteredDigit = scan.nextInt();
        
        digit1 = (enteredDigit % 1000)/100;
        digit2 = (enteredDigit % 100)/10;
        digit3 = enteredDigit % 10;
        
        System.out.println("Here are the digits:");
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println("\n" + digit1 + " + " + digit2 + " + " + digit3 + " = " + (digit1+digit2+digit3));


    }
}