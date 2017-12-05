package Lesson27;

/*
* Lesson 27 - Unit 3 - Algorithms - searching
*/
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


public class T1_L27_Template{

  
     public static void main (String[] arg) {
          Scanner scan = new Scanner (System.in);
          
          double list [] =  {2.3 , 4.7 , 5.25 , 9.5 , 2.0 , 1.2 , 7.129 , 5.4 , 9.4 };
          
          
          System.out.println( "What are you looking for? ");
          double look = scan.nextDouble();
          boolean found = false;
          for (int i = 0; i < list.length; i++) {
        	  if (list[i] == look) {
        		  System.out.println(look + " was found at the " + i + " index");
        		  found = true;
        	  }
          }
          if(!found) {
        	  System.out.println("-1");
          }
          
          

     }

}


