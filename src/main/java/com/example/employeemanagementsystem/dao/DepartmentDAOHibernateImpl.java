package com.example.employeemanagementsystem.dao;

import com.example.employeemanagementsystem.entity.Department;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class DepartmentDAOHibernateImpl implements DepartmentDAO {
    private EntityManager entityManager;

    @Autowired
    public DepartmentDAOHibernateImpl(EntityManager eM) {
        entityManager = eM;
    }

    @Override
    public List<Department> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Department> query = currentSession.createQuery("from Department ", Department.class);
        List<Department> departments = query.getResultList();
        return departments;
    }

    @Override
    public Department findById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Department department = currentSession.get(Department.class, id);
        return department;
    }

    @Override
    public void save(Department department) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(department);
    }

    @Override
    public void deleteById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("delete from Department where id=:deptId");
        theQuery.setParameter("deptId", id);
        theQuery.executeUpdate();
    }
}
