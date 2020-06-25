package com.imooc.javabasic.factory.simple;

public class CarFactory {
    public static Car getCar(String car){
        if ("宝马".equals(car)){
            return new BMW();
        }else if ("奥迪".equals(car)){
            return new Aodi();
        }else if ("大众".equals(car)){
            return new DaZhong();
        }else {
            return null;
        }
    }
}
