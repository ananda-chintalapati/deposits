package com.cnet.bank.deposits.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cnet.bank.deposits.model.Transactions;

public interface TransactionsRepository extends CrudRepository<Transactions, Integer> {

	Transactions findByTransactionId(String transactionId);
	
	List<Transactions> findByAccountId(String accountId);
	
	Transactions saveTransactions(List<Transactions> transaction);
}
