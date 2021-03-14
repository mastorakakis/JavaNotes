package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import lambdas.entity.Student;

public class MethodReference {

	public static void main(String... args) {

		Thread t = new Thread(() -> printMessage());		// lambda
		t = new Thread(MethodReference::printMessage); 		// method reference () -> method()
		t.start();
		System.out.println("===========================");

		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Panos", "Mast", 37));
		students.add(new Student("Nikos", "Vassis", 38));
		students.add(new Student("Angelos", "Papakostas", 35));

		performConditionally(students, student -> true, s -> System.out.print(s + " ")); // lambda
		performConditionally(students, student -> true, System.out::println); // method reference 
		System.out.println("==================");
	}

	public static void printMessage() {
		System.out.println("Hello");
	}

	private static void performConditionally(List<Student> students, Predicate<Student> pred, Consumer<Student> con) {
		for (Student student : students) {
			if (pred.test(student)) {
				con.accept(student);
			}
		}
	}
}
