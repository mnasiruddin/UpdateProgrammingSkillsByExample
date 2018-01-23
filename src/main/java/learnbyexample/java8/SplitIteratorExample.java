package learnbyexample.java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class SplitIteratorExample {

    private static Integer[] intArrays = {5, 5, 25};
    private static String[] stringArrays = {"google", "IBM", "facebook"};

    public static void main(String[] args) {
        System.out.println(areBothNullEqual());
        Arrays.stream(stringArrays).spliterator().forEachRemaining(System.out::println);
        Arrays.stream(intArrays).spliterator().forEachRemaining(System.out::println);
        System.out.println(getPartialText());
    }

    private static boolean areBothNullEqual() {
        String a = "";
        String b = "";
        return a.equalsIgnoreCase(b);
    }

    private static Pattern versionRegex = Pattern.compile("([0-9]+\\.)+[0-9]+");
    private static Function<String, Matcher> matcherFunction = (s) -> versionRegex.matcher(s);

    private static String getPartialText() {
        String result = "0.0.0";
        String testString = "addSbtPlugin(com.typesafe.play % sbt-plugin % 2.6.11)";
        Stream<String> pluginLines = Stream.of(testString);
        return pluginLines.map(s -> {
            Matcher matcher = matcherFunction.apply(s);
            return matcher.find() ? matcher.group(0) : result;
        }).findFirst().orElse(result);
    }

}
