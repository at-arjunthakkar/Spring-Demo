package com.programmer47.SpringbootDemo.service;

import com.programmer47.SpringbootDemo.entity.Employee;
import com.programmer47.SpringbootDemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> fetchEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public void deleteEmployeeById(long id) {
        employeeRepo.deleteById(id);
    }
}
