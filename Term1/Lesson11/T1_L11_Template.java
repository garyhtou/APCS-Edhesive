package Lesson11;
/*
 * Lesson 11 - Unit 2 - Simple Ifs 
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t1_lesson11_template{

     public static void main (String str[]) throws IOException {

       Scanner scan = new Scanner(System.in);
       
       int numberWheels = 0;
       
       System.out.println("How many wheels does the vehicle have?");
       
       numberWheels = scan.nextInt();
       
       if(numberWheels==2)
         System.out.println("It is a scooter");
        
     }

}