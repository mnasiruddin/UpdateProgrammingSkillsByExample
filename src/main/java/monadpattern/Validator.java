package monadpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Validator<T> {

    private T t;
    private List<Throwable> exceptions = new ArrayList<>();

    private Validator(T t) {
        this.t = t;
    }

    public static <T> Validator<T> of(T t) {
        return new Validator<>(Objects.requireNonNull(t));
    }

    public Validator<T> validate(Predicate<T> predicate, String message) {
        if (!predicate.test(t)) {
            exceptions.add(new IllegalStateException(message));
        }
        return this;
    }

    public <U> Validator<T> validate(Function<T, U> function, Predicate<U> predicate, String message) {
        return validate(function.andThen(predicate::test)::apply, message);
    }

    public T get() {
        if (exceptions.isEmpty()) {
            return t;
        }
        IllegalStateException e = new IllegalStateException();
        exceptions.forEach(e::addSuppressed);
        throw e;
    }
}
