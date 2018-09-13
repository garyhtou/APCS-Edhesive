package frq2017;

import java.util.ArrayList;

public class Digits {
	private ArrayList<Integer> digitList;
	
	public static void main(String[] args) {
		Digits d1 = new Digits(15704);
		
	}
	
	public Digits(int num) {
		int length = Integer.toString(num).length();
		for(int i = 0; i < length; i++) {
			digitList.add(0, num%10);
			num/=10;
		}
		System.out.print(num);
	}
	
	public boolean isStriclyIncreasing() {
		return false;
	}
	
	
}
