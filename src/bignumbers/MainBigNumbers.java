package bignumbers;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;

public class MainBigNumbers {

    public static void main(String[] args) {
        BigDecimal amount = BigDecimal.valueOf(100);
        //amount.setScale(2, RoundingMode.HALF_EVEN);
        
        BigInteger a = BigInteger.valueOf(10);

        System.out.println(amount);
        amount.add(BigDecimal.ONE);
        System.out.println(amount.add(BigDecimal.ONE));
        System.out.println(amount);

        amount = amount.add(BigDecimal.valueOf(5000));
        System.out.println(NumberFormat.getCurrencyInstance().format(amount));
    }

}
