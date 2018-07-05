package learnbyexample;

import com.google.common.base.Splitter;

import java.util.List;

public class GoogleGuava {

    public static void main(String[] args) {
        List<String> spli = Splitter.on(",").omitEmptyStrings().splitToList("");
        System.out.println(spli);
    }
}