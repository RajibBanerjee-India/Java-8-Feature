package com.rajib.stream.api.example;

import java.util.Objects;

public class Employee {

    private Integer empId;
    private String empName;
    private String empDept;
    private Long empSal;

    public Employee(Integer empId, String empName, String empDept, Long empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
        this.empSal = empSal;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public Long getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Long empSal) {
        this.empSal = empSal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(getEmpId(), employee.getEmpId())
                && Objects.equals(getEmpName(), employee.getEmpName())
                && Objects.equals(getEmpDept(), employee.getEmpDept())
                && Objects.equals(getEmpSal(), employee.getEmpSal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(), getEmpName(), getEmpDept(), getEmpSal());
    }

    @Override
    public String toString() {
        return STR."Employee{empId=\{empId}, empName='\{empName}\{'\''}, empDept='\{empDept}\{'\''}, empSal=\{empSal}\{'}'}";
    }
}
