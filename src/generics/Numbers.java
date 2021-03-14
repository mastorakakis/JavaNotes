package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {

	public static void main(String[] args) {

		Integer[] numbers = { 1, 2, 3, 4 };
		List<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));
		
		String[] strings = {"Panos", "Eleni", "Tenia", "Giorgos"};
		List<String> stringList = new ArrayList<String>(Arrays.asList(strings));
		
		print(strings);
		print(numbers);
		
		System.out.println();
		
		print(numberList);
		print(stringList);
	}

	public static <T> void print(T[] array) {
		System.out.println(Arrays.toString(array));
	}
	
//	public static <T> void print(List<T> list) {
//		System.out.printf(list + "\n");
//	}
	
	public static void print(List<?> list) {
		System.out.printf(list + "\n");
	}
}
