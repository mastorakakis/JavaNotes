package locales;

import java.text.NumberFormat;

public class MainNumberFormat {

	public static void main(String[] args) {
		
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormatter = NumberFormat.getPercentInstance();
		double x = 0.101;
		System.out.println(currencyFormatter.format(x)); // prints 0.10€
		System.out.println(percentFormatter.format(x)); // prints 10%
	}
}
