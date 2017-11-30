package learnbyexample.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class Practice {

    private static final ToIntFunction<Integer> sss = s -> s + 9;
    private static final Function<Integer, Integer> sum = x -> x + 5;
    private static final Function<Integer, Function<Integer, Integer>> minus = m -> s -> m - s;
    private static final Predicate<Integer> predicate = p -> p == 5;
    private static final Predicate<Integer> predicate2 = p -> p == 10;
    private static final IntFunction<IntUnaryOperator> curriedAdd = a -> b -> a + b;
    private static final DoubleFunction<DoubleUnaryOperator> curriedAddDouble = a -> b -> a + b;
    private static final List<String> strings = Arrays.asList("A", "B", "C");
    private static final List<Integer> numbers = Arrays.asList(2, 4, 6);
    private static final Integer ints = 3;

    public static void main(String... args) {
        /*System.out.println(curriedAddDouble.apply(5).applyAsDouble(5));
        System.out.println(curriedAdd.apply(5).applyAsInt(5));
        System.out.println(sss.applyAsInt(5));
        System.out.println(sum.apply(5));
        System.out.println(minus.compose(sum).apply(15).apply(5));
        System.out.println(predicate.test(4));
        System.out.println(predicate.or(predicate2).test(10));
        System.out.println(strings.parallelStream().reduce("-", (a, b) -> a.concat(b)));
        System.out.println(numbers.stream().reduce(ints, (a, b) -> a * b));*/

        System.out.println(numbers.stream().reduce(ints, (a, b) -> a + b, (a, b) -> a * b));
    }

}