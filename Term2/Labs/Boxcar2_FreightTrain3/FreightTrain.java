package Labs.Boxcar2_FreightTrain3;
/*
 * AP CS MOOC
 * Term 2 - Assignment 2, Part 2: FreightTrain
 * A class which represents a freight train with multiple boxcars.
 */


/*
For this assignment, you will be writing a class called FreightTrain that represents a train containing multiple cargo-carrying boxcars. The boxcars in the train are instances of the Boxcar class that you created in  Assignment 2: Part 1 - Boxcar. To get started, download the template file FreightTrain.java (Links to an external site.)Links to an external site. into the same folder that holds your Boxcar.java code from  Assignment 2: Part 1 - Boxcar. The FreightTrain class needs the Boxcar class to work properly.

As in Part 1 of this assignment, your job is to add code to FreightTrain.java so that your implementation meets the requirements specified below. To complete the assignment, replace all the /* missing code *\/ comments in the file with your own code. You do not need to change any other code in the file.

In previous assignments, we had a requirement that your class be named Main. In this assignment, the class is required to be named FreightTrain. 

When you are done coding and testing, copy and paste your entire FreightTrain class (including the main method) into the Code Runner and press "Submit" in order for your assignment to count as turned in. Do not resubmit your Boxcar class. We will test your FreightTrain class with our own version of the Boxcar class. 

Variables

ArrayList<Boxcar> train - An ArrayList that stores a train with boxcars.
Methods

FreightTrain() - Default constructor that sets train to an ArrayList holding one boxcar containing 5 gizmos, that is not in repair.
FreightTrain(int n) - A constructor that sets train to an ArrayList of size n, holding n boxcars each containing 5 gizmos and not in repair. If n ≤ 0, then the train should be set to size one, with a single boxcar holding 5 gizmos and not in repair.
String toString() - This method returns a String representation of the Boxcar objects in the train, one per line. For example:
3 gadgets	in service
2 wadgets	in service
0 gizmos	in repair
7 gadgets	in service
0 gadgets	in repair
void setCargo(String c) - This method sets the cargo type of all the boxcars in the entire train. The cargo variable is set to c only if c is "gizmos", "gadgets", “widgets”, or “wadgets”. It should ignore the case of the value in c. If c holds any value other than "gizmos", "gadgets", “widgets”, or “wadgets”, cargo will be set to "gizmos".
void setMultiCargo() - This method sets the boxcars to the alternating pattern "gizmos", "gadgets", "widgets", "wadgets", "gizmos", "gadgets", "widgets", "wadgets", ... until the end of the train.
void fillTrain() - This method fills all boxcars in the train to the maximum capacity of 10.
void callForRepair(int i) - This method sets the repair variable of the Boxcar at location i to true.
Sample run

1. Test the default constructor FreightTrain()
*** PASS: FreightTrain() creates a list of size 1

2. Test the constructor FreightTrain(n)
*** PASS: FreightTrain(0) creates a list of size 1
*** PASS: FreightTrain(-7) creates a list of size 1
*** PASS: FreightTrain(5) creates a list of size 5
*** PASS: FreightTrain(5) initialized boxcars correctly

3. Test setCargo(String)
*** PASS: setCargo worked as expected (gadget test)
*** PASS: setCargo worked as expected (onions test)

5. Test fillTrain()
*** PASS: fillTrain() worked as expected

6. Test callForRepair(n)
*** PASS: callForRepair(1) works as expected.
 */
import java.util.ArrayList;

public class FreightTrain
{
    // An ArrayList that stores a train with multiple boxcars
    private ArrayList<Boxcar> train = new ArrayList<Boxcar>();
    
    // Default constructor that sets train to an ArrayList holding one
    // boxcar containing 5 gizmos, that is not in repair.
    public FreightTrain()
    {
        train.add(new Boxcar());
    }
    
    // A constructor that sets train to an ArrayList of size n, holding
    // n boxcars, that are all hold 5 gizmos and are not in repair. If n <= 0,
    // then the train should be set to size one, with a single boxcar containing
    // 5 gizmos and not in repair.
    public FreightTrain(int n)
    {
        if(n <= 0) {
        	train.add(new Boxcar());
        }
        else {
        	for(int i = 1; i <= n; i++) {
        		train.add(new Boxcar());
        	}
        }
    }
    
    // This method returns a String representation of the
    // Boxcar objects in the ArrayList, one per line. For example,
    // here is the String returned when toString is called on a
    // FreightTrain with 5 boxcars:
    //
    // 3 gadgets    in service
    // 2 wadgets    in service
    // 0 gizmos    in repair
    // 7 gadgets    in service
    // 0 gadgets    in repair
    //
    // Note: there is one space between the number of units and
    // the cargo type, and a tab between the cargo type and 
    // "in repair"/"in service".
    public String toString()
    {
        String print = "";
    	for(Boxcar b: train) {
        	print += b.toString() + "\n";
        }
        return print;
    }
    
    // This method sets the cargo type of all the boxcars in the entire train.
    public void setCargo(String c)
    {
    	for(Boxcar b: train) {
    		b.setCargo(c);
    	}
    }
    
    // This method sets the boxcars to the pattern "gizmos", "gadgets", "widgets", 
    // "wadgets", "gizmos", "gadgets", "widgets", "wadgets", ... 
    // until the end of the train.
    public void setMultiCargo()
    {
        String[] cargoTypes = {"gizmos", "gadgets", "widgets", "wadgets"};
        int pos = 0;
        for(Boxcar b: train) {
        	b.setCargo(cargoTypes[pos]);
        	if(pos < 3) {
        		pos++;
        	}
        	else {
        		pos = 0;
        	}
        }
    }
    
