package _Interfaces;

public interface debug {
	/**
	 * println a String
	 * @param string String to be printed
	 */
	public static void pl(String string) {
		System.out.println("*** " + string);
	}
	
	/**
	 * println a String
	 * @param string String to be printed
	 */
	public static void p(String string) {
		System.out.print("*** " + string);
	}
}
