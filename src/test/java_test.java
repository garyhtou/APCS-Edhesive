package test;
import java.util.ArrayList;

import interfaces.IGeneral;

public class java_test {

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int[] a2 = new int[] {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println(mystery(a));
	}
	
	//Lesson 15 Quick Start, Question 2
	//Wrong answer
	 public static boolean mystery(int[] a) {
	     boolean flag = false;
	     for (int i = 1; i < a.length; i++) {
	         if (a[i] < a[i - 1]) {
	             flag = true;
	             break;
	         }
	     }
	     return flag;
	}
	 /*
	 	Nothing, the loop does not access all elements of the array. 
  		Tests if the array is in ascending order. //Edhesive says this is correct
   		Nothing, the loop does not finish running. 
  		Tests if all values in the array are equal. 
		Tests if the array is in descending order. 
	  */
	 
	 
	 
	 
	 //quiz 3 toobox quesitons
	 
}