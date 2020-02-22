package com.lti.banking.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {

	@Id
	@Column(name = "ACCOUNTNO")
	private long accountNo;

	@Column(name = "APPLICATIONNO")
	private long applicationNo;

	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "BALANCE")
	private double balance;

	@Column(name = "ACC_TYPE")
	private String accType;

	public Account() {

	}

	public Account(long accountNo, long applicationNo, String userId, double balance, String accType) {
		super();
		this.accountNo = accountNo;
		this.applicationNo = applicationNo;
		this.userId = userId;
		this.balance = balance;
		this.accType = accType;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public long getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(long applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

}
