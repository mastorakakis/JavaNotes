package lambdas;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.print(random.nextInt(10) + " ");
		}
		System.out.println("\n=======================");
		Supplier<Integer> randomSupplier = () -> random.nextInt(10); 	// supplier also IntSupplier
		for (int i = 0; i < 10; i++) {
			System.out.print(randomSupplier.get() + " "); 				
		}
	}

}
