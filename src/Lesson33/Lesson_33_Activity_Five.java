package Lesson33;
/*
 * Lesson 33 Coding Activity 5
 * 
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 * 
 * For questions 2-5, you may want to start with the printIt method 
 * and use it to test the other three.
 *  
 * Write a method that takes an array of ints, an integer value, 
 * and an integer index.The method should insert the value at the given
 * index and move the values afterwards by one.
 * 
 * This method must be called insertValue() and must have the following 
 * parameter types: int[], integer, integer. 
 * 
 * Calling insertValue(a, 100, 2) would change the array {1, 2, 3, 4, 5} 
 * to {1, 2, 100, 3, 4}.
 */


import java.util.Arrays;
import java.util.Scanner;

class Lesson_33_Activity_Five {
	public static void main(String[] args) {
		int[] a  = {3, 4, 5, 6, 7};
		insertValue(a, 100, 1);
		
	}
	public static void insertValue(int[] array, int num, int index) {
		int[] newarray = new int [array.length];
		boolean needBreak = false;
		for(int i = array.length-1; i >= 0; i--) {
			if(i == index) {
				newarray[i] = num;
				break;
			}
			else {
				if(!needBreak) {
					newarray[i] = array[i-1];
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			array[i] = newarray[i];
		}
		System.out.print(Arrays.toString(array));
		//FIXME: not working
	}
}