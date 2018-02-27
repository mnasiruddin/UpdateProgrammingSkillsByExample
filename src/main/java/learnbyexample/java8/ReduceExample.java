package learnbyexample.java8;

import java.util.Arrays;

public class ReduceExample {

    private static int[] intArrays = {5, 5, 25};
    private static String[] stringArrays = {"google", "IBM", "facebook"};

    public static void main(String[] args) throws Exception {
        int bbbb = Arrays.stream(intArrays).reduce((x, y) -> x + y).orElse(5);
        System.out.println(bbbb);
        Arrays.stream(intArrays).distinct().max().ifPresent(System.out::println);
        Arrays.stream(stringArrays).reduce((x, y) -> x + "," + y).ifPresent(System.out::println);
        String aaa = Arrays.stream(stringArrays).reduce(":", (x, y) -> x + "," + y);
        System.out.println(aaa);

        Arrays.stream(intArrays).average().ifPresent(System.out::println);
    }
}