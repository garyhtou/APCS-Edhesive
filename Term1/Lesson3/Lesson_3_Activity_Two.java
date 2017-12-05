package Lesson3;
/*
 * Lesson 3 Coding Activity Question 2
 * 
 * Write a program that asks the user for three names, then prints the names in reverse order.
 * 
 * Sample Run:

Please enter three names:
Zoey 
Zeb 
Zena 

Zena Zeb Zoey

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_3_Activity_Two {
    public static void main(String[] args) {
      
        String name1;
        String name2;
        String name3;
        Scanner namescan = new Scanner (System.in);
        
        System.out.println("Please enter three names:");
        name1 = namescan.nextLine();
        name2 = namescan.nextLine();
        name3 = namescan.nextLine();
        
        System.out.println(name3+ " " +name2+ " " +name1);
    }
}