package _Interfaces;

import java.io.PrintStream;
import java.util.Scanner;

public class IC_General implements I_General {
	

	public static void main(String[] args) {
		System.out.println("Asfasdf");
	}
	
	public static final IC_General g = new IC_General();
	
	//Scanner declare
	Scanner scan = new Scanner (System.in);

	
	//System.out.print
	public void Print(Object input) {
		System.out.print(input);
		
	}

	//System.out.println
	public void Println(String input) {
		System.out.println(input);
		
	}

	//Scan
	public Object Scan(String dataType) {
		if(dataType.compareTo("int")==0) {
			int output = scan.nextInt();
			return output;
		}
		if(dataType.compareTo("String")==0) {
			String output = scan.nextLine();
			return output;
		}
		if(dataType.compareTo("double")==0) {
			Double output = scan.nextDouble();
			return output;
		}
		if(dataType.compareTo("float")==0) {
			float output = scan.nextFloat();
			return output;
		}
		else {
			return "ERROR, invalid data type";
		}
	}

	
	public void DebugPrint(Object var) {
		System.out.println("\t\t" + var);
	}
	
	/*public int ScanInt () {
		int output = scan.nextInt();
		return output;
	}
	public String ScanString () {
		String output = scan.nextLine();
		return output;
	}
	public double ScanDouble () {
		Double output = scan.nextDouble();
		return output;
	}
	public float ScanFloat () {
		float output = scan.nextFloat();
		return output;
	}*/



	


}
