package Ultimate_Frisbee;

import java.util.ArrayList;

public class UltimateTeam {
	ArrayList<UltimatePlayer> playersList = new ArrayList<UltimatePlayer>();
	ArrayList<Coach> coachesList = new ArrayList<Coach>();
	public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches) {
		playersList = (ArrayList<UltimatePlayer>) players.clone();
		coachesList = (ArrayList<Coach>) coaches.clone();
	}
	public String getCutters() {
		String output = "";
		for(UltimatePlayer p : playersList) {
			if(p.getPosition().equals("cutter")) {
				output += p.toString() + "\n";
			}
		}
		return output;
	}
	public String getHandlers() {
		String output = "";
		for(UltimatePlayer p : playersList) {
			if(p.getPosition().equals("handler")) {
				output += p.toString() + "\n";
			}
		}
		return output;
	}
	public String toString() {
		String output = "";
		output += "COACHES\n";
		for(Coach c : coachesList) {
			output += c.toString() + "\n";
		}
		
		output += "\nPLAYERS\n";
		for(UltimatePlayer p : playersList) {
			output += p.toString() + "\n";
		}
		return output;
	}
}
