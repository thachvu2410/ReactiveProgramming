package com.rp.sec03;

import com.rp.courseUtil.Util;
import com.rp.sec03.helper.NameProvider;
import reactor.core.publisher.Flux;

public class Lec02FluxCreateRefactoring {
    public static void main(String[] args) {
        NameProvider nameProvider = new NameProvider();

        Flux.create(nameProvider)
                .subscribe(Util.subscriber());

//        nameProvider.produce();
//        nameProvider.produce();
//        nameProvider.produce();
//        nameProvider.produce();
//        nameProvider.produce();
//        nameProvider.produce();

        Runnable runnable = nameProvider::produce;

        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }

        Util.sleepSeconds(2); // block main thread to avoid it exits immediately
    }
}
