package learnbyexample.java8;

import java.util.Arrays;

public class SplitIteratorExample {

    private static Integer[] intArrays = {5, 5, 25};
    private static String[] stringArrays = {"google", "IBM", "facebook"};

    public static void main(String[] args) {
        Arrays.stream(stringArrays).spliterator().forEachRemaining(System.out::println);
        Arrays.stream(intArrays).spliterator().forEachRemaining(System.out::println);
    }
}
