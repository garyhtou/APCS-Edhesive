package Lesson14;

/*
 * Lesson 14 - Unit 2  - Boolean Conditions
 *  
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t1_lesson14_template{

     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);
          int num = scan.nextInt();
          
          if(!(num >=45 && num <= 78))
          {
            System.out.println("Not inbetween 45 and 78");
          }

     }

}


