package _Class_Work;

import java.util.*;

public class arrayOdd {

	public static void main(String[] args) {
		int [] Array1 = {2, 4, 6, 8, 10, 12, 14};
		int [] Array2 = {2, 3, 4, 5, 6, 7, 8, 9};
		int [] Array3 = {2, 10, 20, 21, 23, 24, 40, 55, 60, 61};
		
		boolean selected = false;
		while(!selected) {
			Scanner scan = new Scanner (System.in);
			System.out.println("Would you like to scan an array or use one of the presets?");
			String answer = scan.next();
			int arrayNum = 0;
			if(answer.equalsIgnoreCase("scan")) {
				System.out.println("How many integers would you like to scan?");
				arrayNum = scan.nextInt();
				int[] scannedArray = new int [arrayNum];
				for(int i = 0; i < scannedArray.length; i++) {
					System.out.println("Please enter an integer for index " + i);
					String input = scan.next();
					if(input.toUpperCase().equals(input.toLowerCase())) {
						int intInput = Integer.parseInt(input);
						scannedArray[i] = intInput;
					}
					else {
						System.out.println("that was not an integer");
						i--;
					}
				}
				System.out.println("");
				sort(scannedArray, numOddEven(scannedArray));
				selected = true;
			}
			else if(answer.equalsIgnoreCase("preset")){
				sort(Array1, numOddEven(Array1));
				System.out.println();
				sort(Array2, numOddEven(Array2));
				System.out.println();
				sort(Array3, numOddEven(Array3));
				selected = true;
			}
			else {
				System.out.println("please enter either either \"scan\" or \"preset\"");
				selected = false;
			}
		}
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
