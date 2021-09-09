package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.dao.DepartmentDAO;
import com.example.employeemanagementsystem.dao.EmployeeDAO;
import com.example.employeemanagementsystem.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentDAO departmentDAO;

    @Autowired
    public DepartmentServiceImpl(DepartmentDAO iDept) {
        departmentDAO = iDept;
    }

    @Override
    @Transactional
    public List<Department> findAll() {
        return departmentDAO.findAll();
    }

    @Override
    @Transactional
    public Department findById(int id) {
        return departmentDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(Department department) {
        departmentDAO.save(department);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        departmentDAO.deleteById(id);
    }
}
