package comparable;

public class MainComparable {

	public static void main(String[] args) {
	}
}

class Person implements Comparable<Person>{
	private String name;
	private int age;
	private double salary;
	
	@Override
	public int compareTo(Person o) {
		
		// return Integer.compare(age, o.age);		// Integer.compare
		return Double.compare(salary, o.salary);	// Double.compare
	}
}