package com.cs.customerapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cs.customerapp.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
