package Labs.Boxcar2_FreightTrain3;
/*
 * AP CS MOOC
 * Term 2 - Assignment 2, Part 1: Boxcar
 * A class which represents a single car on a freight train.
 */



/*
For this assignment, you will be writing a class called Boxcar that represents a single car on a freight train. Download the template file, Boxcar.java (Links to an external site.)Links to an external site., as a starting point. Your job is to add code to Boxcar.java so that your implementation meets the requirements specified below. To complete the assignment, replace all the/* missing code*\/ comments in the file with your own code. You do not need to change any other code in the file.

In previous assignments, we had a requirement that your class be named Main. In this assignment, the class is required to be named Boxcar.

Boxcar.java includes a main method that will help test your code. In order to fully test the Boxcar class, you will need to add more test cases to the main method. At a minimum, run the main to make sure your implementation output matches the sample run listed below. We will test your code using our own main method that is similar to the one provided.

When you are done coding and testing, copy and paste your entire Boxcar class (including the main method) into the Code Runner and press "Submit" in order for your assignment to count as turned in.

Variables

String cargo - Represents the type of cargo carried by the boxcar, with possible values of "gizmos", "gadgets", "widgets" and "wadgets". No other cargo types are allowed.
int numUnits - Represents the number of units carried by the boxcar. Must be between 0 and 10 inclusive.
boolean repair - Represents whether the boxcar is in repair or in service. Set to true if the boxcar is in repair. If the boxcar is in repair, numUnits must be 0.
Methods

Boxcar() - Default constructor that sets the boxcar to “gizmos”, 5 units, and in service (not in repair).
Boxcar(String c, int u, boolean r) - This constructor sets the cargo variable to the parameter c, but only if c is "gizmos", "gadgets", "widgets", or "wadgets". The constructor ignores the case of the value in c. If c holds any value other than "gizmos", "gadgets", "widgets", or "wadgets", the constructor sets cargo to "gizmos". The numUnits variable is set to the parameter u. If u is less than 0 or higher than the maximum capacity of 10 units, numUnits is set to 0. The repair variable is set to the parameter r. If repair is true, numUnits is set to 0 no matter what value is stored in the u parameter.
String toString () - returns a String with the Boxcar in the format:
5 gizmos	in service    
10 widgets	in service
0 gadgets	in repair
Notice there is one space in between the number of units and the cargo and a tab between the value for cargo and "in repair"/"in service”

void loadCargo() - This method adds 1 to the number of units in the BoxCar. The maximum capacity of a boxcar is 10 units. If increasing the number of units would go beyond the maximum, keep numUnits at the max capacity. If the repair variable is true, then numUnits may only be set to 0.
String getCargo() - This method returns the cargo type of the boxcar.
void setCargo(String c) - The cargo variable is set to c only if c is "gizmos", "gadgets", "widgets", or "wadgets", ignoring case. The value stored for cargo should be lowercase. If c holds any value other than  "gizmos", "gadgets", "widgets", or "wadgets" (ignoring case), the method sets the cargo to "gizmos".
boolean isFull() - The isFull method returns true if numUnits is equal to 10, false otherwise.
void callForRepair() - Sets repair to true. Recall that if the repair variable is true, then the numUnits variable may only be set to 0.
Sample Run

1. Test Boxcar()
*** PASS: cargo is set correctly (gizmos)
*** PASS: numUnits is set correctly (5)
*** PASS: repair is set correctly (false)
*** PASS: toString produced the correct output (5 gizmos	in service)

2. Test Boxcar(String c, int u, boolean r)
*** PASS: cargo is set correctly (gadgets)
*** PASS: numUnits is set correctly (0)
*** PASS: repair is set correctly (true)
*** PASS: toString produced the correct output (0 gadgets	in repair)

3. Test callForRepair()
*** PASS: cargo is set correctly (gizmos)
*** PASS: numUnits is set correctly (0)
*** PASS: repair is set correctly (true)
*** PASS: toString produced the correct output (0 gizmos	in repair)

4. Test loadCargo()
car3 holds 5 units.
*** PASS: cargo is set correctly (gizmos)
*** PASS: numUnits is set correctly (5)
*** PASS: repair is set correctly (false)
*** PASS: toString produced the correct output (5 gizmos	in service)
now car3 should hold 6 units.
*** PASS: cargo is set correctly (gizmos)
*** PASS: numUnits is set correctly (6)
*** PASS: repair is set correctly (false)
*** PASS: toString produced the correct output (6 gizmos	in service)
now car3 should hold 10 units.
*** PASS: cargo is set correctly (gizmos)
*** PASS: numUnits is set correctly (10)
*** PASS: repair is set correctly (false)
*** PASS: toString produced the correct output (10 gizmos	in service)
car1 is in repair, so we can't load cargo
*** PASS: cargo is set correctly (gizmos)
*** PASS: numUnits is set correctly (0)
*** PASS: repair is set correctly (true)
*** PASS: toString produced the correct output (0 gizmos	in repair)

5. Test isFull()
*** PASS: isFull() working properly
*** PASS: isFull() working properly

6. Test getCargo()
*** PASS: getCargo() working properly

7. Test setCargo(String)
*** PASS: cargo is set correctly (gadgets)
*** PASS: cargo is set correctly (widgets)
*** PASS: cargo is set correctly (wadgets)
*** PASS: cargo is set correctly (gizmos)
*/







