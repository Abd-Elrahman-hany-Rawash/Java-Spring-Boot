package com.Lerning.cruddemo.rest;


import com.Lerning.cruddemo.dao.EmloyeeDAO;
import com.Lerning.cruddemo.entity.Employee;
import com.Lerning.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

     @Autowired
    public EmployeeRestController (EmployeeService theEmployeeService){
         employeeService=theEmployeeService;

    }

    @GetMapping("/Employees")
    public List<Employee> findAll(){
       return employeeService.findAll();
    }

    @GetMapping("/Employees/{id}")
    public Employee findById(@PathVariable int id){
         return employeeService.findById(id);

    }
    @PostMapping("/Employees")
    public Employee addEmployee (@RequestBody Employee theEmployee){
         theEmployee.setId(0);
         Employee dbEmployee =employeeService.save(theEmployee);
         return dbEmployee;
    }




}
