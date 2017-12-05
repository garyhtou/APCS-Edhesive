/*
Instructions:
		Seconds Since Unix Epoch:
		999999999

		Year: 2002
		Month: 1
		Day: 24
		Hour: 1
		Min: 46
		Sec: 39
		
		
		Seconds Since Unix Epoch:
		178437
		
		Year: 1970
		Month: 0
		Day: 2
		Hour: 1
		Min: 33
		Sec: 57
		 
		 */

package Assignments;

import java.util.Scanner;


public class Time_Converter_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int inputSec;
		int Year, Month, Day, Hour, Min, Sec;
		int YearMod, MonthMod, DayMod, HourMod, MinMod;
		
		int secInYear =  31104000;
		int secInMonth = 2592000;
		int secInDay =   86400;
		int secInHour =  3600;
		int secInMin =   60;
		
		
		
		System.out.println("Seconds Since Unix Epoch:");
		inputSec = scan.nextInt();

		
		//Sec. in Year 60*60*24*360=31104000
		Year =  	(inputSec/secInYear) + 1970;
		YearMod = (inputSec%secInYear);
		
		//Sec. in Month 60*60*24*30=2592000
		Month = YearMod/secInMonth;
		MonthMod = YearMod%secInMonth;
		
		//Sec. in Day 60*60*24=86400
		Day = MonthMod/secInDay;
		DayMod = MonthMod%secInDay;
		
		//Sec. in Hour 60*60=3600
		Hour = (int)DayMod/secInHour;
		HourMod = DayMod%secInHour;
		
		//Sec. in Min 60
		Min = (int)HourMod/secInMin;
		MinMod = HourMod%secInMin;
		
		//Sec. in Sec 1
		Sec = MinMod;

		
		System.out.println();
		System.out.println("Year: " + Year);
		System.out.println("Month: " + Month);
		System.out.println("Day: " + Day);
		System.out.println("Hour: " + Hour);
		System.out.println("Min: " + Min);
		System.out.println("Sec: " + Sec);
		
		
	}
}
