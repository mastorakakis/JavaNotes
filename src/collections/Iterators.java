package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
	
	public static void main(String[] args) {
		
		String[] colors = {"Red", "Green", "Blue", "White"};
		List<String> colorList = new ArrayList<String>();
		for (String color : colors) { colorList.add(color); }
		System.out.println(colorList);
		
		Iterator<String> it = colorList.iterator();
		
		while (it.hasNext()) {
			String color = it.next();
			if (color.equals("Green")) {
				it.remove();
			}
		}
		System.out.println("After removing \"Green\":");
		System.out.println(colorList);
		
		ListIterator<String> lit = colorList.listIterator(colorList.size());
		while (lit.hasPrevious()) {
			lit.set(lit.previous().toUpperCase());
		}
		System.out.println("To upper case:");
		System.out.println(colorList);
		
		colorList.subList(0, 2).clear();
		System.out.println("After clear:");
		System.out.println(colorList);
		
		// altering array alters list view
		String[] names = {"Panos", "Tenia", "Eleni", "Giorgos"};
		List<String> nameList = Arrays.asList(names);
		System.out.println(nameList);
		names[0] = "Kostas";
		System.out.println(nameList);
		nameList.set(0, "Panagiotis");
		System.out.println(names[0]);
		
		// Create true list
		List<String> trueList = new ArrayList<String>(Arrays.asList(names));
		@SuppressWarnings("unused")
		String[] nameArray = trueList.toArray(new String[trueList.size()]);
	}
}
