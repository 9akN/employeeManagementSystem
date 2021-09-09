package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> findAll();

    Department findById(int id);

    void save(Department department);

    void deleteById(int id);
}
