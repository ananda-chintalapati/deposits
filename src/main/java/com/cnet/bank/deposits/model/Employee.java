package com.cnet.bank.deposits.model;

import java.util.Date;

public class Employee {

	private String employeeId;
	
	private String name;
	
	private String dob;
	
	private Date hireDate;
	
	private String role;
	
	private String password;
	
	private String lastLogin;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", dob=" + dob + ", hireDate=" + hireDate
				+ ", role=" + role + ", password=" + password + ", lastLogin=" + lastLogin + "]";
	}
	
	
}
