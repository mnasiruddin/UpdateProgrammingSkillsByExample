package learnbyexample.java8;

import org.eclipse.collections.api.map.ImmutableMap;
import org.eclipse.collections.impl.factory.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapObjectToMapString {

    public static void main(String[] args) {

        List<Map<String, Object>> mapList = new ArrayList<>();
        Map<String, Object> mapOne = new HashMap<>();
        mapOne.put("refOne", "one");
        mapOne.put("taiagoOne", "one");

        Map<String, Object> mapTwo = new HashMap<>();
        mapTwo.put("refTwo", "two");
        mapTwo.put("taiagoTwo", "two");

        mapList.add(mapOne);
        mapList.add(mapTwo);

        List<ImmutableMap<String, String>> collect = mapList.stream()
                .flatMap(map -> map.entrySet().stream().map(t -> Maps.immutable.of(t.getKey(), String.valueOf(t.getValue()))))
                .collect(Collectors.toList());

        collect.forEach(map -> map.forEachKeyValue((key, value) -> System.out.println("Key : " + key + " value : " + value)));
    }
}
