package learnbyexample;

import java.util.LinkedList;
import java.util.List;

public class TestThreadSafe {

    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();
        linkedList.add("");
        linkedList.add("nasas");
        linkedList.stream().filter(string -> !string.isEmpty()).forEach(linkedList::remove);
        linkedList.forEach(System.out::println);
    }
}
