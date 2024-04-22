package com.rp.sec02;

import reactor.core.publisher.Flux;

public class Lec02MultipleSubscribers {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.just(1, 2, 3, 4, 5);
        Flux<Integer> evenIntegerFlux = flux.filter(i -> i%2 == 0);
        flux.subscribe(i -> System.out.println("Sub 1: " + i));
        evenIntegerFlux.subscribe(i -> System.out.println("Sub 2: " + i));
    }
}
