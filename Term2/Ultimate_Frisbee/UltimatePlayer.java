package Ultimate_Frisbee;

public class UltimatePlayer extends Person {
	
	static int jerseyNumber = 0;
	private int myJerseyNum;
	private String pos;
	
	
	public UltimatePlayer(String firstName, String lastName, String position) {
		super(firstName, lastName);
		jerseyNumber++;
		myJerseyNum = jerseyNumber;
		if(position.equals("handler") || position.equals("cutter")) {
			pos = position;
		} else{
			pos = "handler";
		}
		
	}
	public String getPosition() {
		return pos;
	}
	public String toString() {
		return (super.toString() + "\n   Jersey #: " + myJerseyNum + "\n   Position: " + pos);
	}
}
