package learnbyexample;

import java.nio.charset.Charset;
import java.util.logging.Logger;

public class JavaUTF8 {

    public static void main(String[] args) {
        String text = "Åkeshovsvägen";
        byte[] bytes1 = text.getBytes(Charset.forName("ISO-8859-1"));
        byte[] bytes = text.getBytes(Charset.forName("UTF-8"));

        String string1 = new String(bytes1);
        String string = new String(bytes);

        Logger.getAnonymousLogger().info(string1);

        for (byte vvv : bytes1) {
            System.out.println(Integer.toHexString(vvv));
        }

        System.out.println(string);

        for (byte vvv : bytes) {
            System.out.println(Integer.toHexString(vvv));
        }

    }
}
