package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<String> staff = new ArrayList<>();
		
		staff = new ArrayList<>(100);			// allocates an internal array of 100 objects
		staff.ensureCapacity(100);				// allocates an internal array of 100 objects
		
		staff.add("test");
		staff.trimToSize();						// adjusts the size

		String[] a = new String[staff.size()];
		staff.toArray(a);						// list.toArray(array)
												// Arrays.asList
		List<String> strings = new ArrayList<String>(Arrays.asList(new String[] {"Panos", "Eleni", "Tenia", "Giorgos"}));
		Iterator<String> it = strings.iterator();
		it.forEachRemaining(string -> System.out.println(string));	// iterator.forEachRemaining
		
		System.out.println(strings instanceof RandomAccess); 	 	// RandomAccess
		
		strings.sort((s1, s2) -> s1.compareTo(s2));          		// sort
		System.out.println(strings);
	}

}
