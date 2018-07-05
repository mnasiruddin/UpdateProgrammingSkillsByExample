package learnbyexample.java8;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class OptionalExample {

    private static Path path = Paths.get("C:\\var\\log\\cartrawlerota\\AbgCurrencyData.txt");

    static Integer aaa;

    public static void main(String[] args) {

        try {
            throw new RuntimeException("dfdf");
        } catch (Throwable throwable) {
            System.out.println("caught trhoewbale" + throwable.getMessage());
        }
    }
}
