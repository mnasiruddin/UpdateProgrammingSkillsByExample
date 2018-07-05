package learnbyexample.java8;

import com.google.common.base.Splitter;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SplitterExample {

    public static void main(String[] args) {

        String DEFAULT_PLATFORM_RULE_DETAILS = "R:V1,P:KRV,X:AA|R:V2,X:AV,P:KCD";
        final Map<String, String> map = new LinkedHashMap<>();
        final List<String> strings = Splitter.on("|").omitEmptyStrings().splitToList(DEFAULT_PLATFORM_RULE_DETAILS);
        strings.forEach(s -> {
            final Map<String, String> split = Splitter.on(",").withKeyValueSeparator(":").split(s);
            String version = split.getOrDefault("R", "");
            String platform = split.getOrDefault("P", "");
            String xmlType = split.getOrDefault("X", "");

        });
        map.forEach((key, value) -> System.out.println("key : " + key + ", value : " + value));
    }
}
