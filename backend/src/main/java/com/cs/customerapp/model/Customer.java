package com.cs.customerapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "customer_data")
public class Customer {
	
		@Id
	    @Column(name = "customer_id")   
	    private Integer customerId;
	    
	    @Column(name = "customer_name", length = 50, nullable = false)    
	    private String customerName;
	    
	    @Column(name = "password")
	    private String password;
	    
	    @Column(name = "email", unique = true)
	    private String email;
	    
	    @Column(name = "account_type")
	    private String accType;
}
