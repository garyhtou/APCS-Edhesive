package Lesson30;
/*
 * Lesson 30 Coding Activity 
 * Due to a problem with a scanner an array of words was created 
 * with spaces in incorrect places. Write the code to process the 
 * list of words and trim any spaces out of the words.
 *
 * So if the list contains:
 *      {"every", " near ing ", " checking", "food ", "stand", "value "}
 *
 * It should be changed to hold:        
 *      {"every", "nearing", "checking", "food", "stand", "value"}
 *         
 * Note that this activity does not require you to print anything. 
 * Your code should end with the array list still declared and
 * containing the resulting words.
 * 
 */


import java.util.Scanner;

class Lesson_30_Activity {

    public static String [] list = {};
  
    
    
    public static void main(String[] args) {
    	
    	//METHOD ONE
    	/*String word = "";
    	
    	for(int i = 0; i < list.length; i++) {
    		word="";
    		for(int k = 0; k < list[i].length(); k++) {
    			if(list[i].charAt(k) != ' ') {
    				word+=list[i].charAt(k);
    			}
    		}
    		list[i]=word;
    	}*/
    	
    	//METHOD TWO
    	for(int i = 0; i < list.length; i++) {
    		list[i]=list[i].replaceAll(" ", "");
    	}
    }
}