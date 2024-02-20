package com.rajib.stream.api.example;

import java.util.List;

public class EmployeeDAO {

    public static List<Employee> getEmployees() {

        Employee employee1 = new Employee(177, "Rajib Banerjee", "IT", 600000L);
        Employee employee2 = new Employee(323, "Ranajoy Banerjee", "CIVIL", 900000L);
        Employee employee3 = new Employee(567, "Karabi Banerjee", "DEFENCE", 1000000L);
        Employee employee4 = new Employee(980, "Ranita Banerjee", "SOCIAL", 1200000L);
        Employee employee5 = new Employee(980, "Kuntal Banerjee", "SOCIAL", 500000L);

        return List.of(employee1, employee2, employee3, employee4, employee5);
    }
}
