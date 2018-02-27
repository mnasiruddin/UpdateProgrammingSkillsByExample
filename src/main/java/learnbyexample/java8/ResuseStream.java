package learnbyexample.java8;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class ResuseStream {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c", "d", "e"};

        Supplier<Stream<String>> streamSupplier = () -> Stream.of(array);

        //get new stream
        streamSupplier.get().forEach(System.out::println);

        //get another new stream
        long count = streamSupplier.get().filter("b"::equals).count();
        System.out.println(count);

    }

}
