package equals;

import java.util.*;

public class Item implements Comparable<Item> {
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
		// calls Objects.hashCode for each argument and combine the values
		// Objects.hashCode returns 0 if a is null or a.hashCode() otherwise.
		return Objects.hash(description, partNumber);
	}

	public int compareTo(Item other) {
		int diff = Integer.compare(partNumber, other.partNumber);
		return diff != 0 ? diff : description.compareTo(other.description);
	}
}
