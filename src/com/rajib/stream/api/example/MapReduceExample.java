package com.rajib.stream.api.example;

public class MapReduceExample {

    public static void main(String[] args) {

        // Get Employees whose grade A
        // Get salary
        double averageSalary = AmazonEmployeeDAO.getEmployees().stream()
                .filter(amazonEmployee -> amazonEmployee.getGrade().equals("A"))
                .map(AmazonEmployee::getEmpSal)
                .mapToDouble(i -> i)
                .average().getAsDouble();

        System.out.println(STR."Average Salary of Grade A Employee - \{averageSalary}");

        double sumSalary = AmazonEmployeeDAO.getEmployees().stream()
                .filter(amazonEmployee -> amazonEmployee.getGrade().equals("A"))
                .map(AmazonEmployee::getEmpSal)
                .mapToDouble(i->i)
                .sum();

        System.out.println(STR."Sum of Salary of Grade A Employee - \{sumSalary}");
    }
}
