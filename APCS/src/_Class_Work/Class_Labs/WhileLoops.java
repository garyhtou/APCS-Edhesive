package _Class_Work.Class_Labs;

public class WhileLoops { 
     
    public static void main(String[] agrs) { 
         
        LoopDivisor(); 
         
    } 
     
    public static void LoopDigit() { 
         
        int num = 234, digits=0; 
        int orginal = num; 
        while(num>0) { 
            digits++; 
            num = (num/10); 
        } 
        System.out.println(orginal + " contains " + digits +" digits");     
    } 
     
    public static void LoopAdd() { 
        int num = 234, orginal = num, sum = 0; 
        while(num>0) { 
            sum += (num%10); 
            num = num/10; 
        } 
        System.out.println(sum + " is the sum of the digits of " + orginal); 
    } 
     
    public static void LoopAvg() { 
        int num = 234, orginal = num, sum = 0; 
        double digits = 0; 
        while(num>0) { 
            sum += (num%10); 
            num = num/10; 
            digits++; 
        } 
        System.out.println(orginal + " has a digit average of " + (sum/digits)); 
    } 
     
    public static void LoopDivisor() { 
        int num= 100, count = 1; 
        String divisors = ""; 
        while(count<num) { 
             
            if((num%count)==0){ 
                divisors = divisors + Integer.toString(count) + " "; 
            }  
            count++;
        } 
        System.out.println(num + " has divisors " + divisors);
    } 
     
  
} 
 