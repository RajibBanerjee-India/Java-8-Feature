package com.rajib.stream.api.example;

import java.util.Objects;

public class AmazonEmployee {

    private Integer empId;
    private String empName;
    private String empDept;
    private Long empSal;
    private String grade;

    public AmazonEmployee(Integer empId, String empName, String empDept, Long empSal, String grade) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
        this.empSal = empSal;
        this.grade = grade;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AmazonEmployee that)) return false;
        return Objects.equals(getEmpId(), that.getEmpId()) && Objects.equals(getEmpName(), that.getEmpName()) && Objects.equals(getEmpDept(), that.getEmpDept()) && Objects.equals(getEmpSal(), that.getEmpSal()) && Objects.equals(getGrade(), that.getGrade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(), getEmpName(), getEmpDept(), getEmpSal(), getGrade());
    }

    @Override
    public String toString() {
        return STR."AmazonEmployee{empId=\{empId}, empName='\{empName}\{'\''}, empDept='\{empDept}\{'\''}, empSal=\{empSal}, grade='\{grade}\{'\''}\{'}'}";
    }
}
