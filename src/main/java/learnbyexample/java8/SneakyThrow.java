package learnbyexample.java8;

import learnbyexample.ExceptionFunction;

import java.util.Arrays;

public class SneakyThrow {

    private static String[] stringArrays = {"google", "IBM", "facebook"};

    public static void main(String[] args) {
        Arrays.stream(stringArrays).reduce((diagnosticA, diagnosticB) -> diagnosticA + "," + diagnosticB)
                .ifPresent(joins -> {
                    System.out.println(joins);
                    ExceptionFunction.sneakyThrow(new Exception("Modify Exception" + joins));
                });
    }
}
