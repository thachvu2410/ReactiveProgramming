package com.rp.courseUtil;

import com.github.javafaker.Faker;
import org.reactivestreams.Subscriber;

import java.util.Objects;
import java.util.function.Consumer;

public class Util {

    private static final Faker faker = Faker.instance();
    public static Consumer<Object> onNext(){
        return o -> System.out.println("Received: " + o);
    }

    public static Consumer<Throwable> onError(){
        return e -> System.out.println("ERROR: " + e);
    }

    public static Runnable onComplete(){
        return () -> System.out.println("Completed");
    }

    public static Faker faker(){
        return faker;
    }

    public static void sleepSeconds(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Subscriber<Object> subscriber(){
        return new DefaultSubscriber();
    }

    public static Subscriber<Object> subscriber(String name){
        return new DefaultSubscriber(name);
    }
}
