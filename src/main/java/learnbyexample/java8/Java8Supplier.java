package learnbyexample.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Java8Supplier {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("as", "sas");
		Supplier<Employee> supplier = Employee::new;
		Supplier<String> suppliers = () -> "testing";
		Supplier<Map<String, String>> mapSupplier = () -> map;
		System.out.println(maker(supplier));
		System.out.println(maker(supplier).name());
		System.out.println(suppliers.get());
		System.out.println(mapSupplier.get());
	}

	private static Employee maker(Supplier<Employee> fx) {
		return fx.get();
	}

	static class Employee {

		@Override
		public String toString() {
			return "A EMPLOYEE";
		}

		public String name() {
			return "A EMPLOYEE IN NAME";
		}
	}

}