package Lesson11;

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

import java.util.*;

class t2_lesson11_template_2{
     
     
     public static void main (String str[]) throws IOException {
     
       ArrayList<Book> bookshelf = new ArrayList <Book>();
        bookshelf.add( new Book ("James and the Giant Peach", "Roald Dahl", 1961));
        bookshelf.add( new Book ("Matilda", "Roald Dahl", 1988));
         
         for (Book b : bookshelf)
         {
             System.out.println(b);
         }
        
     }
}
