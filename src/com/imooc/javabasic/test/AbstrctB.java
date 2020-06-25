package com.imooc.javabasic.test;

import java.text.DateFormat;
import java.util.Date;

public abstract class AbstrctB extends ClassA implements InterfaceA {
    @Override
    void test(){
        System.out.println("继承ClassA");
    }
}
