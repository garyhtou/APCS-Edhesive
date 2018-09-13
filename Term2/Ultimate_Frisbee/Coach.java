package Ultimate_Frisbee;

public class Coach extends Person{
	String teamRole;
	public Coach(String firstName, String lastName, String role) {
		super(firstName, lastName);
		teamRole = role;
	}
	public String toString() {
		return super.toString() + "\n   Role: " + teamRole;
	}
}
