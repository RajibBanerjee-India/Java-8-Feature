package com.rajib.stream.demo;

import com.rajib.stream.api.example.Customer;
import com.rajib.stream.api.example.CustomerDAO;

import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static Customer getCustomerByEmail(String email) throws Exception {
        return CustomerDAO.getAllCustomer().stream()
                .filter(customer -> customer.getEmail().equalsIgnoreCase(email))
                .findAny().orElseThrow(() -> new Exception("No customer present with this email id"));
    }

    public static void main(String[] args) throws Exception {

        Customer customer = new Customer(101, "John", null, List.of("987656782", "456765234"));

        // empty
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        // of - When we are sure about object can not be null, use this -- NPE will throw
        /* Optional<String> emailOptional = Optional.of(customer.getEmail());
        System.out.println(emailOptional);*/

        // ofNullable - when we are not sure about object may be or may not be null, use this, it has build-in null check
        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
        emailOptional2.ifPresent(System.out::println);

        // Default value if it is null
        System.out.println(emailOptional2.orElse("default@gmail.com"));

        // If it is null, we can throw customized exception
        // System.out.println(emailOptional2.orElseThrow(() -> new IllegalArgumentException("email not present")));

        // Transforming Data of Optional
        System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(() -> "default email ... "));

        System.out.println(getCustomerByEmail("rajib@gmail.com"));

        System.out.println(getCustomerByEmail("dfghjk"));
    }
}
