package Lesson12;
/* 
* Lesson 12 Coding Activity 1  
* Write a program to input three integers.  
* Test if the average is greater than or equal to 89.5.  
* If so, print out the phrase "ABOVE AVERAGE" (without the quotes). 
*/ 
  
  
import java.util.Scanner; 
  
class Lesson_12_Activity_One { 
    public static void main(String[] args) 
     { 
     Scanner scan = new Scanner (System.in); 
     int one, two, three; 
     one = scan.nextInt(); 
     two = scan.nextInt(); 
     three = scan.nextInt(); 
     double average = (((double)one+two+three)/3); 
      
     if(average >= 89.5) { 
         System.out.println("ABOVE AVERAGE"); 
     } 
    } 
} 