package com.rp.sec02;

import com.rp.courseUtil.Util;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Lec09FluxFromMono {
    public static void main(String[] args) {
//        Mono<String> mono = Mono.just("a");
//        Flux<String> flux = Flux.from(mono);
//
//        flux.subscribe(Util.onNext());

        Flux.range(1, 10)
                .filter(i -> i > 3)
                .next()
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }

    // this method need a Flux as an parameter
    private static void doSomething(Flux<String> flux){

    }
}
