package com.rp.sec01;

import com.rp.courseUtil.Util;
import reactor.core.publisher.Mono;

public class Lec08MonoFromRunnable {
    public static void main(String[] args) {
        Mono.fromRunnable(timeConsumingProcess())
                .subscribe(
                        Util.onNext(),
                        Util.onError(),
                        () -> System.out.println("processing is done. sending emails")
                );
    }
    private static Runnable timeConsumingProcess(){
        return () -> {
            Util.sleepSeconds(3);
            System.out.println("Operation Completed!!!");
        };
    }
}
