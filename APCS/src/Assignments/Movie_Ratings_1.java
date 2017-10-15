package Assignments;
import java.util.Scanner; 
  
public class Movie_Ratings_1 { 
  
    public static void main(String[] args) { 
         
        //Website ratings 
        int web1, web2, web3; 
        //Focus group ratings 
        double fg1, fg2; 
        //Movie critic rating 
        double c; 
        //Averages of Website and Focus group 
        double aw, afg; 
         
        Scanner scan = new Scanner (System.in); 
         
         
        System.out.println("Please enter ratings from the movie review website."); 
        web1 = scan.nextInt(); 
        web2 = scan.nextInt(); 
        web3 = scan.nextInt(); 
         
        System.out.println("\nPlease enter ratings from the focus group."); 
        fg1 = scan.nextDouble(); 
        fg2 = scan.nextDouble(); 
         
        System.out.println("\nPlease enter the average movie critic rating."); 
        c = scan.nextDouble(); 
         
         
        aw = (((double)web1 + (double)web2 + (double)web3)/3); 
        afg = (((double)fg1 + (double)fg2)/2); 
         
         
        System.out.println("\nAverage website rating: " + aw); 
        System.out.println("Average focus group ratting: " + afg); 
        System.out.println("Average movie scritic rating: " + c); 
         
        System.out.println("Overall movie rating: " + ((aw * .20)+(afg * .30)+(c * .50))); 
         
         
         
    } 
  
} 