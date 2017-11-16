package _Class_Work;

import java.util.*;

public class arrayMethod2OddorEven {

	public static void main(String[] args) {
		int[] array = {34, 3545, 53, 3463, 346, 3, 6, 34, 6346346};
		sort(array, numOddEven(array));

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
