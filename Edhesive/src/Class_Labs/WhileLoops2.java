package Class_Labs;

import java.lang.Math;

public class WhileLoops2 { 
  
    public static void main(String[] args) { 
         
    	loopPerfect(); 
  
    } 
     
    public static void LoopRev() { 
        int num = 51005; //Input
        int orginal = num; //Used to keep orginal number
        
        String sNum = (Integer.toString(num)); //Turns the input into a string, then used to find length of input
        
        int sNumLength = sNum.length(); //CONSTANT, finds length of input
        int digits = sNum.length(); //updated to find current length
         
        int rev = 0; 
  
        String reversed = ""; //reversed string
        int while1TimesRan = 0; //for each while loop
        int while2TimesRan = 0; //for each while loop
        int while3TimesRan = 0; //for each while loop
        
        //System.out.println("sNum"+sNum);
        //System.out.println("sNumLength"+sNumLength);
        //System.out.println("digits, should be same as sNumLegnth"+digits);
        
        while (while1TimesRan<digits) { //use to remove pre-zeros (0100 -> 100)
            if(sNum.charAt(0)=='0') {
            	sNum = sNum.substring(1);
            }
            while1TimesRan++;
        } 
        //System.out.println("With pre-zeros removed (0100 -> 100)" + sNum);
        
        digits = sNum.length(); //update new length
        num = Integer.parseInt(sNum); //sNum (String) has to be updated to a int with num
        
        while (while2TimesRan < digits) { //reverse num
            reversed += (""+(num%10)); //the "+ allows (num%10) to be added to the string
            num /= 10; //cuts off last digit of num
            while2TimesRan++; 
        } 
        //System.out.println(reversed); 
        
        
        while (while3TimesRan<digits) { //remove pre-zeros after reverse (100 -> 001 -> 1)
            if(reversed.charAt(0)=='0') {
            	reversed = reversed.substring(1);
            }
            while3TimesRan++;
        } 
        System.out.println(reversed);
                 
    } 
    
    
    public static void loopPerfect() {
    	/*
    	 * input
    	 * find divisor, add to int
    	 * if int = input
    	 * print
    	 * 
    	 * 
    	 */
    	
    	int input = 33550336;
    	
    	int countDivisors = 1; 
    	
    	int divisorsSum = 0;
    	

    	
    	while (countDivisors < input) {
    		if ((input % countDivisors) == 0) {
    			divisorsSum += countDivisors;
    			//System.out.println(countDivisors +"     " + divisorsSum);
    		}
    		countDivisors++;
    	}
    	
    	if (divisorsSum == input) {
    		System.out.println(input + " is perfect.");
    	}
    	else if (divisorsSum != input) {
    		System.out.println(input + " is not perfect.");
    	}
    	//System.out.println(divisorsSum);
    	
    }
  
} 


