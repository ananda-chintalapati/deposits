package com.cnet.bank.deposits.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cnet.bank.deposits.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	Employee findByEmployeeId(String employeeId);
	
	List<Employee> findByName(String name);
}
