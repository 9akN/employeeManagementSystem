package com.example.employeemanagementsystem.dao;

import com.example.employeemanagementsystem.entity.Department;

import java.util.List;

public interface DepartmentDAO {
    List<Department> findAll();

    Department findById(int id);

    void save(Department department);

    void deleteById(int id);
}
