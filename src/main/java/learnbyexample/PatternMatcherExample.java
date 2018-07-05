package learnbyexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherExample {

    public static void main(String[] args) {

        String rule1 = "R:V3,P:KRV";
        String rule2 = "R:V3,X:KRV";
        String rule3 = "R:V3,P:KRV,X:AA";
        String rule4 = "R:V3,P:KRV,X:AA|R:V3,P:KRH,X:HG";

        String patternString = "R:(.+),(.):([A-Z]{2,3}+)\\Z";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher1 = pattern.matcher(rule1);
        Matcher matcher2 = pattern.matcher(rule2);
        Matcher matcher3 = pattern.matcher(rule3);
        Matcher matcher4 = pattern.matcher(rule4);

        System.out.println("rule1: " + matcher1.matches());
        System.out.println("rule2: " + matcher2.matches());
        System.out.println("rule3: " + matcher3.matches());
        System.out.println("rule4: " + matcher4.matches());
    }
}
