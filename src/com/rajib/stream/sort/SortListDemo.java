package com.rajib.stream.sort;

import com.rajib.stream.api.example.Employee;
import com.rajib.stream.api.example.EmployeeDAO;

import java.util.Comparator;
import java.util.List;

public class SortListDemo {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(9, 12, 10, 8, 22, 15, 14);

        integerList.stream().sorted().forEach(System.out::println); // Ascending

        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // Descending

        List<Employee> employeeList = EmployeeDAO.getEmployees();

        // Stream and Lambda - Ascending Employee Salary
        System.out.println("\n>>>> Ascending Employee Salary <<<<");
        employeeList.stream().sorted((emp1, emp2) -> (int) (emp1.getEmpSal() - emp2.getEmpSal())).forEach(System.out::println);

        // Stream, Lambda and Comparator.comparing() - Ascending Employee Name
        System.out.println("\n>>>> Ascending Employee Name <<<<");
        employeeList.stream().sorted(Comparator.comparing(emp -> emp.getEmpName())).forEach(System.out::println);

        // Stream, Method reference and Comparator.comparing() - Ascending Employee Department
        System.out.println("\n>>>> Ascending Employee Department <<<<");
        employeeList.stream().sorted(Comparator.comparing(Employee::getEmpDept)).forEach(System.out::println);
    }
}
