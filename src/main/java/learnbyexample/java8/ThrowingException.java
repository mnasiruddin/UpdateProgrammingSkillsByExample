package learnbyexample.java8;

import java.util.function.Consumer;
import java.util.function.Function;

abstract class ThrowingException {

	@SuppressWarnings("unchecked")
	abstract <T extends Exception, R> R sneakyThrow(Exception exception) throws T;

	static ThrowingException throwingException = new ThrowingException() {
		@Override
		<T extends Exception, R> R sneakyThrow(Exception exception) throws T {
			return null;
		}
	};

	@FunctionalInterface
	public interface ThrowingFunction<T, R> {
		R apply(T throwable) throws Exception;

		static <T, R> Function<T, R> unchecked(ThrowingFunction<T, R> throwingFunction) {
			return t -> {
				try {
					return throwingFunction.apply(t);
				} catch (Exception ex) {
					return throwingException.sneakyThrow(ex);
				}
			};
		}

	}

	@FunctionalInterface
	public interface ThrowingConsumer<T> {

		void accept(T t) throws Exception;

		static <T> Consumer<T> unchecked(ThrowingConsumer<T> throwingConsumer) {
			return t -> {
				try {
					throwingConsumer.accept(t);
				} catch (Exception ex) {
					throwingException.sneakyThrow(ex);
				}
			};
		}
	}

	@FunctionalInterface
	public interface ThrowingVoid<T> {

		void accept() throws Exception;

		static <T> void unchecked(ThrowingVoid<T> throwingVoid) {
			try {
				throwingVoid.accept();
			} catch (Exception ex) {
				throwingException.sneakyThrow(ex);
			}
		}
	}

}
