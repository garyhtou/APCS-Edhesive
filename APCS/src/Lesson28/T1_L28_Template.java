package Lesson28;

/*
* Lesson 28 - Unit 3 - Arrays of Strings
*/
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


public class T1_L28_Template{ 

  
     public static void main (String str[]) throws IOException {

          String movies [] = new String [5];
          
          movies[0] = "Creature of the Black Lagoon";
          
          for(int i = 0; i <movies.length; i++) {
        	  System.out.println(movies[i]);
          }
     }

}


