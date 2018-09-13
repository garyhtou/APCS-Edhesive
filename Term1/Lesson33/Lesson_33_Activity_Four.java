package Lesson33;
/*
 * Lesson 33 Coding Activity 4
 * 
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 *  
 * For questions 2-5, you may want to start with the printIt method 
 * and use it to test the other three.
 *  
 * Write a method that takes an array of ints and reverses the order 
 * of the values in the array. So the array {1, 2, 3} would be changed to {3, 2, 1}
 * 
 * This method must be called reverse() and it must take an int[] parameter. 
 */


import java.util.Scanner;

class Lesson_33_Activity_Four {
	public static void main(String[] args) {
		
		
	}
	public static void reverse(int[] array) {
		int reversedArrayIndex = 0;
		int[] reversedArray = new int [array.length];
		for(int i = array.length-1; i >= 0; i--) {
			reversedArray[reversedArrayIndex] = array[i];
			reversedArrayIndex++;
		}
		reversedArrayIndex = 0;
		for(int i = 0; i < array.length; i++) {
			array[i] = reversedArray[reversedArrayIndex];
			reversedArrayIndex++;
		}
	}
}