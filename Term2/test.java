import _Interfaces.debug;

public class test implements debug{

	public static void main(String[] args) {
		int[] list = { 1, 6, 23, 7, 3, 5, 6 };
		int t = 0;
		for (int i = 0; i < list.length; i += 2) {
		    t = t + list[i];
		}
		
		debug.pl(t);
	}

}
