package com.rp.sec02;

import com.rp.courseUtil.Util;
import com.rp.sec02.helper.NameGenerator;

import java.util.List;

public class Lec07FluxVsList {
    public static void main(String[] args) {
//        List<String> names = NameGenerator.getNames(5);
//        System.out.println(names);

        NameGenerator.getNames(5)
                .subscribe(Util.onNext());
    }
}
