package com.cnet.bank.deposits.model;

import java.util.Date;

public class Transactions {

	private String transcationId;
	
	private String accountId;
	
	private String type;
	
	private String message;
	
	private String amount;
	
	private Date postedDate;
	
	private String status;

	public String getTranscationId() {
		return transcationId;
	}

	public void setTranscationId(String transcationId) {
		this.transcationId = transcationId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Transactions [transcationId=" + transcationId + ", accountId=" + accountId + ", type=" + type
				+ ", message=" + message + ", amount=" + amount + ", postedDate=" + postedDate + ", status=" + status
				+ "]";
	}
	
	
}
