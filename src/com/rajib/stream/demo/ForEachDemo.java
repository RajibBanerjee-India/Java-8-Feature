package com.rajib.stream.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Internal Of forEach() -->
 * Consumer<String> consumer = System.out::println;
 * for(String s : nameList) {
 * consumer.accept(s);
 * }
 */

public class ForEachDemo {

    public static void main(String[] args) {

        List<String> nameList = List.of("Rajib", "Raj", "Raju");

        nameList.forEach(System.out::println);

        Map<Integer, String> letterMap1 = new HashMap<>();
        letterMap1.put(1, "R");
        letterMap1.put(2, "A");
        letterMap1.put(3, "J");

        letterMap1.forEach((k, v) -> System.out.println(STR."\{k} : \{v}"));

        Map<Integer, String> letterMap2 = new HashMap<>();
        letterMap2.put(1, "R");
        letterMap2.put(2, "A");
        letterMap2.put(3, "J");
        letterMap2.put(4, "I");
        letterMap2.put(5, "B");

        //  letterMap2.entrySet().stream().forEach(System.out::println);
        letterMap2.entrySet().forEach(System.out::println);
    }
}
