package Lesson20;
/*
 * Lesson 20 Coding Activity 
 * 
 * Computer science jobs are in demand. Right now we have a shortage 
 * of people that can do computer programming, and one of the fastest
 * growing areas of new jobs in the sector are so-called hybrid jobs. 
 * This means you specialize in an area like biology, 
 * and then use computer programming to do your job. 
 * 
 * These hybrid jobs exist in the arts, sciences,
 * economics, healthcare, and entertainment fields.
 * 
 * One of these jobs is computational biology. Computational Biology, 
 * sometimes referred to as bioinformatics, is the science of 
 * using biological data to develop algorithms and relations
 * among various biological systems.
 * 
 * In this lab we are going to investigate the data from a
 * grey seal named Gracie. WeÕll input the longitude and
 * latitude data from a tracking device. We want to investigate 
 * the farthest north, south, east and west Gracie has been.
 * 
 * We will use the latitude to measure this.
 * Write a program to enter GracieÕs longitude and Latitude data. 
 * Each time through the loop it should ask if you want to continue. 
 * Enter 1 to repeat, 0 to stop.
 * 
 * Any value for latitude not between -90 and 90 inclusive should be ignored.
 * 
 * Any value for longitude not between -180 and 180 inclusive should be ignored.
 *
 *
 *          Sample Run:
 *
 *              Please enter the latitude:
 *              41.678
 *              Please enter the longitude:
 *              69.938
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.755
 *              Please enter the longitude:
 *              69.862
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.829
 *              Please enter the longitude:
 *              69.947
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              300
 *              Please enter the longitude:
 *              69.947
 *              Incorrect Latitude or Longitude
 *              Please enter the latitude:
 *              41.827
 *              Please enter the longitude: 
 *              69.904
 *              Would you like to enter another location?
 *              0
 *              Farthest North: 41.829
 *              Farthest South: 41.678
 *              Farthest East: 69.947  
 *              Farthest West: 69.862
 *   
 */ 


import java.util.Scanner;
import java.lang.Math; 

class Lesson_20_Activity{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double longitude, latitude;
		double maxNorth=0,maxSouth=0,maxEast=0,maxWest=0;
		double cont = 1;
		
		int incorrect = 0; //1=incorrect
		

		
		
		System.out.println("Please enter the latitude:");
		latitude = scan.nextDouble();
		System.out.println("Please enter the longitude:");
		longitude = scan.nextDouble();
		
		//intital Longitude		
		if (longitude >=-180 && longitude <=180) {
		  	maxEast = longitude;
		  	maxWest = longitude;
		}
		else {
			incorrect = 1;
		}

		//intial Latitude
		if (latitude >=-90 && latitude <=90) {
	  		maxNorth = latitude;
	  		maxSouth = latitude;
	  	}
		else {
			incorrect = 1;
		}
	  	
		//Checks for incorrect longitude or latiude
		if (incorrect == 1) {
			System.out.println("Incorrect Latitude or Longitude");
			incorrect = 0;
		}
		else {
		System.out.println("Would you like to enter another location?");
		cont = scan.nextDouble();
		}
		
		
		while (cont == 1) {
			
			System.out.println("Please enter the latitude:");
			latitude = scan.nextDouble();
			System.out.println("Please enter the longitude:");
			longitude = scan.nextDouble();
			
			//Longitude		
			if (longitude >=-180 && longitude <=180) {
				if(longitude > maxEast) {
			  		maxEast = longitude;
				}
				if(longitude < maxWest) {
			  		maxWest = longitude;
				}
			}
			else {
			  	incorrect = 1;
			} 
			//Latitude
			if (latitude >=-90 && latitude <=90) {
		  		if(latitude > maxNorth) {
		  			maxNorth = latitude;
		  		}
		  		if(latitude < maxSouth) {
		  			maxSouth = latitude;
		  		}
			}
		  	else {
		  		incorrect = 1;
		  	}
			//Checks for incorrect longitude or latiude
			if (incorrect == 1) {
				System.out.println("Incorrect Latitude or Longitude");
				incorrect = 0;
			}
			else {
			System.out.println("Would you like to enter another location?");
			cont = scan.nextDouble();
			}
		}
		
		
		System.out.println("Farthest North: " + maxNorth);
		System.out.println("Farthest South: "+maxSouth);
		System.out.println("Farthest East: "+maxEast);
		System.out.println("Farthest West: "+maxWest);
		
		scan.close();
	
	}
}