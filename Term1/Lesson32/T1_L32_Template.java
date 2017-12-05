package Lesson32;
/*
 * Lesson 32 - Unit 4 - Parameters
 */


import java.util.Scanner;
import java.lang.Math;

public class T1_L32_Template{
     
     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a decimal value");
        double value = scan.nextDouble();
        
        System.out.println(square(value));
        scan.close();
     }
     public static double square (double num) {
    	 double squaredNum = num * num;
    	 return squaredNum;
     }

}


