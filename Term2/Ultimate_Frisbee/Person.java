package Ultimate_Frisbee;

public class Person {
	
	private String fName = "";
	private String lName = "";
	
	public Person() {};
	public Person(String firstName, String lastName) {
		fName = firstName;
		lName = lastName;
	}
	public String toString() {
		return lName + ", " + fName;
	}
}
