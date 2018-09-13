package Lesson12;

import java.util.ArrayList;

/*
Write a program to initialize an ArrayList of Strings and insert ten words.
Then, using Math.random, print two different Strings from the list.
Paste your program into the code-runner box below and press run.
For this activity, the words you use do not matter, but the values in the ArrayList should not contain any whitespace.
Every time you call main, it should print a different pair of values from the list.
Write your code in a class named Lesson_12_FastStart
 */

public class Lesson_12_FastStart {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Write");
		list.add("a");
		list.add("program");
		list.add("to");
		list.add("initialize");
		list.add("an");
		list.add("ArrayList");
		list.add("of");
		list.add("Strings");
		list.add("and");
		
		int ran1, ran2;
		ran1 = (int) ((Math.random()*3)+1);
		ran2 = (int) ((Math.random()*3)+1);
		
		System.out.println("Your two random words are: " + list.get(ran1) + " and " + list.get(ran2));
	}

}
