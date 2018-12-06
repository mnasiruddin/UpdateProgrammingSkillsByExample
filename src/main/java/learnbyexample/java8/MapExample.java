package learnbyexample.java8;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapExample {

    private static Map<String, String> map = new HashMap<>();

    private static Map<String, String> map2 = new HashMap<>();

    private static List<Path> files = new ArrayList<>();

    static {
        map.put("Hello", "Yes");
        map.put("NotHello", "No");
        map2.put("Hello", "No");
        map2.put("NotHello", "Yes");
    }

    public static void main(String[] args) {

        List<String> files1 = files.stream().map(file -> file.toFile().getName()).collect(Collectors.toList());
        System.out.println("map : " + map.values());
        map.put("NotHello", "True");
        System.out.println("map : " + map.values());
        map.computeIfPresent("NotHello", (a, b) -> "false");

        System.out.println("map : " + map.values());
        map.forEach((key, value) -> map2.compute(key, (param1, param2) -> value));
        System.out.println("map2 : " + map2.values());
        map2.compute("ALL Null", (param1, param2) -> null);
        System.out.println("map2 New : " + map2.values());

        String as = map.keySet().stream().filter(key -> key.equalsIgnoreCase("dddfd")).findFirst().orElse( "");

        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(4, "Four");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Before");
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        map.remove(3);
        map.put(8, "Eight");
        map.put(6, "Six");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("After");
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
