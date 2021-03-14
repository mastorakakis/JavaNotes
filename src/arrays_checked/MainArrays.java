package arrays_checked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ImplicitArrayToString")
public class MainArrays {

	@SuppressWarnings("UnusedAssignment")
	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[] a2 = new int[] { 1, 3, 2 };

		System.out.println("print: " + a);

		System.out.println("Arrays.toString: " + Arrays.toString(a)); 	// Arrays.toString
																		//.deepToString correctly print multidimensional arrays
		Arrays.fill(a, 10); // Arrays.fill
		System.out.println("Fill array with 10s: " + Arrays.toString(a));
										
		System.out.println("Arrays.equals: " + Arrays.equals(a, a2)); 	// Arrays.equals

		System.out.println("Arrays.hashCode: " + Arrays.hashCode(a)); 	// Arrays.hashCode

		Arrays.sort(a2); 												// Arrays.sort(a2) a2 must implement Comparable
		System.out.println(Arrays.toString(a2));

		String[] stringArray = { "Panos", "Tenia", "Eleni", "Giorgos" };
		List<String> stringList = Arrays.asList(stringArray); 			// Arrays.asList -> creates view
		List<String> stringList2 = new ArrayList<>(Arrays.asList(stringArray)); // Arrays.asList -> creates new list

		System.out.println(stringList);
		System.out.println(stringList2);

		a = Arrays.copyOf(a, 2 * a.length); 					// copy array and double the size
	}
}
