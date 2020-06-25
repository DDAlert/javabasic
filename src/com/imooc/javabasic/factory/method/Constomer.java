package com.imooc.javabasic.factory.method;

import com.imooc.javabasic.factory.simple.CarFactory;

public class Constomer {
    public static void main(String[] args) {
        Car car1 = new BMWFactory().getCar();
        Car car2 = new AodiFactory().getCar();
        Car car3 = new DaZhongFactory().getCar();

        car1.carName();
        car2.carName();
        car3.carName();
    }
}
