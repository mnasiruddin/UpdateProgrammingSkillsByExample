package learnbyexample.java8;

import java.util.Objects;

/**
 * Represents an operation that accepts a single {@code int}-valued argument and
 * returns no result.  This is the primitive type specialization of
 * {@link VoidConsumer} for {@code void}.  Unlike most other functional interfaces,
 * {@code IntConsumer} is expected to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #accept()}.
 *
 * @see VoidConsumer
 */
@FunctionalInterface
public interface VoidConsumer {

    /**
     * Performs this operation on the given argument.
     *
     */
    void accept();

    /**
     * Returns a composed {@code IntConsumer} that performs, in sequence, this
     * operation followed by the {@code after} operation. If performing either
     * operation throws an exception, it is relayed to the caller of the
     * composed operation.  If performing this operation throws an exception,
     * the {@code after} operation will not be performed.
     *
     * @param after the operation to perform after this operation
     * @return a composed {@code IntConsumer} that performs in sequence this
     * operation followed by the {@code after} operation
     * @throws NullPointerException if {@code after} is null
     */
    default VoidConsumer andThen(VoidConsumer after) {
        Objects.requireNonNull(after);
        return () -> {
            accept();
            after.accept();
        };
    }
}
