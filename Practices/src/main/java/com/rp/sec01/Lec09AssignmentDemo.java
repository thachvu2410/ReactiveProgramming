package com.rp.sec01;

import com.rp.courseUtil.Util;
import com.rp.sec01.assignment.FileService;

public class Lec09AssignmentDemo {
    public static void main(String[] args) {
//        FileService.read("file03.txt")
//                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

        FileService.delete("file03.txt")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

//        FileService.write("file03.txt", "THIS IS FILE 03")
//                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

    }
}
