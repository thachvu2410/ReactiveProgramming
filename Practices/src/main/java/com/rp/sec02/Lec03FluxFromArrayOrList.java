package com.rp.sec02;

import com.rp.courseUtil.Util;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class Lec03FluxFromArrayOrList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c");
        Integer[] arr = {2,5,6,3};
//        Flux.fromIterable(strings)
        Flux.fromArray(arr)
                .subscribe(Util.onNext());
    }
}
