package com.rp.sec02;

import com.rp.courseUtil.Util;
import reactor.core.publisher.Flux;

import java.util.function.Function;

public class Lec05FluxRange {
    public static void main(String[] args) {
//        Flux.range(3, 10)
//                .subscribe(Util.onNext());

        Flux.range(1, 10)
                .map(i -> Util.faker().name().fullName())
                .subscribe(Util.onNext());
    }
}
