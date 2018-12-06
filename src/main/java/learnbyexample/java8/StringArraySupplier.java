package learnbyexample.java8;

import java.util.function.Supplier;

/**
 * Represents a supplier of {@code String[]}-valued results.  This is the
 * {@code String[]}-producing primitive specialization of {@link Supplier}.
 *
 * <p>There is no requirement that a distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #getAsStringArrays()}.
 *
 * @see Supplier
 * @since 1.8
 */
@FunctionalInterface
public interface StringArraySupplier {

    /**
     * Gets a result.
     *
     * @return a result
     */
    String[] getAsStringArrays();
}
