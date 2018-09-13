package Lesson34;
//FIXME: WATCH LESSON 34!!!!!
/*
* Lesson 34 - Unit 4 - Return Methods
*/
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson34_template{
  
        public static int max (int a, int b) 
     {
          if (a>b)
               return a;
          return b;
     }//max
     
    
     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);
          System.out.println ("Enter two integers: ");
          
          int x = scan.nextInt();
          int y = scan.nextInt();

          System.out.println ("The largest is: " + max (x, y));
          
     }
}


