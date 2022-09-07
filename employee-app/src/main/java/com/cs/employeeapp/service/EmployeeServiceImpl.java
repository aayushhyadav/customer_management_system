package com.cs.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.employeeapp.model.Employee;
import com.cs.employeeapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public Employee addEmployee(Employee employee) {
		return repo.save(employee);
	}

	
	public Employee getEmployeeById(int employeeId) {
		return repo.findById(employeeId).get();
	}

	
	public boolean deleteEmployee(int employeeId) {
		repo.deleteById(employeeId);
		return !repo.existsById(employeeId);
	}

	
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	
	public Employee updateEmployee(Employee employee) {
		return repo.save(employee);
	}

}
