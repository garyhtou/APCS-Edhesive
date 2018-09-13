package Ultimate_Frisbee;

/*

Assignment 3: Ultimate Frisbee
For this assignment, you will create a hierarchy of five classes to describe various elements of a an ultimate frisbee (Links to an external site.)Links to an external site. team. Ultimate frisbee is a non-contact sport with players at a position of “cutter” or “handler”. A team usually also has a head coach and possibly one or more assistant coaches. An ultimate team has seven players on the field, with four players at the position of cutter and three at the position of handler. Check out the below video to learn more about this great sport!

https://www.youtube.com/watch?v=OqBo-CCf5Gw&feature=youtu.be (Links to an external site.)Links to an external site.


The classes you will write are: Person, UltimatePlayer, Captain, Coach, and UltimateTeam. Detailed below are the requirements for the variables and methods of each class. You may need to add a few additional variables and/or methods; figuring out what is needed is part of your task for this assignment.

Person

Variables

String firstName - Holds the person's first name.
String lastName - Holds the person's last name.
Methods

Person(String firstName, String lastName) - Constructor that takes in String parameters representing the first and last names.
String toString() - Returns a String with the following format: lastName, firstName
UltimatePlayer extends Person

Variables

int jerseyNumber - Using a static variable to keep track of ultimate player jersey numbers, every player should be assigned a unique value for their own jersey number.
String position - Represents a player’s position. Possible values are “handler” and “cutter”.
Methods

UltimatePlayer(String firstName, String lastName, String position) - Constructor that accepts the first name, last name and the position of a player. The first and last names should be set by calling the constructor of the parent class. Position should be set to “handler” if the input string is not “handler” or “cutter”. The UltimatePlayer constructor also sets the jersey number to the next available positive integer. The first UltimatePlayer created should have a jersey number of 1, the second will have a jersey number of 2, third of 3, etc.
String getPosition() - Returns the UltimatePlayer's position.
String toString() - Returns a three-line String with UltimatePlayer information formatted as follows:
Smith, Mary
   Jersey #: 1
   Position: cutter
Note: there are three spaces before "Jersey #: ..." and "Position: ...".

Captain extends UltimatePlayer

Variables

boolean type - Captains on an Ultimate team are usually responsible for either offense or defense. This variable is a boolean representing the type of captain, true for offense, false for defense.
Methods

Captain(String firstName, String lastName, String position, boolean type) - The first and last names and the position should be set by calling the constructor of the parent class.
String toString() - Returns a four-line String with Captain info formatted as follows:
Lee, Sarah
   Jersey #: 2
   Position: handler
   Captain: offense
Note: there are three spaces before "Jersey #: ...", "Position: ..." and "Captain: ...".

Coach extends Person

Variables

String role - Role of coach on the team. This is a flexible description; there are no required values for this variable. For example, “Head Coach” or “Assistant Coach”.
Methods

Coach(String firstName, String lastName, String role) - The first and last names should be set by calling the constructor of the parent class.
String toString() - Returns a two-line String with Coach info formatted as follows:
Wagner, Rebecca
   Role: Head Coach
Note: there are three spaces before "Role: ...".

UltimateTeam

Variables

ArrayList<UltimatePlayer> players - The list of ultimate players on the team.
ArrayList<Coach> coaches - A list of the team’s coaches.
Methods

UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches) - A constructor that specifies the coaches and players of the team.
String getCutters() - Returns a String listing all the UltimateTeams's UltimatePlayers that have the position of “cutter”. Returns an empty String if the UltimateTeam does not have a player with position of “cutter”. See the Sample Run below for the format of the returned String.
String getHandlers() - Returns a String listing all the UltimateTeams's UltimatePlayers that have the position of “handler”. Returns an empty String if the UltimateTeam does not have a player with position of “handler”. See the Sample Run below for the format of the returned String.
String toString() - Returns a multiline String listing the Coaches and UltimatePlayers on the UltimateTeam. The String is formatted as follows:
COACHES
{listing of faculty}

PLAYERS
{listing of UltimatePlayers}
See the Sample Run below for an example.

Final Notes

Remember, all variables should have an access level of private and all required methods should have an access level of public. Wherever possible, the child class should use a call to the parent's toString and/or constructor methods.

Make sure that all files in your solution are in the same directory. Please download the runner class, Student_Runner_Ultimate.java (Links to an external site.)Links to an external site. into that directory, run the file in DrJava, and verify that the class output matches the Sample Run that follows. We will use a different runner to grade the program. Remember to change the runner to test different values to make sure your program fits the requirements.

Sample Run of Student_Runner_Ultimate.java (Links to an external site.)Links to an external site.:

Printing person:
   Doe, John

Printing player:
Smith, Mary
   Jersey #: 1
   Position: cutter

Printing captain:
Tully, Henry
   Jersey #: 2
   Position: handler
   Captain: offense

Printing coach:
Lee, Sara
   Role: Head coach

Printing team:
COACHES
Mathour, Maryam
   Role: Head Coach
Van Loben Sels, Soren
   Role: Assistant Coach

PLAYERS
Trong, Sammy
   Jersey #: 3
   Position: handler
Patel, Jayant
   Jersey #: 4
   Position: handler
Ozaeta, Myra
   Jersey #: 5
   Position: cutter
Holbrook, Lisa
   Jersey #: 6
   Position: cutter
Kvale, Lisbeth
   Jersey #: 7
   Position: cutter
Henry, Malik
   Jersey #: 8
   Position: handler
   Captain: offense
Pak, Joseph
   Jersey #: 9
   Position: cutter
   Captain: defense


Printing cutters:
Ozaeta, Myra
   Jersey #: 5
   Position: cutter
Holbrook, Lisa
   Jersey #: 6
   Position: cutter
Kvale, Lisbeth
   Jersey #: 7
   Position: cutter
Pak, Joseph
   Jersey #: 9
   Position: cutter
   Captain: defense


Printing handlers:
Trong, Sammy
   Jersey #: 3
   Position: handler
Patel, Jayant
   Jersey #: 4
   Position: handler
Henry, Malik
   Jersey #: 8
   Position: handler
   Captain: offense
Submitting your code

Below are the submission links for each class. You will have to submit each class separately by following the proper link below. Each of the 5 classes in this assignment is worth 2 points, for a total of 10.

Assignment 3: Ultimate Frisbee - Person Class Submission

Assignment 3: Ultimate Frisbee - UltimatePlayer Class Submission

Assignment 3: Ultimate Frisbee - Captain Class Submission

Assignment 3: Ultimate Frisbee - Coach Class Submission

Assignment 3: Ultimate Frisbee - UltimateTeam Class Submission


*/
