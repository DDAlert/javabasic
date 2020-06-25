package com.imooc.javabasic.bytecode;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ByteCodeSample {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("1","eee");
        String value = (String) hashMap.get("1");
        System.out.println(value);

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(1,"ee");
        concurrentHashMap.get(1);
    }
}
