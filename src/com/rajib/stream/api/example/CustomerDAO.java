package com.rajib.stream.api.example;

import java.util.List;

public class CustomerDAO {

    public static List<Customer> getAllCustomer() {
        return List.of(
                new Customer(101, "Rajib", "rajib@gmail.com", List.of("567854334", "987654348")),
                new Customer(789, "Raju", "raju@gmail.com", List.of("234598763", "567865438")),
                new Customer(234, "Rajib Banerjee", "rajibbanerjee@gmail.com", List.of("456789876", "123498769")),
                new Customer(304, "RB02", "rb@gmail.com", List.of("546897898", "765456785"))
        );
    }
}
