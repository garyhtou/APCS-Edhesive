package Lesson20;

import java.util.Arrays;

public class Lesson30Template {

	final static int numStudents = 10;
	final static int numTests = 5;
	
	public static void main(String[] args) {
		double[][] scores = new double[numStudents][numTests];
		double[] testAvg = new double[numTests];
		
		random(scores);
		for(int i = 0; i < scores.length; i++) {
			System.out.println(Arrays.toString(scores[i]));
		}
		
		calcTestAvg(scores, testAvg);
		System.out.println("\nClass Avg: " + Arrays.toString(testAvg));
	}
	public static void random(double[][] s) {
		for(int i = 0; i < s.length; i++) {
			for(int k = 0; k < s[i].length; k++) {
				s[i][k] = (int)((Math.random()*100)+1);
			}
		}
	}
	public static void calcTestAvg(double[][] s, double[] a) {
		for(int i = 0; i < s[0].length; i++) {
			double sum = 0;
			for(int k = 0; k < s.length; k++) {
				sum += s[k][i];
			}
			a[i] = sum/s.length;
		}
	}

}
