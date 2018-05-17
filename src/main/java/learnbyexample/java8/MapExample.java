package learnbyexample.java8;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    private static Map<String, String> map = new HashMap<>();

    private static Map<String, String> map2 = new HashMap<>();

    static {
        map.put("Hello", "Yes");
        map.put("NotHello", "No");
        map2.put("Hello", "No");
        map2.put("NotHello", "Yes");
    }

    public static void main(String[] args) {
        System.out.println("map : " + map.values());
        map.put("NotHello", "True");
        System.out.println("map : " + map.values());
        map.computeIfPresent("NotHello", (a, b) -> "false");

        System.out.println("map : " + map.values());
        map.forEach((key, value) -> map2.compute(key, (param1, param2) -> value));
        System.out.println("map2 : " + map2.values());
        map2.compute("ALL Null", (param1, param2) -> null);
        System.out.println("map2 New : " + map2.values());
    }
}
