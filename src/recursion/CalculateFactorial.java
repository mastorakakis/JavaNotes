package recursion;

import java.math.BigInteger;
import java.text.NumberFormat;

public class CalculateFactorial {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 50; i++) {
			BigInteger result = factorial(BigInteger.valueOf(i));
			System.out.println(i + "!= " + NumberFormat.getInstance().format(result));
		}

	}
	
	public static BigInteger factorial (BigInteger n) {
		if (n.compareTo(BigInteger.ONE) <= 0) {
			return BigInteger.ONE;
		}
		return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}

}
