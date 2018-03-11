package _Classwork.Search_and_Sort;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch
{
	public static int getNextLargest(int[] numArray, int searchNum)
	{
		int closest = Integer.MAX_VALUE;
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] > searchNum && (numArray[i]-searchNum < closest-searchNum)) {
				closest = numArray[i];
			}
		}
		return closest;
	}
}