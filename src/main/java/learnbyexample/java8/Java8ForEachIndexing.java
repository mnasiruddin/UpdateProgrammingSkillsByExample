package learnbyexample.java8;

import java.util.Arrays;
import java.util.List;

public class Java8ForEachIndexing {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 4, 6);
		int[] idx = {0};
		list.forEach(l -> {
					idx[0]++;
					System.out.println(l);
				}
		);
	}
}