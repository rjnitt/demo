package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	EmployeeRepository empRep;
	
	
	@RequestMapping(value="/find", method = RequestMethod.GET)
    public Employee addVoucher() {
    
    	return empRep.findOneByName("abc");
    }
	
	
	@RequestMapping(value="/findAll", method = RequestMethod.GET)
    public List<Employee> findAllRecord() {
    
    	return empRep.findAll();
    }
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
    public Employee saveEmp(Employee emp) {
   
    	return empRep.save(emp);
    }
	
}
