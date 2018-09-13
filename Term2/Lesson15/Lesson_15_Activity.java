package Lesson15;

import java.util.Arrays;

/*
Write a method, void sortAndPrint(String [] list), which implements a selection sort on the array list and prints the sorted values in order. Make sure to use the String.compareTo() method when sorting to decide the correct order of the Strings. For example, consider the following code:

String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
sortAndPrint(list);

The should print the following:

against belief democratic forms government movement understanding
For this activity, include your method in a class called Lesson_15_Activity. Copy the entire class into the coderunner box and press run.
 */

public class Lesson_15_Activity {

	public static void main(String[] args) {
		String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
		
		sortAndPrint(list);
	}
	public static void sortAndPrint(String [] list) {
		for(int i = 0; i < list.length; i++) {
			int smallest = i;
			for(int k = i; k < list.length; k++) {
				if(list[smallest].compareTo(list[k])>0) {
					smallest = k;
				}
			}
			String temp = list[smallest];
			list[smallest] = list[i];
			list[i] = temp;
		}
		//System.out.println(Arrays.toString(list));
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i] + " ");
		}
	}

}
