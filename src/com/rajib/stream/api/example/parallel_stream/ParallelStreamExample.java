package com.rajib.stream.api.example.parallel_stream;

import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {

        long start;
        long end;

        start = System.currentTimeMillis();
        IntStream.range(1, 10000).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println(STR."Sequential Stream took time in ms : \{end - start}");

        System.out.println("=============================================");

        start = System.currentTimeMillis();
        IntStream.range(1, 10000).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println(STR."Paralell Stream took time in ms : \{end - start}");

        IntStream.range(1, 10).forEach(i -> System.out.println(STR."Thread : \{Thread.currentThread().getName()}: \{i}"));

        IntStream.range(1, 10).parallel().forEach(i -> System.out.println(STR."Thread : \{Thread.currentThread().getName()}: \{i}"));
    }
}
