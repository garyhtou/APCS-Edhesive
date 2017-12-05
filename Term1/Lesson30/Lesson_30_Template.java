package Lesson30;

//THIS IS SUPPOSED TO BE ON PAPER

/*Prints out the last letter in every element inside an array*/

public class Lesson_30_Template {

	public static String [] cities = {};
	
	public static void main(String[] args) {
		for(int i = 0; i < cities.length; i++) {
			System.out.println(cities[i].charAt(cities[i].length()-1));
		}
		
		
	}

}
