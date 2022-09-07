package com.cs.employeeapp.controller;


import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cs.employeeapp.model.Employee;
import com.cs.employeeapp.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;

// @Controller - returns a view or a page
//returns resources or rest APIs
@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:4200") // allow angular project to connect with the server
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostConstruct
	public void init() {
		log.info("Controller instance created...");
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee e) {
		return employeeService.addEmployee(e);
	}
	
	// id is a dynamic value
	@DeleteMapping("/employees/{id}")
	public boolean deleteEmployee(@PathVariable("id") int id) {
		return employeeService.deleteEmployee(id);
		
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return employeeService.getEmployeeById(id);
		
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
}
