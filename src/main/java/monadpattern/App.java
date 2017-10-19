package monadpattern;

import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class App {

    private static final ToIntFunction<Integer> sss = s -> s + 9;
    private static final Function<Integer, Integer> sum = x -> x + 5;
    private static final Function<Integer, Function<Integer, Integer>> minus = m -> s -> m - s;
    private static final Predicate<Integer> predicate = p -> p == 5;
    private static final Predicate<Integer> predicate2 = p -> p == 10;
    private static final IntFunction<IntUnaryOperator> curriedAdd = a -> b -> a + b;
    private static final DoubleFunction<DoubleUnaryOperator> curriedAddDouble = a -> b -> a + b;

    public static void main(String... args) {
        User user = new User("saasa", "dsdsds", "sdsdd");
        Validator<User> val = Validator.of(user);
        val.validate(u -> !u.getEmail().isEmpty(), "Not valid Email");
        val.validate(u -> !u.getName().isEmpty(), "Not valid name");
        val.validate(User::getColor, u -> !u.isEmpty(),"Not valid color");
        val.get();

        System.out.println(curriedAddDouble.apply(5).applyAsDouble(5));
        System.out.println(curriedAdd.apply(5).applyAsInt(5));
        System.out.println(sss.applyAsInt(5));
        System.out.println(sum.apply(5));
        System.out.println(minus.compose(sum).apply(15).apply(5));
        System.out.println(predicate.test(4));
        System.out.println(predicate.or(predicate2).test(10));
    }

}