package _Classwork.Search_and_Sort;

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSortRunner
{
	public static void main(String args[])
	{
		WordSort sort = new WordSort("test tests");
		sort.setList("123 ABC abc 034 dog cat sally sue bob 2a2");
		sort.sort();
		System.out.println(sort.toString());
	}
}