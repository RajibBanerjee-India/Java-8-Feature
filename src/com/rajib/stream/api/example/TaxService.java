package com.rajib.stream.api.example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> getTaxableEmployees(String input) {

        return input.equals("Tax") ? EmployeeDAO.getEmployees().stream().filter(employee -> employee.getEmpSal() > 600000).collect(Collectors.toList())
                : EmployeeDAO.getEmployees().stream().filter(employee -> employee.getEmpSal() <= 600000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(getTaxableEmployees("Non Tax"));
    }
}
