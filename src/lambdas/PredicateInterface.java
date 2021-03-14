package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Alex", 33));
		persons.add(new Person("Panos", 37));
		persons.add(new Person("Tenia", 41));
		
		System.out.println("Print persons over 35");			// lambda
		persons.forEach(person -> {
			if (person.age > 35) {
				System.out.println(person);
			}
		});
		System.out.println("========================");
		printPersons(persons, "Print persons under 40", person -> person.age < 40); // predicate lambda
		System.out.println("========================");
		printPersons(persons, "Print persons under 40", new Predicate<Person>() {  // predicate inner class 
			@Override
			public boolean test(Person person) {
				return person.age < 40;
			}
		});
		
		IntPredicate greaterThan35 = i -> i > 35;
		IntPredicate lessThan40 = i -> i < 40;
		System.out.println(greaterThan35.test(45));
		System.out.println(greaterThan35.and(lessThan40).test(37)); // chained predicates
	}
	
	public static void printPersons(List<Person> persons, 
									String ageText,
									Predicate<Person> ageCondition) {  // method with predicate
		System.out.println(ageText);
		persons.forEach(person -> {
			if (ageCondition.test(person)) {
				System.out.println(person);
			}
		});
	}

}

class Person {
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String name;
	public int age;
	
	public String toString() {
		return name + " " + age;
	}
}