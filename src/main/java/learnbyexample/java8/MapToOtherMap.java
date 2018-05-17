package learnbyexample.java8;

import com.google.common.base.Splitter;

import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapToOtherMap {

    public static void main(String[] args) {

        String keyValue = "A=1-2-3,B=1-2-3";
        Predicate<List<String>> innerPredicate = list -> list.stream().anyMatch(s -> s.equalsIgnoreCase("1"));
        Predicate<Map.Entry<String, List<String>>> entryPredicate = e -> e.getKey().equalsIgnoreCase("A");
        entryPredicate = entryPredicate.and(p -> innerPredicate.test(p.getValue()));

        System.out.println(found(keyValue, ',', '=', '-', entryPredicate));
    }

    private static boolean found(String value, char mainSplitter, char firstKeyValueSplitter, char secondKeyValueSplitter, Predicate<Map.Entry<String, List<String>>> entryPredicate) {
        Map<String, String> map = Splitter.on(mainSplitter).withKeyValueSeparator(firstKeyValueSplitter).split(value);
        Map<String, List<String>> map1  = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, v -> Splitter.on(secondKeyValueSplitter).splitToList(v.getValue())));
       return map1
                .entrySet()
                .stream()
                .anyMatch(entryPredicate);
    }
}
