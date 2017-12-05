package Lesson31;
/*
 * Lesson 31 - Unit 4 - Void Methods
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson31_template{

       public static void doStuff ( ) {
          System.out.println( "This is a method ");
     } //doStuff

     public static void main (String str[]) throws IOException {

          System.out.println( "This is in main.");
          
          doStuff();
          doStuff();
          
          System.out.println( "       ( main is a method too ) ");

     }

}


