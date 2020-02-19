package com.lti.banking.core.entities;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Register")
public class Register {

	@Id
	private long applicationNo;
	private String name;
	private String email;
	private String pan;
	private long aadharNo;
	private long phoneNo;
	private String address;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date dOB;
	
	@Column(name = "STATUS")
	private String applicationStatus;
	private String nominee;
	private String password;
	private String acc_type;
	private String user_id;

	public Register() {

	}

	public Register(long applicationNo, String name, String email, String pan, long aadharNo, long phoneNo,
			String address, Date dOB, String applicationStatus, String nominee, String password,
			String acc_type, String user_id) {
		super();
		this.applicationNo = applicationNo;
		this.name = name;
		this.email = email;
		this.pan = pan;
		this.aadharNo = aadharNo;
		this.phoneNo = phoneNo;
		this.address = address;
		this.dOB = dOB;
		this.applicationStatus = applicationStatus;
		this.nominee = nominee;
		this.password = password;
		this.acc_type = acc_type;
		this.user_id = user_id;
	}

	public long getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(long applicationNo) {
		this.applicationNo = applicationNo;
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

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAcc_type() {
		return acc_type;
	}

	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Register [applicationNo=" + applicationNo + ", name=" + name + ", email=" + email + ", pan=" + pan
				+ ", aadharNo=" + aadharNo + ", phoneNo=" + phoneNo + ", address=" + address + ", dOB=" + dOB
				+ ", applicationStatus=" + applicationStatus + ", nominee=" + nominee + ", password=" + password
				+ ", acc_type=" + acc_type + ", user_id=" + user_id + "]";
	}

	
}
