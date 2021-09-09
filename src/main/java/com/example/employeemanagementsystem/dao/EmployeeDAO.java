package com.example.employeemanagementsystem.dao;

import com.example.employeemanagementsystem.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee employee);

    void deleteById(int id);
}
