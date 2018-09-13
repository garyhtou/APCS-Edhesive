package _Classwork.Search_and_Sort;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] arr = NumberShifter.makeLucky7Array(100);
		NumberShifter.shiftEm(arr);
		System.out.println(Arrays.toString(arr));
	}
}



