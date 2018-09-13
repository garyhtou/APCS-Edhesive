package Lesson10;
/*
 * Lesson 10 - Unit 1 - Roundoff error. 
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

import java.lang.Math;

class t1_lesson10_template{

     public static void main (String str[]) throws IOException {

       double x = 4.35;
       
       System.out.println(x + " " + x * 100 );
       
       
       int temp = (int)(Math.round(x*100));
       System.out.println((double)(temp-500)/100); //since it's multipled by 100, -500 is the same as -5
        
     }

}


/*
The answer for x * 100 is not correct because of round off error
to prevent this, first change x into a integer

round off errors occur because some doubles can't be stored as binary. 3.35 is rounded off and stored as 3.34

double x = 4.35;
int temp = (int)(x*100);
System.out.println((double)(x*100)/2);

*/