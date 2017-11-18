package _Class_Work;

import java.util.*;

public class arrayOdd {

	public static void main(String[] args) {
		int [] Array1 = {2, 4, 6, 8, 10, 12, 14};
		int [] Array2 = {2, 3, 4, 5, 6, 7, 8, 9};
		int [] Array3 = {2, 10, 20, 21, 23, 24, 40, 55, 60, 61};
		
		sort(Array1, numOddEven(Array1));
		System.out.println();
		sort(Array2, numOddEven(Array2));
		System.out.println();
		sort(Array3, numOddEven(Array3));

	}
	public static int[] numOddEven(int[] array) {
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0) {
				even++;
			}
			else {
				odd++;
			}
		}
		int[] data = {even, odd};
		return data;
	}
	public static void sort(int[] array, int[] OddEven) {
		int numOfEven = OddEven[0];
		int numOfOdd = OddEven[1];
		
		int[] even = new int [numOfEven];
		int[] odd = new int [numOfOdd];
		
		int indexEven = 0;
		int indexOdd = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0) {
				even[indexEven] = array[i];
				indexEven++;
			}
			else {
				odd[indexOdd] = array[i];
				indexOdd++;
			}
		}
		System.out.println("Odds = " + Arrays.toString(odd));
		System.out.println("Evens = " + Arrays.toString(even));
	}

}
