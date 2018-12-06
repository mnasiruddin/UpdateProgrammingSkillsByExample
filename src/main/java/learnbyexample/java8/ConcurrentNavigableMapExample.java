package learnbyexample.java8;

import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentNavigableMapExample {

    public static void main(String[] args) {
        ConcurrentNavigableMap<Integer, String> map = new ConcurrentSkipListMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(4, "four");
        map.put(6, "six");
        map.put(8, "8");

        System.out.println("returns greatest key greater than given key : " + map.ceilingKey(3));
        System.out.println("returns greatest key less than given key : " + map.floorKey(3));

        String sas = null;
        System.out.println("sadd" + "sdsd".equals(sas));
    }
}
