package learnbyexample.projectreactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

public class ReactorErrorHandling {

    private static List<String> words = Arrays.asList(
            "the",
            "quick",
            null,
            "fox",
            "jumped",
            "over",
            "the",
            "lazy",
            "dog"
    );


    public static void main(String[] args) {
        doMonoAndFlux();
    }

    private static void doMonoAndFlux() {
        Flux<String> manyLetters = Flux
                .fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))
                .distinct()
                .sort()
                .zipWith(Flux.range(1, Integer.MAX_VALUE),
                        (string, count) -> String.format("%2d. %s", count, string));
        doTheSubscriptionOnFlux(manyLetters);

        Mono<String> stringMono = Mono.just("one");
        doTheSubscriptionOnMono(stringMono);
    }

    private static void doTheSubscriptionOnFlux(Flux<String> flux) {

        final long startTime = System.currentTimeMillis();
        final boolean disposed = flux
                .log(null, Level.WARNING)
                .onErrorReturn(throwable -> false, "Returned From Error")
                .onErrorMap(throwable -> new IllegalArgumentException(throwable.getMessage()))
                .doOnError(throwable -> System.out.println("Error : " + throwable))
                .doOnComplete(() -> System.out.println("Success"))
                .doOnCancel(() -> System.out.println("Cancel"))
                .doOnTerminate(() -> System.out.println("Terminate"))
                .doFinally(type -> {
                    System.out.println("Finally :" + type);
                    System.out.println("end time : " + (System.currentTimeMillis() - startTime) + " ms");
                })
                .doOnSubscribe(subscription -> {
                    System.out.println("Subscribed");
                    System.out.println("start time : " + startTime + " ms");
                    //subscription.cancel();
                })
                .subscribe()
                .isDisposed();

        System.out.println("disposed " + disposed);
    }

    private static void doTheSubscriptionOnMono(Mono<String> mono) {

        final long startTime = System.currentTimeMillis();
        final boolean disposed = mono
                .log(null, Level.WARNING)
                .onErrorReturn(throwable -> false, "Returned From Error")
                .onErrorMap(throwable -> new IllegalArgumentException(throwable.getMessage()))
                .doOnError(throwable -> System.out.println("Error : " + throwable))
                .doOnSuccess((d) -> System.out.println("Success"))
                .doOnCancel(() -> System.out.println("Cancel"))
                .doOnTerminate(() -> System.out.println("Terminate"))
                .doFinally(type -> {
                    System.out.println("Finally :" + type);
                    System.out.println("end time : " + (System.currentTimeMillis() - startTime) + " ms");
                })
                .doOnSubscribe(subscription -> {
                    System.out.println("Subscribed");
                    System.out.println("start time : " + startTime + " ms");
                    //subscription.cancel();
                })
                .subscribe()
                .isDisposed();

        System.out.println("disposed " + disposed);
    }

}
