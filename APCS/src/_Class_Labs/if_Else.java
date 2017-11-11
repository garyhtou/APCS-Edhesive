package _Class_Labs; 
   
import java.util.Scanner;  
   
public class if_Else {  
      
    public static void main(String[] args) {  
          
        lab1();  
          
    }  
   
    public static void lab1() {  
          
        Scanner scan = new Scanner (System.in);  
          
        int one, two;  
          
        one = scan.nextInt();  
        two = scan.nextInt();  
          
        System.out.println(one + " -- " + two);  
          
        if(one > two) {  
            System.out.println("largest == " + one);  
            System.out.println("samllest == " + two);  
        }  
        else {  
            System.out.println("largest == " + two);  
            System.out.println("largest == " + one);  
        }  
    }  
      
    public static void lab2() {  
        //hello does not have the same letters as goodbye  
          
        Scanner scan = new Scanner (System.in);  
          
        String one, two;  
          
        one = scan.nextLine();  
        two = scan.nextLine();  
          
        if (one.equals(two)) {  
            System.out.println(one + " has the same letters as " + two);  
        }  
        else {  
            System.out.println(one + " does not have the same letters as " + two);  
        }  
          
          
    }  
      
    public static void lab3() {  
          
        Scanner scan = new Scanner (System.in);  
          
        String one, two;  
          
        one = scan.nextLine();  
        two = scan.nextLine();  
          
        int result = one.compareTo(two);  
          
        if(result < 0) {  
            System.out.println(one + " should be placed before " + two);  
        }  
        else {  
            System.out.println(one + " should be placed after " + two);  
        }  
    }  
      
    public static void lab4() {  
        Scanner scan = new Scanner (System.in); 
         
        int dash1, dash2; 
        int oneInt, twoInt, threeInt; 
        String securityNum; 
        String one, two, three; 
        int lengthOfNum; 
         
        securityNum = scan.nextLine(); 
         
        dash1 = securityNum.indexOf('-'); 
        dash2 = securityNum.lastIndexOf('-'); 
         
        one = securityNum.substring(0,dash1); 
        two = securityNum.substring((dash1+1),dash2); 
        three = securityNum.substring((dash2+1),(securityNum.length())); 
         
        oneInt = Integer.parseInt(one); 
        twoInt = Integer.parseInt(two); 
        threeInt = Integer.parseInt(three); 
        System.out.println("ss# " + securityNum + " has a total of " + (oneInt+twoInt+threeInt)); 
  
         
          
    }  
     
    public static void lab5() { 
        String one, two; 
        Scanner scan = new Scanner (System.in); 
        one = scan.nextLine(); 
        two = scan.nextLine(); 
        int oneLength, twoLength; 
        oneLength = one.length(); 
        twoLength = two.length(); 
         
        if(oneLength == twoLength) { 
            System.out.println(one + " has the same # of letters as " + two); 
        } 
        else { 
            System.out.println(one + " does not has the same # of letters as " + two); 
        } 
    } 
     
    public static void lab6() { 
        Scanner scan = new Scanner (System.in); 
        String one, two; 
        one = scan.nextLine(); 
        two = scan.nextLine(); 
        char oneL = one.charAt(0); 
        char twoL = two.charAt(0); 
         
        if(oneL==twoL) { 
            System.out.println(one + " has the same first letter as " + two); 
        } 
        else { 
            System.out.println(one + " does not has the same first letter as " + two); 
        } 
         
    } 
     
    public static void lab7() { 
        Scanner scan = new Scanner (System.in); 
        String word = scan.nextLine(); 
        System.out.println(word); 
        String wordUpper = word.toUpperCase(); 
        System.out.println(wordUpper); 
        int wordUpperSpace = wordUpper.indexOf(' '); 
        String wordUpperH = (wordUpper.substring(0,wordUpperSpace)+"-"+wordUpper.substring(wordUpperSpace+1)); 
        System.out.println(wordUpperH); 
         
         
         
         
    } 
}  
 