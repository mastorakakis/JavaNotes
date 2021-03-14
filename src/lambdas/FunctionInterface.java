package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

import lambdas.entity.Student;

public class FunctionInterface {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Panos", "Mast", 37));
		students.add(new Student("Nikos", "Vassis", 38));
		students.add(new Student("Angelos", "Papakostas", 35));		
		
		//    <argument, return type>
		Function<Student, String> getLastName = (Student student) -> {			// always use { } with return 
			return student.lastName;
		};
		Function<Student, String> getFirstName =  student -> student.name;
		Function<Student, Integer> getAge = student -> student.age;
		
		String lastName = getLastName.apply(students.get(0));
		String name = getFirstName.apply(students.get(1));
		int age = getAge.apply(students.get(2));
		System.out.println(lastName);
		System.out.println(name);
		System.out.println(age);
		System.out.println("================");
		
		printStudent(getLastName, students.get(0)); 							// pass function as an argument
		printStudent(getFirstName, students.get(1));
		System.out.println("==============");
		
		Function<String, String> upperCase = String::toUpperCase;
		Function<Student, String> chainedFunction = getFirstName.andThen(upperCase);  			// chained function
		System.out.println(chainedFunction.apply(students.get(1)));
		
		//      <argument, argument, return>
		BiFunction<String, Integer, String> concatAge = (theName, theAge) -> {	// BiFunction
			return name + " " + age;
		};
		System.out.println(concatAge.apply(name, age));
		System.out.println("==================");
		
		// single argument and return of the same type
		IntUnaryOperator incBy5 = i -> i + 5;										// UnaryOperator
		System.out.println(incBy5.applyAsInt(10));
	}
	
	public static void printStudent(Function<Student, String> getStudent, Student student) {
		System.out.println(getStudent.apply(student));
	} 
	
}