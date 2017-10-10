package Lesson11;
/* 
* Lesson 11 Coding Activity 3 
* Get two integers from the keyboard and test if they are equal. 
* If they are, print "YES" (without the quotes). 
*/ 
  
import java.util.Scanner; 
import java.lang.Math; 
  
  
class Lesson_11_Activity_Three {    
    public static void main(String[] args) {  
        Scanner scan = new Scanner (System.in); 
        int one = scan.nextInt(); 
        int two = scan.nextInt(); 
        if(one == two) { 
            System.out.println("YES"); 
        } 
    } 
} 