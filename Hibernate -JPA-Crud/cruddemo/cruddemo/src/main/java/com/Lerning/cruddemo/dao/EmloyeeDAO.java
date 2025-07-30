package com.Lerning.cruddemo.dao;

import com.Lerning.cruddemo.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmloyeeDAO {
    public List<Employee> findAll();
    public Employee findById(int id);
    public Employee save (Employee theEmployee);
    public void delete (int id);
}
