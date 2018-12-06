package learnbyexample.java8;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

public class OptionalStringTest {

    public static void main(String[] args) {
        String[] values = new String[] {null, ""};
        OptionalString optionalString = OptionalString.of(values);

        System.out.println("without predicate - optionalString.isPresent()" + optionalString.isPresent());

        Predicate<String[]> predicate = Objects::nonNull;
        optionalString = OptionalString.of(predicate, values);

        System.out.println("with predicate - optionalString.isPresent()" + optionalString.isPresent());

        AtomicBoolean atomicBoolean = new AtomicBoolean();
        optionalString.ifAllPresent(() -> atomicBoolean.set(true));

        System.out.println("optionalString.isPresent()" + optionalString.isPresent());
        System.out.println("atomicBoolean" + atomicBoolean.get());
        System.out.println("orElse" + Arrays.toString(optionalString.orElse("new")));

        AtomicBoolean atomicBoolean1 = new AtomicBoolean();
        VoidConsumer consumer = () -> System.out.println(atomicBoolean1.getAndSet(true));
        VoidConsumer consumer1 = () -> System.out.println(atomicBoolean1.getAndSet(false));
        consumer.andThen(consumer1).accept();
    }

    public static boolean isEmpty(String... sdas) {
        return Optional.ofNullable(sdas).isPresent();
    }
}
