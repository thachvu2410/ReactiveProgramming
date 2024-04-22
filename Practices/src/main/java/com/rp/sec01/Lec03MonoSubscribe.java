package com.rp.sec01;

import com.rp.courseUtil.Util;
import reactor.core.publisher.Mono;

public class Lec03MonoSubscribe {
    public static void main(String[] args) {
        // publisher
        Mono<Integer> mono = Mono.just("ball")
                .map(String::length)
                .map(l -> l/0);

        // option 1 - publisher already emits the data to consumer,
        // but do nothing
//        mono.subscribe();

        // option 2 - onNext, onError, onComplete params
        mono.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );
    }
}
