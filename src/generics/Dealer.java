package generics;

import java.util.ArrayList;
import java.util.List;

public class Dealer<T> {
	
	public List<T> products;

	public Dealer() {
		products = new ArrayList();
	}
}
