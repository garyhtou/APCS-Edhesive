package Lesson17;

/*
For this activity, write a class called Lesson_17_Activity which includes the following methods:

public static boolean isSorted(int [] a) - returns true if the array a is in ascending order and false otherwise.
public static int binarySearch(int [] a, int b) - performs a binary search to determine if the value b is stored in a. If b is found, return the index of b. Otherwise, return -1.
Include both methods in a class called Lesson_17_Activity and paste the entire class into the code runner box below.
 */

public class Lesson_17_Activity {

	public static void main(String[] args) {
		int[] a = new int[] {1, 5, 2, 57, 23, 5, 68, 23, 7, 2, 5, -347};
		int[] b = new int[] {-246, 1, 4, 6, 8, 10, 346};
		System.out.println(binarySearch(a, 8));
	}

	public static boolean isSorted(int [] a) {
		for(int i = 1; i < a.length; i++) {
			if(a[i] < a[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	public static int binarySearch(int [] a, int b) {
		int mid;
		int low = 0;
		int high = a.length-1;
		while(high >= low) {
			mid = low + (high-low) / 2;
			if(a[mid] == b) {
				return mid;
			} else if(a[mid] < b) {
				low = mid+1;
			} else {
				high = mid-1;
			}
		}
		return -1;
	}
	
	/*int binarySearch2(int arr[], int x)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high)
        {
            int mid = low + (high-low)/2;
 
            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;
 
            // If x greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;
 
            // If x is smaller, ignore right half
            else
                high = mid - 1;
        }
 
        // if we reach here, then element was 
        // not present
        return -1;
    }*/
}
