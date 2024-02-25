public class CheckIfArrayIsSorted <T extends Comparable<T>> {
	
	public static <T extends Comparable<T>> boolean IsArrayInOrder(T[] arrayToCheck) {
		int arrayLength = arrayToCheck.length;
		// loop through the array and compare the index to the next element in the array
		for (int i = 0; i < arrayLength - 1; i++) {
			// if the current index is larger than the element in front of it, meaning that the compareTo() returns a positive integer, then the array is not sorted and should return false
			  if (arrayToCheck[i].compareTo(arrayToCheck[i + 1]) > 0) {
	                return false;
	            }
		}
		// otherwise, return true
		return true;
	}
	
	public static <T extends Comparable<T>> void CheckIfArrayIsInOrder(T[] arrayToCheck) {
		// if the boolean method returns true, then this array is in ascending order
		if (IsArrayInOrder(arrayToCheck)) {
			System.out.println("This array is sorted in ascending order.");
			// if not, then print message saying it is not in ascending order
		} else {
			System.out.println("This array is not sorted in ascending order.");
		}
	}
	
	// print out the array for testing
	public static <T extends Comparable<T>> void printArray(T[] arrayToCheck) {
		for (int i = 0; i < arrayToCheck.length; i++)
		{
			System.out.print(arrayToCheck[i] + " ");
		}
		
	}
	
	public static void main(String args[]) {
		// create object using from generic type, using a string in this example
		CheckIfArrayIsSorted<String> checkIfArrayIsSorted = new CheckIfArrayIsSorted<>();
		
		String tstArrNotOrdered[] = {"Jack", "Evan", "Drake", "Melissa"};
		String tstArrOrdered[] = {"Adam", "Becky", "Catherine", "Zach"};
		
		// run tests and print results
		printArray(tstArrNotOrdered);
		System.out.println();
		CheckIfArrayIsInOrder(tstArrNotOrdered);
		printArray(tstArrOrdered);
		System.out.println();
		CheckIfArrayIsInOrder(tstArrOrdered);
	}	
}