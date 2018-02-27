package learnbyexample.java8;

import learnbyexample.ExceptionFunction;

import java.util.function.Function;

public class MapExample {


    private static final Function<String, Function<String, Boolean>> FUNCTION = f1 -> f2 -> {

        ExceptionFunction<Boolean> exceptionFunction = () -> {
            String string1 = f1.toString();
            String string2 = f2.toString();
            boolean isEqual = string1.equalsIgnoreCase(string2);
            return isEqual;
        };

        return exceptionFunction.returnElseDefault(false);
    };

    public static void main(String[] args) {
        Function<String, Boolean> function = FUNCTION.apply("new");
        boolean isEqual = function.apply("old");
        System.out.print(isEqual);
    }
}
