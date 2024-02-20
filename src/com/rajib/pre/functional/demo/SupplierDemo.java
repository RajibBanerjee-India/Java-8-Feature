package com.rajib.pre.functional.demo;

import java.util.List;

public class SupplierDemo {

    public static void main(String[] args) {

        /*Supplier<String> supplier = () -> "Hi Rajib!";

        System.out.println(supplier.get());*/

        List<String> lists = List.of();

        System.out.println(lists.stream().findAny().orElseGet(() -> "Hi Rajib!"));
    }
}
