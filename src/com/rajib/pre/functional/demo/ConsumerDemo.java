package com.rajib.pre.functional.demo;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {

    public static void main(String[] args) {
        /*Consumer<Integer> consumer = i -> System.out.println(STR."Printing : \{i}");
        consumer.accept(10);*/

        List<Integer> listi = Arrays.asList(1, 2, 3, 4, 5);
        listi.forEach(i -> System.out.println(STR."Print : \{i}"));

    }
}
