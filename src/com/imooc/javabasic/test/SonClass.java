package com.imooc.javabasic.test;

import javafx.beans.binding.When;
import sun.text.resources.cldr.ti.FormatData_ti;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class SonClass extends ParentClass {
    public void ParentClass(){
        LinkedList<String> strings = new LinkedList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-YY HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));


    }

}
