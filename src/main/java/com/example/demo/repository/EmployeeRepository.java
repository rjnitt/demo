package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	  Employee findByName(String name);
	  
	  

	}