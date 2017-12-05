package Lesson29;


import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class T1_L29_Template{
//Lesson 29: Arrays of Strings accessing Methods

 
  public static void main (String str[]) throws IOException {
    
    String movies [ ] = { "The Thing", "I Was a Teenage Werewolf", "The Blob", "Godzilla", "Plan 9 from Outer Space" };
    
    System.out.println( "\n\nThe Movies: ");
    for (int i = 0; i < movies.length; i++ )
    {
      System.out.println(movies[i] + "\t" + movies[i].length() );
      
    }
    
  }
  
}