package Ultimate_Frisbee;

public class Captain extends UltimatePlayer{
	private boolean roleType; //true=offense, false=defense

	public Captain(String firstName, String lastName, String position, boolean type) {
		super(firstName, lastName, position);
		roleType = type;
	}
	public String toString() {
		return super.toString() + "\n   Captain: " + (roleType ? "offense" : "defense");
	}
}
