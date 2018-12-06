package learnbyexample.java8;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapObjectToMapString {

    private static final List<String> AU_STATE_CODES = new ImmutableList.Builder<String>()
            .add("NSW")
            .add("QLD")
            .add("SA")
            .add("TAS")
            .add("VIC")
            .add("WA")
            .add("ACT")
            .add("NT")
            .build();

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

        final List<Map.Entry<String, String>> collect = mapList.stream()
                .flatMap(map -> map.entrySet().stream().map(t -> Maps.immutableEntry(t.getKey(), String.valueOf(t.getValue()))))
                .collect(Collectors.toList());


        System.out.println(Joiner.on(",").join(AU_STATE_CODES));

        System.out.println(AU_STATE_CODES.contains(""));
        System.out.println(AU_STATE_CODES.contains(null));

    }
}
