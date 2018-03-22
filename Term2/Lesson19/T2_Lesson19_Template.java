package Lesson19;

/*
 * Lesson 19 - Unit 8 - 2-D Array
 */
import java.io.*;
import static java.lang.System.*;

import java.util.Arrays;
import java.util.Scanner;

public class T2_Lesson19_Template{
	 public static void main (String args[]) {
		 
	     int[][] grid = new int[3][4]; //3 ros, 4 columns
	     int[] test = new int[5];
	     grid[1][2] = 5; //row 1, column 2 = 5
	     
	     for(int i = 0; i < grid.length; i++) {
	    	 System.out.println(Arrays.toString(grid[i]));
	     }
	 }
}