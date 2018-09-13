package _Class_Work;

import java.util.*;

public class arrayFun {

	public static void main(String[] args) {
		//ARRAYS
		int[] array1 = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
		int[] array2 = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
		
		//SETTINGS: true = array1	false = array2
		boolean whichArrayToUse = false;
		
		//PRINT
		System.out.println(Arrays.toString(whichArrayToUse ? array1 : array2));
		System.out.println(sum((whichArrayToUse ? array1 : array2), 3, 6)); //arrayName, startIndex, stopIndex
		System.out.println(sum((whichArrayToUse ? array1 : array2), 2, 9)); //arrayName, startIndex, stopIndex
		System.out.println();
		System.out.println(numCount((whichArrayToUse ? array1 : array2), 4)); //arrayName, numToLookFor
		System.out.println(numCount((whichArrayToUse ? array1 : array2), 9)); //arrayName, numToLookFor
		System.out.println(numCount((whichArrayToUse ? array1 : array2), 7)); //arrayName, numToLookFor
		System.out.println();
		System.out.println(delete((whichArrayToUse ? array1 : array2), 7)); //arrayName, numToDelete
		
	}
	public static String sum(int[] array, int start, int stop) {
		int sum = 0;
		for(int i = start; i < array.length || i < stop; i ++) {
			sum+=array[i];
		}
		String printHeader = "sum of spots " + start + "-" + stop + "  =  ";
		return new String (printHeader + sum);
	}
	public static String numCount(int[] array, int num) {
		int counter = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == num) {
				counter++;
			}
		}
		String printHeader = "# of " + num + "s  =  ";
		return new String (printHeader + counter);
	}
	public static String delete(int[] array, int num) {
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
		return new String (printHeader + Arrays.toString(newArray));
	}

}
