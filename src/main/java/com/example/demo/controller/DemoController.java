package com.example.demo.controller;

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
    
    	return empRep.findByName("abc");
    }
	
}