public class Boxcar
{
    // Variables that will be initialized in the Boxcar constructors.
    private String cargo = ""; //"gizmos", "gadgets", "widgets" and "wadgets". No other cargo types are allowed.
    private int numUnits; //Must be between 0 and 10, inclusive
    private boolean repair; //in repair/service?    If true, numUnits must be 0
    
    // Default constructor that sets the boxcar to "gizmos", 5, and false.
    public Boxcar()
    {
        cargo = "gizmos";
        numUnits = 5;
        repair = false;
    }
    
    
    // This constructor sets the cargo variable to the parameter c, but only if
    // c is "gizmos", "gadgets", "widgets", or "wadgets". The constructor ignores
    // the case of of the value in c. If c holds any value other than
    // "gizmos", "gadgets", "widgets", or "wadgets", the constructor sets cargo
    // to "gizmos". The numUnits variable is set to the parameter u. If u is less than
    // 0 or higher than the maximum capacity of 10 units, numUnits is set to 0. The repair 
    // variable is set to the parameter r. If repair is true, numUnits is set to 0 
    // no matter what value is stored in the u parameter.
    public Boxcar(String c, int u, boolean r)
    {
        //cargo
    	this.setCargo(c);
        //numUnits
        if(u >= 0 && u <= 10) {
        	numUnits = u;
        }
        else {
        	numUnits = 0;
        }
        //repair
        repair = r;
        if(repair) {
        	numUnits = 0;
        }
    }
    
    // The toString method returns a String with the Boxcar in the format:
    // 5 gizmos    in service    
    // 10 widgets    in service
    // 0 gadgets    in repair
    //
    // Notice there is one space in between the number of units and the cargo
    // and a tab between the value for cargo and "in repair"/"in service"
    public String toString()
    {
        String print = numUnits + " " + cargo;
        if(repair) {
        	print += "\tin repair";
        }
        else {
        	print += "\tin service";
        }
        return print;
    }
    
    // This method adds 1 to the number of units in the BoxCar. The maximum
    // capacity of a boxcar is 10 units. If increasing the number of units
    // would go beyond the maximum, keep numUnits at the max capacity.
    // If the repair variable is true, then numUnits may only be set to 0.
    public void loadCargo() {
        if(numUnits < 10) {
        	numUnits++;
        }
        if(repair) {
        	numUnits = 0;
        }
    }
    
    // The getCargo method returns the cargo of the boxcar.
    public String getCargo()
    {
        return cargo;
    }
    
    // The setCargo method sets the cargo type of the boxcar. The cargo variable is
    // set to c only if c is "gizmos", "gadgets", "widgets", or "wadgets". 
    // The method ignores the case of of the value in c. If c holds any value other than
    // "gizmos", "gadgets", "widgets", or "wadgets" (ignoring case), the method sets cargo
    // to "gizmos". 
    public void setCargo(String c)
    {
    	if(c.equalsIgnoreCase("gizmos") ||
    	   c.equalsIgnoreCase("gadgets") ||
    	   c.equalsIgnoreCase("widgets") ||
    	   c.equalsIgnoreCase("wadgets"))
    	{
    		cargo = c.toLowerCase();
    	}
    	else {
    		cargo = "gizmos";
    	}
    }
    
    // The isFull method returns true if numUnits is equal to 10, false otherwise.
    public boolean isFull()
    {
        if(numUnits == 10) {
        	return true;
        }
        return false;
    }
    
    // The callForRepair method sets the variable repair to true, and numUnits to 0.
    public void callForRepair()
    {
        repair = true;
        numUnits = 0;
    }
    
