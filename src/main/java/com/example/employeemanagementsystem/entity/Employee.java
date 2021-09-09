package com.example.employeemanagementsystem.entity;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="emp_id")
    private int employeeId;

    @Column(name="birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="hire_date")
    @Temporal(TemporalType.DATE)
    private Date hireDate;

    public Employee() {};

    public Employee(int employeeId, Date birthDate, String firstName, String lastName, Date hireDate) {
        this.employeeId = employeeId;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
    };

    public int getEmployeeId() {
        return employeeId;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", birthDate=" + birthDate +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
