package cloneable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class MainCloneable {

	public static void main(String[] args) throws ParseException, CloneNotSupportedException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = formatter.parse("16/01/1983");
		Person p1 = new Person("Panos", 37, date);
		Person p2 = p1.clone();
		p1.editBirthday(99);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}

class Person implements Cloneable{ // Cloneable -> tag Interface
	
	private String name; // String class is immutable so clone works
	private int age;
	private Date birthday;// Date is mutable so must redefine clone method to make a deep copy
	
	public Person(String name, int age, Date birthday) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	
	public void editBirthday(int year) {
		birthday.setYear(year);
	}

	// clone makes copies of primitives but subObject copies will point to the same object
	public Person clone() throws CloneNotSupportedException { // deep copy
		
		Person newPerson = (Person) super.clone();
		newPerson.birthday = (Date) birthday.clone(); // clone mutable Date
		
		return newPerson;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", birthyear=" + birthday.getYear() + "]";
	}
	
	
	
}