    // This method fills every boxcar in the train to max capacity of 10. 
    // Each individual boxcar can only hold cargo if its 
    // repair variable is false.
    public void fillTrain()
    {
        for(Boxcar b:train) {
        	boolean isRepair = true;
        	int textPos = b.toString().indexOf("\t")+1;
        	if(b.toString().substring(textPos).equals("in service")) {
        		isRepair = false;
        	}
        	if(!isRepair) {
        		while(!b.isFull()) {
        			b.loadCargo();
        		}
        	}
        }
    }
    
    // This method sets the Boxcar at location iâ€™s repair variable to true.
    public void callForRepair(int i)
    {
        Boxcar b = train.get(i);
        b.callForRepair();
    }
    
    public static void main(String[] args)
    {
        // *************************************************************************
        // 1. Test FreightTrain()
        // *************************************************************************
        System.out.println("1. Test the default constructor FreightTrain()");
        FreightTrain train1 = new FreightTrain();
        if (train1.train.size() == 1)
            System.out.println("*** PASS: FreightTrain() creates a list of size 1");
        else
            System.out.println("*** FAIL: FreightTrain() creates a list of size "
                                   + train1.train.size()
                                   + ", when a list of size 1 is expected.");
        
        // ***********************************
        // 2. Test FreightTrain(n)
        // ***********************************
        System.out.println("\n2. Test the constructor FreightTrain(n)");
        // Try to create a train with 0 boxcars
        FreightTrain emptyTrain = new FreightTrain(0);
        if (emptyTrain.train.size() == 1)
            System.out.println("*** PASS: FreightTrain(0) creates a list of size 1");
        else
            System.out.println("*** FAIL: FreightTrain(0)  creates a list of size "
                                   + emptyTrain.train.size()
                                   + ", when a list of size 1 is expected.");
        // Try to create a train of boxcars with a negative number
        FreightTrain negativeTrain = new FreightTrain(-7);
        if (negativeTrain.train.size() == 1)
            System.out.println("*** PASS: FreightTrain(-7) creates a list of size 1");
        else
            System.out.println("*** FAIL: FreightTrain(-7) creates a list of size "
                                   + negativeTrain.train.size()
                                   + ", when a list of size 1 is expected.");
        // Try to create a train with a positive number of boxcars
        FreightTrain trainWithFiveCars = new FreightTrain(5);
        if (trainWithFiveCars.train.size() == 5)
            System.out.println("*** PASS: FreightTrain(5) creates a list of size 5");
        else
            System.out.println("*** FAIL: FreightTrain(5) creates a list of size "
                                   + trainWithFiveCars.train.size()
                                   + ", when a list of size 5 is expected.");
        // Verify that all the boxcars are initialized properly
        boolean success = true;
        for (Boxcar car: trainWithFiveCars.train)
        {
            if (!car.getCargo().equals("gizmos"))
            {
                success = false;
            }
        }
        if (trainWithFiveCars.train.size() > 0 && success)
        {
            System.out.println("*** PASS: FreightTrain(5) initialized boxcars correctly");
        }
        else
        {
            System.out.println("*** FAIL: FreightTrain(5) did not initialize boxcars correctly");
        }
        
        
        // ***********************************
        // 3. Test setCargo(String)
        // ***********************************
        System.out.println("\n3. Test setCargo(String)");
        // All of the cars in our trainWithFiveCars carry gizmos.
        // Change that to gadgets.
        trainWithFiveCars.setCargo("gadgets");
        success = true;
        for (Boxcar car: trainWithFiveCars.train)
        {
            if (!car.getCargo().equals("gadget"))
                success = false;
        }
        if (trainWithFiveCars.train.size() > 0 && success)
            System.out.println("*** PASS: setCargo worked as expected (gadget test)");
        else
            System.out.println("*** FAIL: setCargo did not work as expected (gadget test)");
        // Now try to set them to a cargo type that is not supported.  
        // This should cause all the cars to be set back to gizmos.
        trainWithFiveCars.setCargo("onions");
        success = true;
        for (Boxcar car: trainWithFiveCars.train)
        {
            if (!car.getCargo().equals("gizmos"))
                success = false;
        }
        if (trainWithFiveCars.train.size() > 0 && success)
            System.out.println("*** PASS: setCargo worked as expected (onions test)");
        else
            System.out.println("*** FAIL: setCargo did not work as expected (onions test)");
        
        // ***********************************
        // 4. Test fillTrain()
        // ***********************************
        System.out.println("\n5. Test fillTrain()");
        train1.fillTrain();
        if (train1.train.size() > 0 && train1.train.get(0).isFull())
        {
            System.out.println("*** PASS: fillTrain() worked as expected");
        }
        else
        {
            System.out.println("*** FAIL: fillTrain() did not work as expected");
        }
        
        // ***********************************
        // 5. Test callForRepair(int)
        // ***********************************
        System.out.println("\n6. Test callForRepair(n)");
        train1.callForRepair(0);
        if (train1.toString().equals("0 gizmos\tin repair"))
        {
            System.out.println("*** PASS: callForRepair(1) works as expected.");
        }
        else
        {
            System.out.println("*** FAIL: callForRepair(1) does not work as expected.");
        }
    }
}
