package com.rajib.stream.api.example.parallel_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IBMEmployeeDAO {

    public static List<IBMEmployee> getEmployees() {

        List<IBMEmployee> employees = new ArrayList<>();

        for (int i=1; i<=1000; i++) {
            employees.add(new IBMEmployee(i, STR."employee\{i}", "A", (double) new Random().nextInt(1000 * 100)));
        }

        return employees;
    }
}
