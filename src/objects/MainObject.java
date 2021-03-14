package objects;

import java.util.Objects;

public class MainObject {

	public static void main(String[] args) {
		
		String name1 = "hello";
		String name2 = null;
		
		boolean check = Objects.equals(name1, name2); 	// Objects.equals(...,...)
//		boolean check2 = name1.equals(name2);
		System.out.println(check);
		
		System.out.println(Objects.hashCode(name2));  // Objects.hashCode(name2)
		
		System.out.println(Objects.hash(name1, name2)); // Objects.hash(name, salary, hireDay);

	}

}
