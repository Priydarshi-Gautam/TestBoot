package com.boot.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.boot.test.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	

}
