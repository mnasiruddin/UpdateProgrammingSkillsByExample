package learnbyexample.java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionCompose {

    static Function<Boolean, String> booleanToString = b -> b.toString();

    static Function<String, Boolean> stringToBoolean = i -> Boolean.valueOf(String.valueOf(i));

    static Function<String, Integer> stringToInt = i -> Integer.parseInt(i) + 10;

    static Function<Integer, Boolean> intToBoolean = (i) -> Boolean.valueOf(i.toString());

    static BiFunction<String, String, String> biFunction = (a, b) -> a + b;

    static BiConsumer<String, String> biConsumer = (a, b) -> System.out.print(a + b);

    static BiConsumer<String, String> biConsumer2 = (a, b) -> System.out.print(a + b);

    public static void main(String[] args) {
        System.out.println(stringToInt.andThen(intToBoolean).apply("5"));
        System.out.println(stringToBoolean.compose(booleanToString).apply(true));
        System.out.println(biFunction.andThen(stringToBoolean).apply("new", "old"));

        biConsumer.andThen(biConsumer2).accept("new", "old");
    }
}