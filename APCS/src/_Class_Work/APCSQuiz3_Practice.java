package _Class_Work;

/*
************************ANSWER ON PAPER***********************

Name:											Date:

public class APCSQuiz3_Practice
{
	public static void main(String[] args) 
	{
		// Question 1 [5 points]: Go to each function and find out and write its output. 
		
		question1_f(); System.out.println();
		question1_g(); System.out.println();
		question1_h(); System.out.println();
		question1_i(); System.out.println();
		question1_j(); System.out.println();
		
		// Question 2 [5 points]: Go to each function and find out errors and fix them.
		question2_f(); System.out.println();
		question2_g(); System.out.println();
		question2_h(); System.out.println();
		question2_i(); System.out.println();
		question2_j(); System.out.println();
		
		
		// Question 3 [6 points]: Write for loops to produce the intended output. Points will be deducted for using "if statements'.

	}
	
	
 
// Start of Question 1 methods
	
	
	public static void question1_f() 
	{
		for (int i = 0; i < 3; i++)
		{
			int total = i + i;
			System.out.print(total);
		}
	}
	// Above method prints ___________________?
	
	public static void question1_g() 
	{
		int a = 1;
		int b = 1;
		int c = 1;
		for (int i = 0; i < 2; i++)
		{	
			System.out.print(c);
			c = b;
			b = a + b;
			a = c;
		}
	}
	// Above method prints ___________________?
	
	public static void question1_h() 
	{
		int i = 2;
		for (i = 0; i < 2; i++)
		{

		}

		for (int j = 0; j < 2; j++)
		{
			System.out.print(i * j);
		}
	}
	// Above method prints ___________________?
	
	
 
public static void question1_i() 
	{
		int i = 0, j = 0;
		int k = 1;
		for (i = 0; i < 2; i++)
		{
			k = 2;
		}
		
		for (j = 4; j < 2; j++)
		{
			k = 3;
		}
		
		System.out.print(i);
		System.out.print(j);
		System.out.print(k);
	}
	// Above method prints ___________________?

	public static void question1_j() 
	{
		int total = 5;
		for (int i = 0; i < 2; i++)
		{
			total = total + 1;
		}
		
		for (int j = 3; j >= 2; j--)
		{
			total--;
		}
		System.out.print(total);
	}
	// Above method prints ___________________?
	
	// End of Question 1 methods

	
 
// Start of Question 2 methods
	
	// Something wrong with following methods which we need to fix.
	// Each method has only one syntax error to be fix. Can you find and fix those errors?

	
	
	public static void question2_f() 
	{
		for (int i = 0; i < 3; i++)
		{
			int i = 5;
			System.out.print(i);;
		};
	}
	
	public static void question2_g() 
	{
		for (int i = 0; i < 3; i++)
		{
			int total = total + i;
		}
		System.out.print(total);
	}
	
	public static void question2_h() 
	{
		for (int i = 0; i < 3; i++)
		{
			System.out.print(i);
		}
		
		for (i = 0; i < 3; i++)
		{
			int total = i;
			System.out.print(total);
		}
	}
	
	
 
public static void question2_i() 
	{
		String s = "1";
		for (int i = 4; i > 2; i--)
		{
			s <= s + "1";
		}
		System.out.print(s);
	}
	
	public static void question2_j() 
	{
		int i = 0, total = 0;
		for (i = 0; i < 2; i++)
		{
			total = total + 1;
		{
		
		System.out.print(total);
	}

	// End of Question 2 


	
 
// Start of Question 3 writing for loops

3.a	Write nested for loops to produce the following output:

1
22
333
4444
55555
666666
7777777
		
3.b 	Write nested for loops to produce the following output:

     1
    22
   333 
  4444
 55555

3.c	Write nested for loops to produce the following output:

00112233445566778899
00112233445566778899
00112233445566778899


	
	

*/
