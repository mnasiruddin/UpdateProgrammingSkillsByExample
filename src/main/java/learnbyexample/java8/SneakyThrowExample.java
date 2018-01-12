package learnbyexample.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SneakyThrowExample {

	public static void main(String... args) {
		sneakyThrow();
	}

	private static void sneakyThrow() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 56, 54, 7);
		list.stream().map(ThrowingException.ThrowingFunction.unchecked(SneakyThrowExample::throwException));
		Optional.of(42).map(ThrowingException.ThrowingFunction.unchecked(SneakyThrowExample::throwException));
	}

	private static Integer throwException(Integer i) {
		if (i == 54) {
			return 1;
		}
		throw new NullPointerException();
	}

}
