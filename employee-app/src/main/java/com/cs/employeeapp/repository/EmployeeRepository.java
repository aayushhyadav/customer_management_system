package com.cs.employeeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cs.employeeapp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
