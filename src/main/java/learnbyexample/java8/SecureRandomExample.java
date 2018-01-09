package learnbyexample.java8;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SecureRandomExample {
    private static List<Integer> ints = new ArrayList<>();

    static {
        IntStream.rangeClosed(0, 9).forEach(ints::add);
        IntStream.rangeClosed('a', 'z').forEach(ints::add);
        IntStream.rangeClosed('A', 'Z').forEach(ints::add);
        IntStream.rangeClosed('!', '*').forEach(ints::add);
    }

    public static void main(String[] args) {
        new SecureRandom().ints(10, 0, ints.size()).map(ints::get).forEach(s -> System.out.print((char) s));
        new SecureRandom().ints(10, 0, ints.size()).map(ints::get).forEach(System.out::print);
    }
}
