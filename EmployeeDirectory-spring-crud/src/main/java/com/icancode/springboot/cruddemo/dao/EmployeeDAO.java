package com.icancode.springboot.cruddemo.dao;

import com.icancode.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int id);

    Employee Save(Employee employee);

    void deleteById(int id);

}
