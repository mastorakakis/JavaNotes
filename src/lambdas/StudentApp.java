package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import lambdas.entity.Student;

public class StudentApp {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Panos", "Mast", 37));
		students.add(new Student("Nikos", "Vassis", 38));
		students.add(new Student("Angelos", "Papakostas", 35));	

		System.out.println("Sort by last name".toUpperCase());
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.lastName.compareTo(o2.lastName);
			}
		});
		Collections.sort(students, (first, second) -> 
									first.lastName.compareTo(second.lastName));
		System.out.println("==================");
		System.out.println("print list".toUpperCase());
		performConditionally(students, student -> true, s -> System.out.print(s));
		System.out.println("==================");
		System.out.println("print last names that begin with 'P'".toUpperCase());
		performConditionally(students, s -> s.lastName.startsWith("P"),
														s -> System.out.print(s.lastName));
	}

	private static void performConditionally(List<Student> students, 
													Predicate<Student> pred,
													Consumer<Student> con) {
		for (Student student : students) {
			if (pred.test(student)) {
				con.accept(student);
			}
		}
		System.out.println();
	}

}
