
public class test_file {

	public static void main(String[] args) {
		mystery(2, 5);
	}
	public static int mystery(int a, int b) {
	    System.out.println(a + " " + b);

	    if (a > b)
	        return mystery(a, Math.abs(b) + 1);
	    else if (b > a)
	        return mystery(Math.abs(a) + 1, b);

	    return 1;
	}
}
