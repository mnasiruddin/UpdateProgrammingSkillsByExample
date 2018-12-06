package learnbyexample;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {

    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal("15456454.56986");
        bigDecimal = bigDecimal.setScale(2, RoundingMode.UP);
        System.out.println("bigDecimal : " + bigDecimal);

        BigDecimal one = BigDecimal.ZERO;
        BigDecimal two = BigDecimal.ONE;
        System.out.println("bigDecimal compare : " + one.equals(two));
    }
}
