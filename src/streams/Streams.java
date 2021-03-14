package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		// Generate infinite stream -> generate, iterate
		List<String> myStream = Stream.generate(() -> "Echo")
									  .limit(5)
									  .collect(Collectors.toList());
		System.out.println(myStream);
		
		System.out.println(Stream.generate(Math::random)
								 .limit(5)
								 .collect(Collectors.toList()));
		
		System.out.println(Stream.iterate(1, x -> x + 1)
								 .limit(5)
								 .collect(Collectors.toList()));
		// distinct and count
		Stream<String> stream = Stream.of("Panos", "Panos", "Tenia", "Eleni", "Giorgos");
		System.out.println(stream.distinct().count());
		
		// concat and skip
		Stream<String> combined = Stream.concat(Stream.of("Panos"), Stream.of("Popi", "Stella"));
		System.out.println(combined.collect(Collectors.toList()));
		System.out.println(Stream.of("Panos", "Panos", "Tenia", "Eleni", "Giorgos")
								 .skip(2)
								 .collect(Collectors.toList()));
		// peek - performs a Function
		Object[] powers = Stream.iterate(1, p -> p *2)
								.peek(System.out::println)
								.limit(21)
								.toArray();
 	}

}
