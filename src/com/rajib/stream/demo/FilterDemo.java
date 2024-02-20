package com.rajib.stream.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Internal Of filter() and forEach() -->
 * Consumer<String> consumer = System.out::println;
 * Predicate<String> predicate = s -> s.startsWith("M");
 * for (String s : nameList) {
 * if (predicate.test(s)) {
 * consumer.accept(s);
 * }
 * }
 */

public class FilterDemo {

    public static void main(String[] args) {

        List<String> nameList = List.of("Rajib", "Raj", "Raju", "Toronto", "Canada", "Montreal");

        nameList.stream()
                .filter(s -> s.startsWith("M"))
                .forEach(System.out::println);

        Map<Integer, String> letterMap = new HashMap<>();
        letterMap.put(1, "R");
        letterMap.put(2, "A");
        letterMap.put(3, "J");
        letterMap.put(4, "I");
        letterMap.put(5, "B");

        letterMap.entrySet()
                .stream()
                .filter(k -> k.getKey() % 2 == 0)
                .forEach(System.out::println);
    }
}
