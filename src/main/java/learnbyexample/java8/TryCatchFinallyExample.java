package learnbyexample.java8;

public class TryCatchFinallyExample {

    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(new IllegalAccessException("fdf"));
        } finally {
            System.out.println("finally");
        }
    }
}
