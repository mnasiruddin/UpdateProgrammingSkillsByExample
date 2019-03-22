package learnbyexample.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctionalExample1 {

    public static void main(final String[] args) {
        final Predicate<Integer> requiredMode = (val) -> val != null;
        final Predicate<List<String>> noNulls = (val) -> val != null;
        final Consumer<String> print = (val) -> System.out.println("\"" + val + "\",");


    }
}
