package Labs.Boxcar;
/*
 * AP CS MOOC
 * Term 2 - Assignment 2, Part 1: Boxcar
 * A class which represents a single car on a freight train.
 */

public class Boxcar
{
    // Variables that will be initialized in the Boxcar constructors.
    private String cargo = "";
    private int numUnits;
    private boolean repair;
    
    // Default constructor that sets the boxcar to "gizmos", 5, and false.
    public Boxcar()
    {
        /* missing code */
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
        /* missing code */
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
        /* missing code (don't forget to update the return statement) */
        return "";
    }
    
    // This method adds 1 to the number of units in the BoxCar. The maximum
    // capacity of a boxcar is 10 units. If increasing the number of units
    // would go beyond the maximum, keep numUnits at the max capacity.
    // If the repair variable is true, then numUnits may only be set to 0.
    public void loadCargo() {
        /* missing code */  
    }
    
    // The getCargo method returns the cargo of the boxcar.
    public String getCargo()
    {
        /* missing code (don't forget to update the return statement) */
        return "";
    }
    
    // The setCargo method sets the cargo type of the boxcar. The cargo variable is
    // set to c only if c is "gizmos", "gadgets", "widgets", or "wadgets". 
    // The method ignores the case of of the value in c. If c holds any value other than
    // "gizmos", "gadgets", "widgets", or "wadgets" (ignoring case), the method sets cargo
    // to "gizmos". 
    public void setCargo(String c)
    {
        /* missing code */
    }
    
    // The isFull method returns true if numUnits is equal to 10, false otherwise.
    public boolean isFull()
    {
        /* missing code (don't forget to update the return statement) */
        return false;
    }
    
    // The callForRepair method sets the variable repair to true, and numUnits to 0.
    public void callForRepair()
    {
        /* missing code */
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