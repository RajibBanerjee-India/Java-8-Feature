package com.rajib.stream.api.example;

import java.util.List;

public class MapVsFlatMap {

    public static void main(String[] args) {

        List<Customer> customers = CustomerDAO.getAllCustomer();

        // Data Transformation
        // Customer -> customer.getEmail -- one to one mapping
        List<String> emails = customers.stream().map(Customer::getEmail).toList();
        System.out.println(emails);

        // Customer -> customer.getPhoneNumbers -- one to many mapping
        List<List<String>> phones = customers.stream().map(Customer::getPhoneNumbers).toList();
        System.out.println(STR.">>> Phone Numbers without flattering >>> \{phones}");

        // Data Transformation and flattering
        // Customer -> customer.getPhoneNumbers -- one to many mapping
        List<String> phoneNumbers = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).toList();
        System.out.println(STR.">>> Phone Numbers with flattering >>> \{phoneNumbers}");
    }
}
