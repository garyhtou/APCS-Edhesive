package _Class_Work;

public class recursiveMethod {

	public static void main(String[] args) {
		//printDecimal(1497);
		recur1(6);

	}
	public static void printDecimal(int n){
		if(n>=10) {
			printDecimal(n/10);
		}
		System.out.println(n/10);
	}
	public static void recur1(int n) {
		if(n>0)
			recur1(n-2);
		System.out.println(n + " ");
	}


}
