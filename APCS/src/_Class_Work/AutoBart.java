package _Class_Work;

public class AutoBart {

	public static void main(String[] args) {
		//writePunishment("I will use for-loops!", 18);
		//writePunishment("I love Edhesive", 12);
		//padString("hey", 6);
		vertical("HEY NOW");

	}
	
	public static void writePunishment(String message, int numOfTimes) {
		for(int i = 1; i <= numOfTimes; i++) {
			System.out.println(message);
		}
	}
	
	public static void padString(String message, int length) {
		System.out.print(message);
		int mLength = message.length();
		for(int i = mLength; i<=length; i++) {
			System.out.print(" ");
		}
	}
	
	public static void vertical(String message) {
		for(int i = 0; i < message.length(); i++) {
			System.out.println(message.substring(i, i+1));
		}
	}

}
