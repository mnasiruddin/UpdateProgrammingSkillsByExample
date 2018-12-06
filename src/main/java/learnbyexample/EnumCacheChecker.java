package learnbyexample;

import java.util.ArrayList;
import java.util.Collection;

public enum EnumCacheChecker {
    NO,
    V1,
    V2,
    V3;

    private static EnumCacheChecker[] cache = EnumCacheChecker.values();

    public static EnumCacheChecker value(String version) {
        for (EnumCacheChecker checker : cache) {
            if (null!= version && version.equalsIgnoreCase(checker.name())) {
                return checker;
            }
        }
        return getDefaultRuleVersion();
    }

    public static EnumCacheChecker getDefaultRuleVersion() {
        return EnumCacheChecker.NO;
    }

    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        list.add(null);
        System.out.println(list.size());
        boolean attemptCancel = false;
        EnumCacheChecker checker = EnumCacheChecker.NO;
        switch (checker) {
            case NO:
            case V1:
            case V2:
                attemptCancel = true;
            case V3:
                attemptCancel = false;
                break;
            default:
                break;
        }
        System.out.println("attemptCancel : " + attemptCancel);
        System.out.println("null : " + value(null));
        System.out.println("N1 : " + value("N1"));
        System.out.println("N0 : " + value("N0"));
        System.out.println("V1 : " + value("V1"));
        System.out.println("1234 : " + value("1234"));
        System.out.println(" : " + value(""));
    }
}
