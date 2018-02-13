package Ultimate_Frisbee;

public class UltimatePlayer extends Person {
	
	static int jerseyNumber = 0;
	static String pos = "";
	
	
	public UltimatePlayer(String firstName, String lastName, String position) {
		super(firstName, lastName);
		jerseyNumber++;
		pos = position;
		
	}
	public String getPosition() {
		return pos;
	}
	public String toString() {
		return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + pos;
	}
}
