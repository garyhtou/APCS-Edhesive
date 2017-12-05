package Lesson15;
/*
 * Lesson 15 - Unit 2 - Short Circuit Evaluation. 
 */
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t1_lesson15_template{

     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);
         
          int y = scan.nextInt();

          if ( y < 0 || y > 100)
          {
               System.out.println( "Not a valid grade.");
          }
          
     }

}


