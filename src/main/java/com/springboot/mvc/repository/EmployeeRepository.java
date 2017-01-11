package com.springboot.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.mvc.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
