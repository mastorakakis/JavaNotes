package lambdas.entity;

public class Student {
	
	public String name;
	public String lastName;
	public int age;

	public Student(String name, String lastName, int age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public String toString() {
		return name + " " + lastName + " " + age;
	}
}
