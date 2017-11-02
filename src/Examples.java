import _Interfaces.IC_General;

public class Examples{

	public static void main(String[] args) {
		
		ReverseStringArray();

	}
	
	public static void ReverseStringArray() {
		
		//Use string builder to reverse a string
		
		String list [] = {"every", "nearing", "checking", "food", "stand", "value"};
		
		String word = null;
		for (int i=0; i < list.length; i++) {
			word = new StringBuilder(list[i]).reverse().toString();
			list[i]=word;
			System.out.println(list[i]);
		}
	}

}