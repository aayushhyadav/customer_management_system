package com.cs.customerapp.service;

import java.util.List;

import com.cs.customerapp.model.Customer;

public interface CustomerService {

	public Customer addCustomer(Customer customer);
	public Customer getCustomerById(int customerId);
	public boolean deleteCustomer(int customerId);
	public List<Customer> getAllCustomers();
	public Customer updateCustomer(Customer customer);
}
