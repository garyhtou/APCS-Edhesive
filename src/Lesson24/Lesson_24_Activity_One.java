package Lesson24;


/*
 * Lesson 24 Coding Activity 1
 * Use a for loop to print all of the numbers from 23 to 89, with 10 numbers on each line. 
 * Print one space between each number.
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_24_Activity_One {

	public static void main(String[] args) {
		int i = 0;
		for(int a = 23; a <= 89; a++) {
			if(i == 10) {
				System.out.println();
				i = 0;
			}
			System.out.print(a + " ");
			i++;
		}
		
		
		
	}
	
}