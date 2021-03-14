package generics;

import java.util.List;

public class GenericsApp {

	public static void main(String[] args) {
		
		Car mercedes = new Car("silver");
		Car bmw = new Car("black");
		Bike honda = new Bike("red");
		
		Dealer<Car> carDealer = new Dealer<Car>();
		
		carDealer.products.add(mercedes);
		carDealer.products.add(bmw);
		print(carDealer.products);
		
	}

	public static <T extends Automobile> void print(List<T> products) {
		for (T t : products) {
			System.out.println("Generic method");
			System.out.println(t.color);
		}
	}
}
