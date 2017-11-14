package Lesson32;
/*
* Lesson 32 Coding Activity 1
* 
* For the Lesson 32 activities, you will be asked to write one or more methods.
* Use the template to write a main method that tests each of your methods, 
* then paste everything into the code runner box. Your submission should 
* begin with the first import statement and end with the final }.
* 
* Write a method that takes a parameter for the number of a month 
* and prints the month's name. 
* 
* This method must be called monthName() and it must have an integer parameter. 
* 
* Calling monthName(8) should print August to the screen.
*/


import java.util.Scanner;

class Lesson_32_Activity_One {
    
	public static void monthName(int monthNum) {
		switch(monthNum) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			default:
				System.out.println("ERROR, month was not between 1 and 12");
				break;
			}
		

	}
        
    public static void main(String[] args){
    	int monthNum = 123;
    	monthName(monthNum);
    }
}
