package com.cnet.bank.deposits.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cnet.bank.deposits.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	Customer findByCustomerId(String customerId);
	
	List<Customer> findByName(String name);
	
	
}
