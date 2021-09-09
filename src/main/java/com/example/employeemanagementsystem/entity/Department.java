package com.example.employeemanagementsystem.entity;

import javax.persistence.*;

@Entity
@Table(name="departments")
public class Department {
    @Id
    @Column(name="dept_id")
    private int deptId;

    @Column(name="dept_name")
    private String deptName;

    public Department(){};

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    };

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
