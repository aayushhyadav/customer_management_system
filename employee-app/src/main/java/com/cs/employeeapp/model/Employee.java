package com.cs.employeeapp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "employee_db")
public class Employee {
    
    @Id
    @Column(name = "employee_id")    //optional
    private int employeeId;
    
    @Column(name = "employee_name", length = 50, nullable = false)    //optional
    private String employeeName;
    
    @Column(name = "join_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate joinDate;
    
//    @Column(unique = true)
//    private String email;
}