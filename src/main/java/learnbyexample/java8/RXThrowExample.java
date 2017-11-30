package learnbyexample.java8;

import rx.Observable;

import java.util.concurrent.Callable;

public class RXThrowExample {

	static class XJob implements Callable<Integer> {
		private Integer input;

		XJob(Integer input) {
			this.input = input;
		}

		@Override
		public Integer call() throws Exception {
			if (input == 2) {
				throw new IllegalArgumentException("Do no like input value");
			}
			return input * 2;
		}
	}

	public static void main(String[] args) {
		Observable<Integer> observable = Observable.just(1, 2, 2, 3, 4);

		observable
				.subscribe(r -> {
					System.out.println("Got r=" + r + " from xjob");
				});
	}
}
