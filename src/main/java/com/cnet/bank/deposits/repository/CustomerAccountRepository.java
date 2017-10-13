package com.cnet.bank.deposits.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cnet.bank.deposits.model.CustomerAccount;

public interface CustomerAccountRepository extends CrudRepository<CustomerAccount, Integer> {

	List<CustomerAccount> findByCustomerId(String customerId);
	
	CustomerAccount findByAccountId(String accountId);
	
}
