package com.rp.sec03;

import com.rp.courseUtil.Util;
import reactor.core.publisher.Flux;

public class Lec01FluxCreate {
    public static void main(String[] args) {
        Flux.create(
                fluxSink -> {
                    String country;
                    int i=0;
                    do{
                        country = Util.faker().country().name();
                        fluxSink.next(country);
                    }while(!country.equalsIgnoreCase("canada"));

                    fluxSink.complete();

                /*    for (int i = 0; i < 10; i++) {
                        fluxSink.next(Util.faker().country().name());
                    }
                    fluxSink.complete();*/

                    /*fluxSink.next(1);
                    fluxSink.next("a");
                    fluxSink.complete();*/
                }
        ).subscribeWith(Util.subscriber());
//        ).subscribe(Util.subscriber());

    }
}