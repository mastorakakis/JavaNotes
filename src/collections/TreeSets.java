package collections;

import java.util.*;

/**
 * This program sorts a set of item by comparing their descriptions.
 * 
 * @version 1.12 2015-06-21
 * @author Cay Horstmann
 */
public class TreeSets {
	public static void main(String[] args) {
		SortedSet<Item> parts = new TreeSet<>();
		parts.add(new Item("Toaster", 1234));
		parts.add(new Item("Widget", 4562));
		parts.add(new Item("Modem", 9912));
		System.out.println(parts);

		NavigableSet<Item> sortByDescription = new TreeSet<>(Comparator.comparing(Item::getDescription));

		sortByDescription.addAll(parts);
		System.out.println(sortByDescription);
	}
}

class Item implements Comparable<Item> {
	private String description;
	private int partNumber;

	public Item(String aDescription, int aPartNumber) {
		description = aDescription;
		partNumber = aPartNumber;
	}

	public String getDescription() {
		return description;
	}

	public String toString() {
		return "[description=" + description + ", partNumber=" + partNumber + "]";
	}

	public boolean equals(Object otherObject) {
		if (this == otherObject)
			return true;
		if (otherObject == null)
			return false;
		if (getClass() != otherObject.getClass())
			return false;
		Item other = (Item) otherObject;
		return Objects.equals(description, other.description) && partNumber == other.partNumber;
	}

	public int hashCode() {
		return Objects.hash(description, partNumber);
	}

	public int compareTo(Item other) {
		int diff = Integer.compare(partNumber, other.partNumber);
		return diff != 0 ? diff : description.compareTo(other.description);
	}
}
