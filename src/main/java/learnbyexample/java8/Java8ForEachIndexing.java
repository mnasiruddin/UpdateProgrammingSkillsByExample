package learnbyexample.java8;

import java.util.function.Predicate;

public class Java8ForEachIndexing {

	public static void main(String[] args) {
		System.out.println(isRetryable1().test(new Exception()));
	}

	static Predicate<? super Exception> isRetryable1() {
		return e -> false;
	}
}