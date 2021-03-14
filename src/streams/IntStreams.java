package streams;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntStreams {

	public static void main(String[] args) {
		
		int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
		
		// display original values
		IntStream.of(values).forEach(value -> System.out.print(value + " "));
		System.out.println();
		
		// count, min, max, sum and average of the values
		System.out.println("Count: " + IntStream.of(values).count());
		System.out.println("Min: " + IntStream.of(values).min().getAsInt());
		System.out.println("Max: " + IntStream.of(values).max().getAsInt());
		System.out.println("Sum: " + IntStream.of(values).sum());
		System.out.println("Avg: " + IntStream.of(values).average().getAsDouble());
		System.out.println("Avg or Else '0': " + IntStream.of(values).average().orElse(0));
		System.out.println("Stats: " + IntStream.of(values).summaryStatistics());
		
		// sum of values with reduce method
		System.out.println("Sum via reduce: " + IntStream.of(values)
									   					 .reduce(0, (x, y) -> x + y));
		
		// sum of squares of values with reduce method
		System.out.println("Sum of squares via reduce: " + IntStream.of(values)
									                				.reduce(0, (x, y) -> x + y * y));
		
		// product of values with reduce method
		System.out.println("Product via reduce: " + IntStream.of(values)
															 .reduce(1, (x, y) -> x * y));
		
		// even values displayed in sorted order
		System.out.printf("%nEven values displayed in sorted order: ");
		IntStream.of(values).filter(value -> value % 2 == 0)
							.sorted()
							.forEach(value -> System.out.print(value + " "));
		
		// odd values multiplied by 10 and displayed in sorted order
		System.out.printf("\nOdd values multiplied by 10 displayed in sorted order: ");
		IntStream.of(values)
				 .filter(value -> value % 2 != 0)
				 .map(value -> value * 10)
				 .sorted().forEach(value -> System.out.print(value + " "));
		
		IntPredicate even = value -> value % 2 == 0;
		IntPredicate greaterThan5 = value -> value > 5;
		System.out.print("\nEven & >5: ");
		IntStream.of(values)
				 .filter(even.and(greaterThan5))
				 .sorted().forEach(value -> System.out.print(value + " "));
		
		// sum range of integers from 1 to 10, exlusive
		System.out.printf("%nSum of integers from 1 to 9: %d%n", IntStream.range(1, 10).sum());
		
		// sum range of integers from 1 to 10, inclusive
		System.out.printf("Sum of integers from 1 to 10: %d%n", IntStream.rangeClosed(1, 10).sum());
	}

}
