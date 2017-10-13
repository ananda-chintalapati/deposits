package com.cnet.bank.deposits.model;

import java.util.Date;

public class CustomerAccount {

	private String accountId;
	
	private String accountNumber;
	
	private String customerId;
	
	private String accountType;
	
	private long amount;
	
	private Date lastUpdated;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Override
	public String toString() {
		return "CustomerAccount [accountId=" + accountId + ", accountNumber=" + accountNumber + ", customerId="
				+ customerId + ", accountType=" + accountType + ", amount=" + amount + ", lastUpdated=" + lastUpdated
				+ "]";
	}
	
	
}
