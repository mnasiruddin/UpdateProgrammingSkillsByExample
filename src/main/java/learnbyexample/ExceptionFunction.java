package learnbyexample;

import java.util.concurrent.atomic.AtomicBoolean;

@FunctionalInterface
public interface ExceptionFunction<T> {

    AtomicBoolean throwException = new AtomicBoolean();

    default void throwException() {
        throwException.set(true);
    }

    /**
     * Return else default t.
     *
     * @param defaultValue the default value
     * @return the t
     */
    default T returnElseDefault(T defaultValue) {
        try {
            return returnValue();
        } catch (Exception ex) {
            return defaultValue;
        }
    }

    /**
     * Return value t.
     *
     * @return the t
     */
    T returnValue() throws Exception;

    @SuppressWarnings("unchecked")
    static <T extends Throwable, R> R sneakyThrow(Throwable exception) throws T {
        throw (T) exception;
    }
}
