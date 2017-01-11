package com.springboot.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mvc.model.Employee;
import com.springboot.mvc.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository empRepository;

	@RequestMapping("/create")
	public Employee InsertEmployee(@RequestBody Employee employee){
		return empRepository.save(employee);
	}
	
	@RequestMapping("/getElement")
	public Employee GetEmployee(){
		return empRepository.findOne(1L);
	}
}
