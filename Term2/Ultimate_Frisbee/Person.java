package Ultimate_Frisbee;

public class Person {
	
	static String fName = "";
	static String lName = "";
	
	public Person() {};
	public Person(String firstName, String lastName) {
		fName = firstName;
		lName = lastName;
	}
	public String toString() {
		return lName + ", " + fName;
	}
}
