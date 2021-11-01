package com.programmer47.SpringbootDemo.controller;

import com.programmer47.SpringbootDemo.entity.Employee;
import com.programmer47.SpringbootDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/emp")
    public Employee saveEmployee(@RequestBody Employee employee)
    {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/emps")
    public List<Employee> fetchEmployees()
    {
        return employeeService.fetchEmployees();
    }

    @GetMapping("/emp/{id}")
    public Employee getEmployeeById(@PathVariable("id") long id)
    {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/emp/{id}")
    public void deleteEmployee(@PathVariable("id") long id)
    {
        employeeService.deleteEmployeeById(id);
    }
}
