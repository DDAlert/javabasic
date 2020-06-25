package com.imooc.javabasic.factory.simple;

public class Constomer {
    public static void main(String[] args) {
        Car car1 = CarFactory.getCar("宝马");
        Car car2 = CarFactory.getCar("奥迪");
        Car car3 = CarFactory.getCar("大众");

        car1.carName();
        car2.carName();
        car3.carName();
    }
}
