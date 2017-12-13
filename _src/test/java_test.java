package test;
import java.util.ArrayList;

import _Interfaces.IGeneral;

public class java_test implements IGeneral{

	public static void main(String[] args) {

	}
	
	public static void test() {
		ArrayList<String> list = new ArrayList<String>();
		int INDEX = 1;
		String VALUE_REMOVED = "hi";
		
		list.add(INDEX, VALUE_REMOVED);		
	}
}