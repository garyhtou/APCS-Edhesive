import java.util.Scanner;
import java.lang.Math;
public class Sample_Test_Redo {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String address;
		
		System.out.println("Enter one string that contains city and State and shipcode.");
		System.out.println("Enter it like this: Denver, Colorado; 80022");
		address = scan.nextLine();
		
		String city = address.substring(0, address.indexOf(','));
		String state = address.substring((address.indexOf(',')+2),address.indexOf(';'));
		String zipcode = address.substring((address.indexOf(';')+2));
		
		System.out.println(city);
		System.out.println(state);
		System.out.println(zipcode);
		
		
	}
}
