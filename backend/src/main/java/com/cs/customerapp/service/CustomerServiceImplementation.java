package com.cs.customerapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.customerapp.model.Customer;
import com.cs.customerapp.repository.CustomerRepository;

@Service
public class CustomerServiceImplementation implements CustomerService {
	@Autowired
	private CustomerRepository repo;
	
	public Customer addCustomer(Customer customer) {
		return repo.save(customer);
	}

	
	public Customer getCustomerById(int customerId) {
		return repo.findById(customerId).get();
	}

	
	public boolean deleteCustomer(int customerId) {
		repo.deleteById(customerId);
		return !repo.existsById(customerId);
	}

	
	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	
	public Customer updateCustomer(Customer customer) {
		return repo.save(customer);
	}
}