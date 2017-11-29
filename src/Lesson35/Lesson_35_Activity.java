package Lesson35;
/*
 * Lesson 35 Coding Activity
 * 
 * Write four overloaded methods called randomize. Each method will
 * return a random number based on the parameters that it receives:
 * 
 * Write four overloaded methods called randomize. 
 * Each method will return a random number based on the parameters that it receives:
 * randomize() - Returns a random int between min and max inclusive. Must have two int parameters. 
 * randomize() - Returns a random int between 0 and max inclusive. Must have one int parameter. 
 * randomize() - Returns a random double between min and max inclusive. Must have two double parameters. 
 * randomize() - Returns a random double between 0 and max inclusive. Must have one double parameter. 
 * 
 * Because these methods are overloaded, they should be declared in the same class. 
 * To simulate this, copy all four methods into the single Code Runner box.
 */


import java.util.Scanner;

class Lesson_35_Activity {
  
    public static int randomize(int min, int max) {
    	int range = Math.abs(max-min);
    	return (int)(Math.random()*range)+min;
    }

    public static int randomize(int max) {
     return randomize(0, max);
    }

    public static double randomize(double min, double max) {
    	double range = Math.abs(max-min);
    	return Math.random()*range+min;
    }
  
    public static double randomize(double max) {
    	return randomize(0, max);
    }


    public static void main(String[] args)
     {
     /*
      * Test your method here
      * Copy and paste this entire class to Code Runner.
      */
    }
}