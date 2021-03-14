package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class MainComparator {

	public static void main(String[] args) {

		String[] names = {"Panagiotis", "Eleni", "Tenia"};
		System.out.println("Names:" + Arrays.toString(names));
		
		System.out.println("\nNames Sorted in dictionary order");
		Arrays.sort(names);
		System.out.println("Names:" + Arrays.toString(names));
		
		System.out.println("\nNames Sorted by length");
		Arrays.sort(names, new MyLengthComparator()); 		// Arrays.sort(...,...)
		System.out.println("Names:" + Arrays.toString(names));
		
		System.out.println("\nSorted with lamdas");
		Arrays.sort(names, (s1, s2) -> s1.length() - s2.length());
		System.out.println("Names:" + Arrays.toString(names));
		
		Comparator<String> myComp = new MyLengthComparator();
		System.out.println(myComp.compare(names[2], names[1]));
	}

}

class MyLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
	
}