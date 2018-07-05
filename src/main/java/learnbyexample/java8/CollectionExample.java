package learnbyexample.java8;

import java.util.Objects;

public class CollectionExample {

    public static void main(String[] args) {
        System.out.println(validHttpStatusCode());
    }

    private static boolean validHttpStatusCode() {
        final Integer responseCode = null;
        return Objects.nonNull(responseCode) && 200 == responseCode;
    }

}
