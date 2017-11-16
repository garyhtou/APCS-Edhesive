package _Class_Work;

import java.util.*;

public class arrayFun {

	public static void main(String[] args) {
		int[] array1 = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
		int[] array2 = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
		
		//CALL METHODS HERE
		sum(array1, 0, 5); //arrayName, startIndex, stopIndex
		numCount(array2, 4); //arrayName, numToLookFor
		delete(array2, 7); //arrayName, numToDelete
		
	}
	public static void sum(int[] array, int start, int stop) {
		System.out.println("SUM\n");
		System.out.println("Starting Array:  " + Arrays.toString(array));
		int sum = 0;
		for(int i = start; i < array.length || i < stop; i ++) {
			sum+=array[i];
		}
		String printHeader = "sum of spots " + start + "-" + stop + "  =  ";
		System.out.println(printHeader + sum + "\n\n---------------");
	}
	public static void numCount(int[] array, int num) {
		System.out.println("NUMBER OF TIIMES AN ITEM IS IN THE ARRAY\n");
		System.out.println("Starting Array:  " + Arrays.toString(array));
		int counter = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == num) {
				counter++;
			}
		}
		String printHeader = "# of " + num + "s  =  ";
		System.out.println(printHeader + counter + "\n\n---------------");
	}
	public static void delete(int[] array, int num) {
		System.out.println("DELETE CERTAIN ITMES IN THE ARRAY\n");
		System.out.println("Starting Array:  " + Arrays.toString(array));
		//This is the same code as numCount
		int numOfNum = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == num) {
				numOfNum++;
			}
		}
		
		
		int[] newArray = new int [(array.length-numOfNum)];
		int newArrayIndex = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] != num) {
				newArray[newArrayIndex]=array[i];
				newArrayIndex++;
			}
		}
		String printHeader = "new array with all " + num + "s removed  =  ";
		System.out.println(printHeader + Arrays.toString(newArray) + "\n---------------");
	}

}
