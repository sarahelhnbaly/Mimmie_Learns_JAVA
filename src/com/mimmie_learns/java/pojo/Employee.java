package com.mimmie_learns.java.pojo;

public class Employee extends School {
    private Integer employeeId;
    private String employeeName;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;

    }
    public void workHour(int hours) {
        System.out.println("Employee work hour: " + hours);
    }
}
