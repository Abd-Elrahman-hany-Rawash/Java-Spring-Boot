package com.Lerning.cruddemo.service;

import com.Lerning.cruddemo.dao.EmloyeeDAO;
import com.Lerning.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImplement implements EmployeeService{
    private EmloyeeDAO emloyeeDAO;
    @Autowired
   public EmployeeServiceImplement(EmloyeeDAO theEmployeeDao){
       emloyeeDAO=theEmployeeDao;
   }

    @Override
    public List<Employee> findAll() {
        return emloyeeDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        return emloyeeDAO.findById(id);
    }
    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return emloyeeDAO.save(theEmployee);
    }

    @Transactional
    @Override
    public void delete(int id) {
        emloyeeDAO.delete(id);

    }
}
