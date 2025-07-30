package com.Lerning.cruddemo.service;

import com.Lerning.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
    public Employee findById(int id);
    public Employee save (Employee theEmployee);
    public void delete (int id);
    }
