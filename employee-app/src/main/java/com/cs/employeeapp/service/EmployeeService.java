package com.cs.employeeapp.service;

import java.util.List;

import com.cs.employeeapp.model.Employee;


public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	public Employee getEmployeeById(int employeeId);
	public boolean deleteEmployee(int employeeId);
	public List<Employee> getAllEmployees();
	public Employee updateEmployee(Employee employee);
}
