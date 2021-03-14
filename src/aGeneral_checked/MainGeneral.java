package aGeneral_checked;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.Duration;
import java.time.Instant;

public class MainGeneral {

	public static void main(String[] args) throws ClassNotFoundException {

		Animal dog = new Dog();
		Class<?> cl = Class.forName("aGeneral_checked.Dog");

		System.out.println("Class ==> " + dog.getClass());
		System.out.println("Class name ==> " + dog.getClass().getName());
		System.out.println("Super class ==> " + dog.getClass().getSuperclass());

		System.out.println("Modifiers ==> " + Modifier.toString(cl.getModifiers()));
		
		Field[] fields = cl.getFields();
		for (Field field : fields) {
			System.out.println("Field ==> " + field.getName());
		}
		
		Method[] methods = cl.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print("Method ==> " + method.getName());
			System.out.println("|| Return type ==> " + method.getReturnType());
		}
/////////////////////////////////////////////
		Integer x = 100_000_000;
		Integer y = 100_000_000;

		System.out.println(x == y);
		System.out.println(x.equals(y));		
////////////////////////////////////////////
		Instant start = Instant.now();
		for (int i = 0; i < 100_000_000; i++) {
			System.out.print("");
		}
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
//		long milliseconds = timeElapsed.toMillis();
		long secs = timeElapsed.getSeconds();
		System.out.println("Duration ==> " + secs + " sec");
	}
}

class Animal {
	public String color;

	public String print() {
		return "ANIMAL";
	}
}

class Dog extends Animal {
	public String name;

	public String print() {
		return "DOG";
	}
}