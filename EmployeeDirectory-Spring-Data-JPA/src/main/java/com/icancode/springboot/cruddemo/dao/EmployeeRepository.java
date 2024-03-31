package com.icancode.springboot.cruddemo.dao;

import com.icancode.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

