package com.example.employeemanagementsystem.rest;

import com.example.employeemanagementsystem.entity.Department;
import com.example.employeemanagementsystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DepartmentRestController {
    private DepartmentService departmentService;

    @Autowired
    public DepartmentRestController(DepartmentService iDept)
    {
        departmentService = iDept;
    }

    @GetMapping("/departments")
    public List<Department> findAll()
    {
        return departmentService.findAll();
    }

    @GetMapping("/departments/{deptId}")
    public Department getDepartment(@PathVariable int deptId)
    {
        Department theDept = departmentService.findById(deptId);
        if(theDept == null)
        {
            throw new RuntimeException("Department Id not found - " + deptId);
        }
        return theDept;
    }

    @PostMapping("/departments")
    public Department addDepartment(@RequestBody Department theDept)
    {
        theDept.setDeptId(0);
        departmentService.save(theDept);
        return theDept;
    }

    @PutMapping("/departments")
    public Department updateDepartment(@RequestBody Department theDept)
    {
        departmentService.save(theDept);
        return theDept;
    }

    @DeleteMapping("/departments/{deptId}")
    public String deleteDepartment(@PathVariable int deptId)
    {
        Department theDept = departmentService.findById(deptId);
        if(theDept == null)
        {
            throw new RuntimeException("Department Id not found - " + deptId);
        }
        departmentService.deleteById(deptId);
        return "Deleted Department id - " + deptId;
    }
}
