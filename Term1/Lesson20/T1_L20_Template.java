package Lesson20;
/*
 * Lesson 20  - Unit 2 - Technique - flag variables 
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson20_template{

     public static void main (String str[]) throws IOException {
          Scanner scan = new Scanner(System.in);
          
          System.out.println ("What number are we looking for?");
          int target = scan.nextInt();
          
          int x = 0;
          int flag = 0;
          
          while ( x != -1)
          {
               System.out.println ("Enter -1 to stop");
               x = scan.nextInt();
               
               if (x == target)
                    flag = 1;
          }
                              
          if (flag == 1)
                System.out.println (target + " was found");
          else
                 System.out.println (target + " was NOT found");
                              
     }

}

//Integer.MIN_VALUE will give you the smallest int possible

