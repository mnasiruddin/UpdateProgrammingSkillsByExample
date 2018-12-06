import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadTextFile {

    @Test
    public void readTextFile() {
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get("C:\\Personal Development\\LearnJavaingByExample\\src\\test\\resources\\migration.txt"))) {
            stream.forEach(line -> System.out.println("'" + line + "'" + ","));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
