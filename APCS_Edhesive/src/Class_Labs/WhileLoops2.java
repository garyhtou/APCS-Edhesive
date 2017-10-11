package Class_Labs;

import java.lang.Math;

public class WhileLoops2 { 
  
    public static void main(String[] args) { 
         
        LoopRev(); 
  
    } 
     
    public static void LoopRev() { 
        int num = 5100; 
        int orginal = num; 
        String snum = Integer.toString(num); 
        int digits = snum.length(); 
         
        int rev = 0; 
  
        String reversed = ""; 
        int whileTimesRan = 0; 
        int while2TimesRan = 0; 
        int while3TimesRan = 0; 
        
        System.out.println(snum);
        
        while (while2TimesRan<digits) { 
            if(snum.charAt(0)=='0') {
            	snum = snum.substring(1);
            }
            while2TimesRan++;
        } 
        System.out.println(snum);
        
        digits = snum.length();
        
        while (whileTimesRan < digits) { 
            reversed += ((num%10)+""); 
            num /= 10; 
            whileTimesRan++; 
        } 
        System.out.println(reversed); 
        
        
        while (while3TimesRan<digits) { 
            if(reversed.charAt(0)=='0') {
            	reversed = reversed.substring(1);
            }
            while3TimesRan++;
        } 
        System.out.println(reversed);
                 
    } 
  
} 


