package com.rp.sec01;

import com.rp.courseUtil.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.Callable;

public class Lec05MonoFromSupplier {
    private static String getName() {
        System.out.println("Generating name...");
        return Util.faker().name().fullName();
    }

    public static void main(String[] args) {
        // use just only when you have data already
        //Mono<String> mono = Mono.just(getName());

        Mono<String> mono = Mono.fromSupplier(() -> getName());
        mono.subscribe(
                Util.onNext()
        );

        Callable<String> callable = () -> getName();
        Mono.fromCallable(callable).subscribe(Util.onNext());
    }
}
