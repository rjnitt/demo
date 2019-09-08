package com.rjnitt.boilerplate.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rjnitt.boilerplate.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	Employee findOneByName(String name);

	List<Employee> findAll();

}