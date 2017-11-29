package Lesson35;
/*
 * Lesson 35 - Unit 4 - Overloaded Methods
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson35_template{
  
 public static int sum (int a, int b) 
     {
         return a + b;
     }//sum
     
    public static int sum (int v[]) 
     {
         int s =0;
         for (int i =0; i < v.length; i++) 
              s += v[i];
          return s;
     }//sum
     
     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);
          System.out.println ("Enter two integers: ");
          
          int x = scan.nextInt();
          int y = scan.nextInt();

          System.out.println ("The sum is: " + sum (x, y));
          
          
          int vals []= { 3, 6, 2, 9, 11};
          System.out.println ("The sum is: " + sum (vals));
     }

}


