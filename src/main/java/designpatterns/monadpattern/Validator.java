/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package designpatterns.monadpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Class representing Monad design pattern. Monad is a way of chaining operations on the
 * given object together step by step. In Validator each step results in either success or
 * failure indicator, giving a way of receiving each of them easily and finally getting
 * validated object or list of exceptions.
 *
 * @param <T> Placeholder for an object.
 */
public class Validator<T> {
    /**
     * Object that is validated
     */
    private final T t;

    /**
     * List of exception thrown during validation.
     */
    private final List<Throwable> exceptions = new ArrayList<>();

    private Throwable registeredExceptionType;

    private Set<ValidationState> validationStateSet = new ConcurrentSkipListSet<>();

    private boolean wasValidAtleastOnce = false;

    /**
     * Creates a monadic value of given object.
     *
     * @param t object to be validated
     */
    private Validator(T t) {
        this.t = t;
    }

    /**
     * Creates validator against given object
     *
     * @param t   object to be validated
     * @param <T> object's type
     * @return new instance of a validator
     */
    public static <T> Validator<T> of(T t) {
        return new Validator<>(Objects.requireNonNull(t));
    }

    /**
     * @param registeredExceptionType registered the Exception Type you want to throw if any of the validation fails
     * @return this
     */
    public Validator<T> registerExceptionType(Throwable registeredExceptionType) {
        this.registeredExceptionType = registeredExceptionType;
        return this;
    }

    /**
     * @param validation one argument boolean-valued function that
     *                   represents one step of validation. Adds exception to main validation exception
     *                   list when single step validation ends with failure.
     * @param message    error message when object is invalid
     * @return this
     */
    private Validator<T> validation(Predicate<T> validation, String message) {
        if (!isValid()) {
            if (!validation.test(t)) {
                if (null != message) {
                    exceptions.add(new IllegalStateException(message));
                } else {
                    exceptions.add(new IllegalStateException());
                }
                validationStateSet.add(ValidationState.INVALID);
            } else {
                validationStateSet.add(ValidationState.VALID);
            }
        }
        return this;
    }


    public <R> Validator<T> validate(Function<T, R> input, Predicate<R> validation, String errorMessage) {
        return validation(input.andThen(validation::test)::apply, errorMessage);
    }

    public <R> Validator<T> validate(Function<T, R> input, Predicate<R> validation) {
        return validation(input.andThen(validation::test)::apply, null);
    }

    /**
     * Receives validated object or throws exception when invalid.
     *
     * @return object that was validated
     * @throws IllegalStateException when any validation step results with failure
     */
    public T get() throws Throwable {
        if (isValid()) {
            return t;
        }

        if (null != registeredExceptionType) {
            throw registeredExceptionType;
        } else {
            IllegalStateException e = new IllegalStateException();
            exceptions.forEach(e::addSuppressed);
            throw e;
        }
    }

    public boolean isValid() {
        return wasValidAtleastOnce || (!validationStateSet.isEmpty() && !validationStateSet.contains(ValidationState.INVALID));
    }

    public void flush() {
        exceptions.clear();
    }

    public Validator<T> OR() {
        if (isValid()) {
            wasValidAtleastOnce = true;
        }
        validationStateSet.clear();
        return this;
    }

}
