package com.rajib.stream.api.example.parallel_stream;

import java.util.List;

public class IBMEmployeeParallelStreamExample {

    public static void main(String[] args) {

        long start;
        long end;

        List<IBMEmployee> employees = IBMEmployeeDAO.getEmployees();

        // Sequential stream
        start = System.currentTimeMillis();
        double avgEmployeeSalSeqStream = employees.stream()
                .map(IBMEmployee::getEmpSal).mapToDouble(i->i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println(STR."Employee Average Salary - \{avgEmployeeSalSeqStream} - Sequential Stream took time in ms - \{end - start}");

        // Parallel stream
        start = System.currentTimeMillis();
        double avgEmployeeSalParallelStream = employees.parallelStream()
                .map(IBMEmployee::getEmpSal).mapToDouble(i->i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println(STR."Employee Average Salary - \{avgEmployeeSalParallelStream} - Parallel Stream took time in ms - \{end - start}");
    }
}
