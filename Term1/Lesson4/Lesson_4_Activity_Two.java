package Lesson4;
/*
 * Lesson 4 Coding Activity Question 2
 * 
 * Ask the user their name and age and print out how many years until 
 * they are 100. Note that age should be an integer, not a double.
 *
 * Sample run:
 
Hi there. What is your name?
Pascal
Hi Pascal. How old are you?
16
Pascal, you will be 100 in 84 years.

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_4_Activity_Two {
    public static void main(String[] args) {
      
        int age;
        String name;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Hi there. What is your name?");
        name = scan.nextLine();
        System.out.println("Hi " + name + ". How old are you?");
        age = scan.nextInt();
        System.out.println(name + ", You will be 100 in " + (100 - age) + " years.");


    }
}