    public static void main(String[] args)
    {
        
        /* The main method allows you to run Boxcar on its own, with a built-in tester. */
        
        //*************************************************************************
        // 1. Test Boxcar()
        //*************************************************************************
        Boxcar car1 = new Boxcar();
        System.out.println("1. Test Boxcar()");
        testBoxcar(car1, "gizmos", 5, false, "5 gizmos\tin service");
        
        //*************************************************************************
        // 2. Test Boxcar(String c, int u, boolean r)
        //*************************************************************************
        System.out.println("\n2. Test Boxcar(String c, int u, boolean r)");
        Boxcar car2 = new Boxcar("GadgetS", 7, true);
        // Notice that since the boxcar is in repair, the value of numUnits
        // gets set to 0. Also, the cargo should get saved in all lower case
        // as "gadgets", not "GadgetS".
        testBoxcar(car2, "gadgets", 0, true, "0 gadgets\tin repair");
        
        //*************************************************************************
        // 3. Test callForRepair()
        //*************************************************************************
        System.out.println("\n3. Test callForRepair()");
        // car1 is not burnt out. Lets call callForRepair on car1 and make sure it 
        // gets marked for repair and set to 0 units.
        car1.callForRepair();
        testBoxcar(car1, "gizmos", 0, true, "0 gizmos\tin repair");
        
        //*************************************************************************
        // 4. Test loadCargo()
        //*************************************************************************
        System.out.println("\n4. Test loadCargo()");
        Boxcar car3 = new Boxcar();
        // car3 holds 2 gizmos.  Let's load some more cargo.
        System.out.println("car3 holds 5 units.");
        testBoxcar(car3, "gizmos", 5, false, "5 gizmos\tin service");
        car3.loadCargo();
        System.out.println("now car3 should hold 6 units.");
        testBoxcar(car3, "gizmos", 6, false, "6 gizmos\tin service");
        car3.loadCargo();
        car3.loadCargo();
        car3.loadCargo();
        car3.loadCargo();
        car3.loadCargo();
        System.out.println("now car3 should hold 10 units.");
        testBoxcar(car3, "gizmos", 10, false, "10 gizmos\tin service");
        // Try to load cargo into car1 on - this should fail since it is in repair.
        System.out.println("car1 is in repair, so we can't load cargo");
        car1.loadCargo();
        testBoxcar(car1, "gizmos", 0, true, "0 gizmos\tin repair");
        
        //*************************************************************************
        // 5. Test isFull()
        //*************************************************************************
        System.out.println("\n5. Test isFull()");  
        // We know car1 is empty, and car3 is full.  Verify that the method isFull reports this correctly.
        if (!car1.isFull())
        {
            System.out.println("*** PASS: isFull() working properly");
        }
        else 
        {
            System.out.println("*** FAIL: isFull() not working properly");
        }
        if (car3.isFull())
        {
            System.out.println("*** PASS: isFull() working properly");
        }
        else 
        {
            System.out.println("*** FAIL: isFull() not working properly");
        }
        
        //*************************************************************************
        // 6. Test getCargo()
        //*************************************************************************
        System.out.println("\n6. Test getCargo()");
        if (car2.getCargo().equals("gadgets"))
        {
            System.out.println("*** PASS: getCargo() working properly");
        }
        else 
        {
            System.out.println("*** FAIL: problem with getCargo()");
        }
        
        //*************************************************************************
        // 7. Test setCargo(String)
        //*************************************************************************
        System.out.println("\n7. Test setCargo(String)");
        car1.setCargo("gadgets");  
        System.out.println("*** " + testBoxcarCargo(car1, "gadgets"));
        car1.setCargo("WIDGETS");  // should set cargo to widgets
        System.out.println("*** " + testBoxcarCargo(car1, "widgets"));
        car1.setCargo("wAdgEts");  // should set cargo to wadgets
        System.out.println("*** " + testBoxcarCargo(car1, "wadgets"));
        car1.setCargo("onions"); // onions is not allowed, should set cargo to gizmos.
        System.out.println("*** " + testBoxcarCargo(car1, "gizmos"));
    }
    
    // Private helper methods
    
    private static void testBoxcar(Boxcar car, String c, int u, boolean r,
                                   String string)
    {
        System.out.println("*** " + testBoxcarCargo(car, c));
        System.out.println("*** " + testBoxcarUnits(car, u));
        System.out.println("*** " + testBoxcarRepair(car, r));
        System.out.println("*** " + testBoxcarToString(car, string));
    }
    
    private static String testBoxcarUnits(Boxcar car, int u)
    {
        if (car.numUnits != u)
        {
            return "FAIL: numUnits is not set correctly. numUnits should be set to "
                + u + ", but it is set to " + car.numUnits + ".";
        }
        else
        {
            return "PASS: numUnits is set correctly (" + car.numUnits + ")";
        }
    }
    
    private static String testBoxcarRepair(Boxcar car, boolean r)
    {
        if ((car.repair && !r) || (!car.repair && r))
        {
            return "FAIL: repair is not set correctly (repair should be set to "
                + r + ", but it is set to " + car.repair + ")";
        }
        else
        {
            return "PASS: repair is set correctly (" + car.repair + ")";
        }
    }
    
    private static String testBoxcarCargo(Boxcar car, String c)
    {
        if (!car.cargo.equals(c))
        {
            return "FAIL: cargo is not set correctly (cargo should be set to "
                + c + ", but it is set to " + car.cargo + ")";
        }
        else
        {
            return "PASS: cargo is set correctly (" + car.cargo + ")";
        }
    }
    
    private static String testBoxcarToString(Boxcar car, String string)
    {
        String output;
        
        if (car.toString().equals(string))
        {
            output = "PASS: toString produced the correct output";
        }
        else
        {
            output = "FAIL: toString does not work as expected";
        }
        return output + " (" + car.toString() + ")";
    }
}