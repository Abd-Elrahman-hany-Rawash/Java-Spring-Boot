package com.Lerning.cruddemo.dao;

import com.Lerning.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDaoImplment implements EmloyeeDAO{
     private EntityManager entityManager;

     @Autowired
     public EmployeeDaoImplment(EntityManager theEntityManager){
         entityManager=theEntityManager;
     }

     @Override
    public List<Employee> findAll() {

         TypedQuery<Employee> theQuery= entityManager.createQuery("from Employee",Employee.class);
         List<Employee> employees = theQuery.getResultList();
        return employees;
    }

    @Override
    public Employee findById(int id) {
        Employee theEmployee = entityManager.find(Employee.class,id);
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
         Employee dbEmployee=entityManager.merge(theEmployee);
        return dbEmployee;
    }

    @Override
    public void delete(int id) {
         Employee theEmployee = entityManager.find(Employee.class,id);
         entityManager.remove(theEmployee);

    }


}
