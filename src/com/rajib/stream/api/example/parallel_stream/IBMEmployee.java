package com.rajib.stream.api.example.parallel_stream;

import java.util.Objects;

public class IBMEmployee {

    private Integer empId;
    private String empName;
    private String empDept;
    private Double empSal;

    public IBMEmployee(Integer empId, String empName, String empDept, Double empSal) {
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

    public Double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Double empSal) {
        this.empSal = empSal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IBMEmployee that)) return false;
        return Objects.equals(getEmpId(), that.getEmpId()) && Objects.equals(getEmpName(), that.getEmpName()) && Objects.equals(getEmpDept(), that.getEmpDept()) && Objects.equals(getEmpSal(), that.getEmpSal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(), getEmpName(), getEmpDept(), getEmpSal());
    }

    @Override
    public String toString() {
        return STR."IBMEmployee{empId=\{empId}, empName='\{empName}\{'\''}, empDept='\{empDept}\{'\''}, empSal=\{empSal}\{'}'}";
    }
}
