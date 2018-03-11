package _Classwork.Search_and_Sort;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	final static int NUM = 7;
	public static int[] makeLucky7Array( int size){
		int[] array= new int[size];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*10 + 1);
		}
		return array;
	}
	public static void shiftEm(int[] array){
		int numOf7s = 0;
		int temp;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == NUM) {
				array[i] = array[numOf7s];
				array[numOf7s] = NUM;
				numOf7s++;
			}
		}
	}
}