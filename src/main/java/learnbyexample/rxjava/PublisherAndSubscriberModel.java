package learnbyexample.rxjava;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class PublisherAndSubscriberModel {

    public static void main(String[] args) {
        Publisher<String> publisher = Subscriber::onComplete;
        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onSubscribe(Subscription s) {

            }

            @Override
            public void onNext(String s) {

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onComplete() {

            }
        };
        publisher.subscribe(subscriber);
    }
}
