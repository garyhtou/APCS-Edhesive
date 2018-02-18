package Lesson16;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * THIS DOESN'T REALLY WORK, FIRST INDEX IS SIMIPLILY MOVED TO THE LAST INDEX, NOT SORTED. everything else words
 * @author gt
 *
 */
public class Insertion_sort {
	public static void main(String[] args) {
		/*ArrayList<Double> list = new ArrayList<Double>();
		for(int i = 0; i < 200; i++) {
			list.add(Math.random() * 100000 - 50000);
		}
		double[] arr = new double[list.size()];
		for(int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}*/
		
		double[] arr2 = new double[] {100, 2, 3, 4, 5, 4, 3, 2, 1, 0, -2, 9};
		
		insertionSort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
	public static void insertionSort(double[] arr) {
		for(int i = 1; i < arr.length; i++) {
			double temp = arr[i];
			for(int k = i; k >= 0 ; k--) {
				if(arr[k] < arr[i] || k == 0) {
					for(int j = i; j > k; j--) {
						arr[j] = arr[j-1];
					}
					arr[k] = temp;
					break;
				}
			}
		}
	}
}
