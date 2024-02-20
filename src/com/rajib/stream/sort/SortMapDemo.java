package com.rajib.stream.sort;

import com.rajib.stream.api.example.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Eight", 8);
        map.put("Four", 4);
        map.put("Ten", 10);
        map.put("Two", 2);

        System.out.println("\n>>>> Sorting By Map Key - Primitive Type <<<<<");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println); // Key - Ascending order

        System.out.println("\n>>>> Sorting By Map Value - Primitive Type <<<<<");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println); // Value - Ascending order

        Map<Employee, Integer> employeeMap = new HashMap<>();
        employeeMap.put(new Employee(177, "Rajib Banerjee", "IT", 600000L), 60);
        employeeMap.put(new Employee(323, "Ranajoy Banerjee", "CIVIL", 900000L), 90);
        employeeMap.put(new Employee(567, "Karabi Banerjee", "DEFENCE", 1000000L), 100);
        employeeMap.put(new Employee(980, "Ranita Banerjee", "SOCIAL", 1200000L), 120);
        employeeMap.put(new Employee(980, "Kuntal Banerjee", "SOCIAL", 500000L), 50);

        System.out.println("\n>>>> Sorting By Map Key - Object Type. Ascending Employee Salary <<<<<");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmpSal))).forEach(System.out::println);

        System.out.println("\n>>>> Sorting By Map Key - Object Type. Descending Employee Name <<<<<");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmpName).reversed())).forEach(System.out::println);
    }
}
