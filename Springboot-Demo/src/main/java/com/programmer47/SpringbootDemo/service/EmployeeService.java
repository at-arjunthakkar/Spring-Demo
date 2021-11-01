package com.programmer47.SpringbootDemo.service;

import com.programmer47.SpringbootDemo.entity.Employee;

import java.util.List;


public interface EmployeeService {

    public Employee saveEmployee(Employee employee);

    public List<Employee> fetchEmployees();

    public Employee getEmployeeById(long id);

    public void deleteEmployeeById(long id);
}
