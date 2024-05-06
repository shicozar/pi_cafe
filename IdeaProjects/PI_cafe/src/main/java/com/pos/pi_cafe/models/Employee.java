package com.pos.pi_cafe.models;


import javax.persistence.*;

@Entity
@Table(name="emplyoee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long employeeId;
    private int storeId;
    private String employeeName;
    private double salary;
    @Column(name="password")
    private String password;

    public Long getEmployeeId() {
        return employeeId;
    }

    public int getStoreId() {
        return storeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
