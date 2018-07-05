package learnbyexample.java8;

public class EnumValidation {

    public static void main(String[] args) {
        System.out.println(getVersion());
    }

    public static SinBinRuleVersion getVersion() {
        SinBinRuleVersion ruleVersion = SinBinRuleVersion.V1;
        try {
            ruleVersion = SinBinRuleVersion.valueOf("V5");
        } catch (IllegalArgumentException exception) {
            return ruleVersion;
        }
        return ruleVersion;
    }

    enum SinBinRuleVersion {
        V1, V2;

        public SinBinRuleVersion getValueElseDefault(String version) {
            SinBinRuleVersion ruleVersion = SinBinRuleVersion.valueOf(version);
            if (null == ruleVersion) {
                ruleVersion = SinBinRuleVersion.V1;
            }
            return ruleVersion;
        }
    }
}
