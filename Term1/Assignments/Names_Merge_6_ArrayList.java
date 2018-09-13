package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//test

/*

In this lab, you will be creating a program that merges two arrays of names. Your program will accept each array as input from the keyboard taking all strings and then reformat them in title case. For example, "jOHN" would convert to "John", "megan" would convert to "Megan", and "ADAm" would convert to "Adam".

You do not know ahead of time how many values will be entered, but you can assume each array will have a maximum length of 10,000 elements. To stop entering values the user will enter the word "End". Note: that any combination of lowercase and uppercase characters that spell "End" should terminate asking for input.

The elements of the two input arrays should be in alphabetical order. In other words, each array element must have a value that is greater than or equal to the previous element value.

After the two arrays have been input, your program must check to make sure the elements of each array have been entered in order. If an out of order element is found, print the message "ERROR: Array not in correct order".

Your task is to merge the two input arrays into a new array, with all elements in alphabetical order. Print out each of the original arrays entered, followed by the merged array.

Please note that your program must output the arrays with exactly one space between each name.

Determining alphabetical order: take a look back at the lesson on String functions and specifically the compareTo method.

Sample Run 1:

Enter the values for the first array, up to 10000 values, enter 'End' to quit
Alf
BOB
heATher
john
ZoE
eNd

Enter the values for the second array, up to 10000 values, enter 'End' to quit
Chloe
dylan
michAEL
END

First Array
Alf Bob Heather John Zoe

Second Array
Chloe Dylan Michael

Merged Array
Alf Bob Chloe Dylan Heather John Michael Zoe
Sample Run 2:

Enter the values for the first array, up to 10000 values, enter 'End' to quit
heATher
john
ZoE
Alf
BOB
eNd

Enter the values for the second array, up to 10000 values, enter 'End' to quit
Chloe
dylan
michAEL
END

First Array
Alf Bob Heather John Zoe

Second Array
Chloe Dylan Michael

Error: Arrays not in correct order

 */

public class Names_Merge_6_ArrayList {

	static boolean incorrectOrder;
	
//MAIN
	public static void main(String[] args) {
		merge(entryArray(1), entryArray(2));
	}
	
//ENTRYCODE
	public static ArrayList entryArray(int arrayNum) {
		boolean continue_entry = true; //flag varible
		String text = null;
		String last_entry = "";
		ArrayList<String> list = new ArrayList<String>();
		if(arrayNum == 1) {
			text = "first";
		}
		else if(arrayNum == 2) {
			text = "second";
		}
		
		
		System.out.println("Enter the values for the " + text + " array, up to 10000 values, enter 'End' to quit");
		Scanner scan = new Scanner (System.in);
		//scan.next(); //tired using this to fix the next line problem, doesn't work
		while(continue_entry) {
			    String entry = scan.nextLine(); //scans for name
		    
			if((entry.toUpperCase().compareTo("END")==0)) { //If entry is less than last entry or if is "END"
				continue_entry = false;
			}
			else if (entry != null){
				list.add(entry);
				
				if(entry.compareTo(last_entry)<0) {
					incorrectOrder = true;
				}

				last_entry = entry;
				
			}
		}
		if(arrayNum == 1)
			System.out.println();
		
		//correct case, HEy -> Hey
		for(int i = 0; i < list.size(); i++) {
			/*array[i] = array[i].trim();
			String firstLetter = (array[i].substring(0, 1)).toUpperCase();
			String restLetters = (array[i].substring(1)).toLowerCase();
			String name = firstLetter+restLetters;
			array[i] = name;*/
			String name = list.get(i).trim();
			name = name.trim();
			name = name.toUpperCase().substring(0, 1) + name.toLowerCase().substring(1);
			list.set(i, name);
		}
		return list;
	}
	
//MERGE
	public static void merge(ArrayList<String> arrayOne, ArrayList<String> arrayTwo) {
		ArrayList<String> mergedArray = new ArrayList<String>(arrayOne);
		
		for(int i = 0; i < arrayTwo.size(); i++) {
			mergedArray.add(arrayTwo.get(i));
		}
		
		Collections.sort(mergedArray);
		Collections.sort(arrayOne);
		Collections.sort(arrayTwo);
		
		print(arrayOne, 1);
		print(arrayTwo, 2);
		print(mergedArray, 3);
		System.out.print("\n" + (incorrectOrder ? "Error: Arrays not in correct order" : ""));
		
	}
	
//PRINT
	public static void print(ArrayList array, int arrayNum) { //This method prints out the merged array
		String text = null;
		if(arrayNum == 1) {
			text = "First";
		}
		else if(arrayNum == 2) {
			text = "Second";
		}
		else if(arrayNum == 3) {
			text = "Merged";
		}
		else {
			System.out.println("ERROR - arrayNum not 1 or 2 or 3");
		}
		
		System.out.println();
		System.out.println(text + " Array");
		for(int i = 0; i < array.size(); i++) {
			if(array.get(i) != null) { //checks if there is something in the array element
				if(i==array.size()-1) //prints the last element without a space at the end
					System.out.print(array.get(i));
				else
					System.out.print(array.get(i) + " "); //prints element with one space at the end
			}
		}
		System.out.println();
	}

}