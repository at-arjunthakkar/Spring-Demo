package com.programmer47.SpringbootDemo.entity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employee_id;
    private String emp_name;
    private int salary;
}
