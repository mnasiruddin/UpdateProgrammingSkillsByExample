package learnbyexample.java8;

import java.util.concurrent.CompletableFuture;

public class CompletableFutures {

    public static void main(String[] args) throws Exception {
        CompletableFuture.runAsync(() -> System.out.println(1+2));
        Thread.sleep(10000);
    }
}
