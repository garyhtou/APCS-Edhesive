package Labs.Magpie.Activity_3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * A program to carry on conversations with a human user.
 * This version: 
 * <ul><li>
 *    Uses advanced search for keywords 
 * </li></ul> 
 *    
 * @author Laurie White
 * @version April 2012
 */
public class Magpie3
{
	/**
	 * Get a default greeting
	 * 
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
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if(checkTeacher(statement).get(0).equals("t")){
			response = checkTeacher(statement).get(1);
		}
		else if(findKeyword(statement, "you")>=0 && findKeyword(statement, "?")>=0) {
			response = "I don't know.";
		}
		else if(findKeyword(statement, "the time")>=0 && findKeyword(statement, "?")>=0){
			response = "The time is " + new SimpleDateFormat("HH:mm:ss").format(new Date());
		}
		else if((findKeyword(statement, "follow")>=0 || findKeyword(statement, "add")>=0) &&
				(statement.contains("social media") || statement.contains("instagram") || statement.contains("facebook") || statement.contains("snapchat") || statement.contains("twitter"))) {
			response = "Sorry, I don't have any social medias";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no").
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @param startPos
	 *            the character of the string to begin the
	 *            search at
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	public int findKeyword(String statement, String goal,
			int startPos)
	{
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.toLowerCase().indexOf(
				goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn)
						.toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1)
						.toLowerCase();
			}

			// If before and after aren't letters, we've
			// found the word
			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) // before is not a
											// letter
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(),
					psn + 1);

		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	public int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
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
	private ArrayList<String> checkTeacher(String statement) {
		//TODO: fix input: "she she she", output: She sounds like a good teacher."
		final String[] namePronouns = 	{"Mr", 	"Ms", 	"Mrs", 	"Miss", "Dr", 	"Professor"};
		final String[] genderPronouns = {"He", 	"She", 	"She", 	"She", 	"They", "They"};
		//boolean[] keepChecking = 		{true, 	true, 	true, 	true, 	true, 	true};
		String contains = "f"; //false
		String response = null;
		for(int i = 0; i < namePronouns.length; i++) {
			if(findKeyword(statement, namePronouns[i])>=0) {
				if(response == null) {
					contains = "t"; //true
					response = genderPronouns[i] + " sounds like a good teacher.";
					
				}
				else if(findKeyword(statement, "Both")>=0) {
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
