package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CollectionsMethods {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(4);
		list.add("Hearts");
		list.add("Diamonds");
		list.add("Clubs");
		list.add("Spades");
		
		System.out.println("Unsorted");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("Sorted");
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println("Reversed");
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println("Shuffled");
		System.out.println(list);	
		
		List<String> copyList = new ArrayList<String>(list);
		Collections.copy(copyList, list);
		System.out.println("Copy");
		System.out.println(copyList);
		
		Collections.fill(copyList, "test");
		System.out.println("Fill");
		System.out.println(copyList);
		
		String max = Collections.max(list);
		String min = Collections.min(list);
		System.out.println("Max - Min");
		System.out.println(max + " - " + min);
		
		int index = Collections.binarySearch(list, "Clubs");
		System.out.println("Clubs found in position "+ index);
		
		String[] numbers = {"One", "Two"};
		Collections.addAll(copyList, numbers);
		System.out.println("Add All");
		System.out.println(copyList);
		
		int number = Collections.frequency(copyList, "test");
		System.out.println("Frequency of \"test\" = " + number);
		
		boolean disjoint = Collections.disjoint(list, copyList);
		System.out.println(copyList);
		System.out.println(list);
		System.out.println("No common elements = " + disjoint);
		
		System.out.println(new Date());
	}

}

