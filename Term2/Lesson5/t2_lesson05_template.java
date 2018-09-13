package Lesson5;

/*
 * Lesson 5 - Unit 5 - Classes - Static vs Instance 
 */


import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

import java.util.*;


class t2_lesson05_template{


     public static void main (String str[]) throws IOException {
          
       ArrayList<Book> bookshelf = new ArrayList<Book> ();
       
       bookshelf.add (new Book ("James and the Giant Peach", "Roald Dahl", 1961));
       
       
       for (Book b: bookshelf)
       {
         System.out.println(b);
       }
       

     }
}


