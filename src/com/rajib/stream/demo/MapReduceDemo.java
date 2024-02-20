package com.rajib.stream.demo;

import java.util.Arrays;
import java.util.List;

public class MapReduceDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(6, 8, 2, 4, 7);

        List<String> words = Arrays.asList("coreJava", "spring", "hibernate");

        // Using IntStream sum()
        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(STR."Using IntStream sum() - \{sum1}");

        // Using reduce and functional interface
        int sum2 = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(STR."Using reduce and functional interface - \{sum2}");

        // Using reduce and method reference
        int sum3 = numbers.stream().reduce(Integer::sum).get();
        System.out.println(STR."Using reduce and method reference - \{sum3}");

        // Using reduce and functional interface - multiplication
        int multiplication1 = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(STR."Using reduce and functional interface - multiplication - \{multiplication1}");

        // Using reduce and method reference - maximum number
        int max = numbers.stream().reduce(Integer::max).get();
        System.out.println(STR."Using reduce and method reference - maximum number - \{max}");

        // Using reduce and functional interface - maximum number
        int maximum = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(STR."Using reduce and functional interface - maximum number - \{maximum}");

        // Using reduce and functional interface - longest String
        String longestString = words.stream().reduce((word1, word2) -> word1.length()>word2.length() ? word1 : word2).get();
        System.out.println(STR."sing reduce and functional interface - longest String - \{longestString}");
    }
}
