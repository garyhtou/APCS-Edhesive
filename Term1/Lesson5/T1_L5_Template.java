package Lesson5;

/* 
 * Lesson 5 - Unit 1 - Number Calculations and Order of Operations
 */

import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

class t1_lesson05_template{


     public static void main (String str[]) throws IOException {
    	 	
    	 	Scanner scan = new Scanner (System.in);
    	 	
            int num1 = 18;
            int num2 = 3;
            
            System.out.println("Please enter two intagers");
    	 	num1 = scan.nextInt();
    	 	num2 = scan.nextInt();
            
            System.out.println(((double)num1 + num2)/2);
   
     }

}


