package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {

		new Animal() {
			@Override
			public void walk() {
				System.out.println("Inner Class ==> Animal walking");
			}
		}.walk(); 																		// inner class
		Animal theAnimal = () -> System.out.println("Lambda Exp ==> Animal walking");	// save lambda to VAR
		testLamba(theAnimal);
		testLamba(() -> System.out.println("Lambda Exp 2 ==> Animal walking")); 		// lambda
		
		Calc calc = (a, b) -> a + b;													// lambda interface
		sum(calc, 2, 3);
		sum((a,b) -> { int result = a + b; return result; }, 2, 3); 					// lambda with multiple statements
		
		List<String> names = 
				new ArrayList<String>(Arrays.asList(new String[] {"Tim", "John", "Paul"}));
		names.forEach(name -> System.out.println(name.toUpperCase())); 	
		names.removeIf(name -> name.equals("Tim"));
		System.out.println("Names ==> " + names);

	}

	public static void testLamba(Animal theAnimal) { // methods
		theAnimal.walk();
	}

	public static int sum(Calc calc, int a, int b) {
		return calc.sum(a, b);
	}
}

// interfaces
interface Animal {
	void walk();
}

@FunctionalInterface
interface Calc {
	int sum(int a, int b);
}