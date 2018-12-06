package learnbyexample.guava;

import com.google.common.base.Joiner;

import java.util.HashMap;
import java.util.Map;

public class GuavaExample {
    private static final String KEY_VALUE_SEP = "=";
    private static final String DELIMITER = ";";

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("abc", "123");
        map.put("def", "456");
        String sdsd = null;
        StringBuilder builder = new StringBuilder();
        builder.append(sdsd);
        System.out.println("builder.toString()" + builder.toString());

    }
}
