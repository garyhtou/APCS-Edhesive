package Labs.Magpie.Activity_2;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		if(statement.trim().length() != 0) {
			String response = "";
			if (statement.indexOf("no") >= 0)
			{
				response = "Why so negative?";
			}
			else if (statement.indexOf("mother") >= 0
					|| statement.indexOf("father") >= 0
					|| statement.indexOf("sister") >= 0
					|| statement.indexOf("brother") >= 0)
			{
				response = "Tell me more about your family.";
			}
			else if(statement.toUpperCase().contains("DOG")||statement.toUpperCase().contains("CAT")) {
				response = "Tell me more about your pets.";
			}
			else if(checkTeacher(statement).get(0).equals("t")){
				response = checkTeacher(statement).get(1);
			}
			else if(statement.contains("you") && statement.contains("?")) {
				response = "I don't know.";
			}
			else if(statement.contains("the time") && statement.contains("?")){
				response = "The time is " + new SimpleDateFormat("HH:mm:ss").format(new Date());
			}
			else if((statement.contains("follow") || statement.contains("add")) &&
					(statement.contains("social media") || statement.contains("instagram") || statement.contains("facebook") || statement.contains("snapchat") || statement.contains("twitter"))) {
				response = "Sorry, I don't have any social medias";
			}
			else
			{
				response = getRandomResponse();
			}
			return response;
		}
		return "Say something, please";
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4) {
			response = "and?...";
		}
		else if(whichResponse == 5) {
			response = "Never knew.";
		}

		return response;
	}
	
	/**
	 * Checks if a String contains a teacher's name
	 * @param statement
	 * @return an ArrayList {"f" for false or "t" for true, response}
	 */
	private static ArrayList<String> checkTeacher(String statement) {
		//TODO: fix input: "she she she", output: She sounds like a good teacher."
		final String[] namePronouns = 	{"Mr", 	"Ms", 	"Mrs", 	"Miss", "Dr", 	"Professor"};
		final String[] genderPronouns = {"He", 	"She", 	"She", 	"She", 	"They", "They"};
		//boolean[] keepChecking = 		{true, 	true, 	true, 	true, 	true, 	true};
		String contains = "f"; //false
		String response = null;
		for(int i = 0; i < namePronouns.length; i++) {
			if(statement.toUpperCase().contains(namePronouns[i].toUpperCase())) {
				if(response == null) {
					contains = "t"; //true
					response = genderPronouns[i] + " sounds like a good teacher.";
					
				}
				else if(response.contains("Both")) {
					response = "They all sound like good teachers.";
					break;
				}
				else{
					response = "Both of them sound like good teachers.";
				}
			}
		}
		ArrayList<String> list = new ArrayList<String>();
		list.add(contains);
		list.add(response);
		return list;
	}
}
