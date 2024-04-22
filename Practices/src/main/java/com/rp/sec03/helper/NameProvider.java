package com.rp.sec03.helper;

import com.rp.courseUtil.Util;
import reactor.core.publisher.FluxSink;

import java.util.function.Consumer;

public class NameProvider implements Consumer<FluxSink<String>> {
    private FluxSink<String> fluxSink;

    // transfer a sink for this Flux
    @Override
    public void accept(FluxSink<String> stringFluxSink) {
        this.fluxSink = stringFluxSink;
    }

//    public void produce(){
//        String name = Util.faker().name().fullName();
//        this.fluxSink.next(name);
//    }

    public void produce(){
        String name = Util.faker().name().fullName();
        String thread = Thread.currentThread().getName();
        this.fluxSink.next(thread + " : " + name);
    }
}
