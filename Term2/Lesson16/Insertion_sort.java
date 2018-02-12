package Lesson16;

import java.util.Arrays;

WATCH VIDEO!

public class Insertion_sort {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 3, 2, 5, 4};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] insertionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int k = i; k >= 0 ; k--) {
				if(arr[k] > arr[i]) {
					int temp = arr[i];
					for(int j = arr.length-1; j >= k; j--) {
						arr[j] = arr[j-1];
					}
					arr[k] = temp;
					break;
				}
			}
		}
		return arr;
	}
}
