package com.lti.banking.core.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserDetail {

	private long accountNo;
	private String accType;
	private double balance;
	private String name;
	private String email;
	private String pan;
	private long aadharNo;
	private long phoneNo;
	private String address;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date dOB;
	private String nominee;
	private String user_id;

	public UserDetail() {
		super();
	}

	public UserDetail(long accountNo, String accType, double balance, String name, String email, String pan,
			long aadharNo, long phoneNo, String address, Date dOB, String nominee, String user_id) {
		super();
		this.accountNo = accountNo;
		this.accType = accType;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.pan = pan;
		this.aadharNo = aadharNo;
		this.phoneNo = phoneNo;
		this.address = address;
		this.dOB = dOB;
		this.nominee = nominee;
		this.user_id = user_id;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getdOB() {
		return dOB;
	}

	public void setdOB(Date dOB) {
		this.dOB = dOB;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

}
