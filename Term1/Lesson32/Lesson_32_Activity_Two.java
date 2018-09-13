package Lesson32;
/*
* Lesson 32 Coding Activity 2
* 
* For the Lesson 32 activities, you will be asked to write one or more methods.
* Use the template to write a main method that tests each of your methods, 
* then paste everything into the code runner box. Your submission should 
* begin with the first import statement and end with the final }.
* 
* Write a method that takes a parameter for the number of a month 
* and prints the number of days in the month. Assume that February 
* will always have 28 days for this activity. 
* 
* This method must be called monthDays()and it must take a integer parameter. 
* 
* Calling monthDays(2) would print 28 and monthDays(9) would print 30.
* 
*/


import java.util.Scanner;

class Lesson_32_Activity_Two {
         
        
        public static void monthDays(int monthNum) {
        	switch(monthNum) {
			case 1:
				System.out.println("31");
				break;
			case 2:
				System.out.println("28");
				break;
			case 3:
				System.out.println("31");
				break;
			case 4:
				System.out.println("30");
				break;
			case 5:
				System.out.println("31");
				break;
			case 6:
				System.out.println("30");
				break;
			case 7:
				System.out.println("31");
				break;
			case 8:
				System.out.println("31");
				break;
			case 9:
				System.out.println("30");
				break;
			case 10:
				System.out.println("31");
				break;
			case 11:
				System.out.println("30");
				break;
			case 12:
				System.out.println("31");
				break;
			default:
				System.out.println("ERROR, month was not between 1 and 12");
				break;
			}
        }
      
        public static void main(String[] args)
        {
        }
}
