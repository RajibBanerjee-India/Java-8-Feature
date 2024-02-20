package com.rajib.pre.functional.demo;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {

    public static void main(String[] args) {

        /*Predicate<Integer> predicate = i -> i % 2 == 0;

        System.out.println(predicate.test(489));*/

        List<Integer> listi = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 10);
        listi.stream()
                .filter(i -> i % 2 == 0)
                .forEach(i -> System.out.println(STR."Print : \{i}"));
    }
}
