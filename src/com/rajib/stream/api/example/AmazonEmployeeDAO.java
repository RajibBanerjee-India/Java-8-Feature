package com.rajib.stream.api.example;

import java.util.List;

public class AmazonEmployeeDAO {

    public static List<AmazonEmployee> getEmployees() {

        AmazonEmployee employee1 = new AmazonEmployee(177, "Rajib Banerjee", "IT", 600000L, "B");
        AmazonEmployee employee2 = new AmazonEmployee(323, "Ranajoy Banerjee", "CIVIL", 900000L, "A");
        AmazonEmployee employee3 = new AmazonEmployee(567, "Karabi Banerjee", "DEFENCE", 1000000L, "A");
        AmazonEmployee employee4 = new AmazonEmployee(980, "Ranita Banerjee", "SOCIAL", 1200000L, "A");
        AmazonEmployee employee5 = new AmazonEmployee(980, "Kuntal Banerjee", "SOCIAL", 500000L, "C");

        return List.of(employee1, employee2, employee3, employee4, employee5);
    }
}
