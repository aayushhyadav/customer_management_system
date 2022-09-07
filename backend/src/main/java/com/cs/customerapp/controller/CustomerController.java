package com.cs.customerapp.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.cs.customerapp.model.Customer;
import com.cs.customerapp.service.CustomerService;
import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostConstruct
	public void init() {
		log.info("Controller instance created...");
	}
	
	@GetMapping("/customer")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}
	
	@PostMapping("/customer")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Customer addCustomer(@RequestBody Customer e) {
		return customerService.addCustomer(e);
	}
	
	// id is a dynamic value
	@DeleteMapping("/customer/{id}")
	public boolean deleteCustomer(@PathVariable("id") int id) {
		return customerService.deleteCustomer(id);
		
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomerById(@PathVariable("id") int id) {
		return customerService.getCustomerById(id);
		
	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
}