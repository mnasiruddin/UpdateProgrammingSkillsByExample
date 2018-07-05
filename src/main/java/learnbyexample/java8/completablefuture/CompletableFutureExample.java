package learnbyexample.java8.completablefuture;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.OptionalInt;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CompletableFutureExample {

    private static IntStream numbers = IntStream.of(1, 2, 10);
    private static Stream<String> strings1 = Stream.of("a", "b", "c");
    private static Stream<String> strings2 = Stream.of("d", "e", "f");

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        //testCompletableFutureSingle();

        System.out.println("Started with Thread activeCount " + Thread.activeCount());
        asyncCompletableFuture();
        Thread.sleep(10000);
        System.out.println("Ended with Thread activeCount " + Thread.activeCount());
        System.out.println("Ended with Thread activeCount " + Thread.currentThread());
        System.out.println("Ended with Thread name " + Thread.currentThread().getName());
        System.out.println("Ended with Thread state " + Thread.currentThread().getState().name());
        System.out.println("Ended with Thread Id " + Thread.currentThread().getId());
        Thread.currentThread().interrupt();
        System.out.println("Lately Ended with Thread activeCount " + Thread.activeCount());
        //composeFutures();

        //Thread.sleep(1000);
    }

    private static void composeFutures() {
        List<CompletableFuture<String>> completableFutures = Lists.newArrayList();
        completableFutures.add(CompletableFuture.supplyAsync(() -> strings1.findAny().orElse(null)));
        completableFutures.add(CompletableFuture.supplyAsync(() -> strings2.findAny().orElse(null)));

        final CompletableFuture<List<String>> bestResultFromCompletableFutures = findBestResultFromCompletableFutures(completableFutures);
        findBestResultFromCompletableFutures(completableFutures
                .stream()
                .filter(CompletableFutureExample::test)
                .collect(Collectors.toList())
        ).thenAcceptBoth(bestResultFromCompletableFutures, (a, b) -> System.out.println(a.get(0) + b.get(0)));

        bestResultFromCompletableFutures.thenApply(list -> {
            list.forEach(System.out::println);
            return list;
        });
    }

    private static void asyncCompletableFuture() {
        AtomicInteger i = new AtomicInteger(30);
        while (true) {
            int num = i.decrementAndGet();
            System.out.println("num" + num);
            if (num == 1) {
                break;
            }
            String val = "nasir"+num;
            CompletableFuture.runAsync(() -> {
                if (val.equalsIgnoreCase("nasir9")) {
                    System.out.println("I am Nine");
                } else if (val.equalsIgnoreCase("nasir8")) {
                    System.out.println("I am eight");
                }
                System.out.println(val);
                System.out.println("Thread activeCount " + Thread.activeCount());
                System.out.println("Thread Name " + Thread.currentThread().getName());
            });
        }
        System.out.println("Main Thread activeCount " + Thread.activeCount());
        System.out.println("Main Thread Name " + Thread.currentThread().getName());
    }

    private static void testCompletableFutureSingle() throws InterruptedException, ExecutionException {
        final CompletableFuture<OptionalInt> optionalIntCompletableFuture = CompletableFuture.supplyAsync(() -> numbers.max());
        final CompletableFuture<String> optionalStringCompletableFuture = CompletableFuture.supplyAsync(() -> strings2.findAny().get());

        boolean isPresent = optionalIntCompletableFuture.
                thenCombine(optionalStringCompletableFuture, (a, b) -> a.isPresent() && !b.isEmpty())
                .get();

        System.out.println(isPresent);
    }

    private static <T> CompletableFuture<List<T>> findBestResultFromCompletableFutures(List<CompletableFuture<T>> completableFutures) {
        CompletableFuture<Void> allFutureDone = CompletableFuture.allOf(completableFutures.toArray(new CompletableFuture[0]));
        return allFutureDone.thenApply(v -> completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList()));
    }

    private static boolean test(CompletableFuture<String> stringCompletableFuture) {
        try {
            return stringCompletableFuture.get().equalsIgnoreCase("d");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
