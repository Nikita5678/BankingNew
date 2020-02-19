package com.lti.banking.core.entities;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACTION_ACTIVITY")
public class TransactionActivity {

	@Id
	@Column(name="TRANSACTION_NO")
	private long transactionNo;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="ACCOUNTNO")
	private long accountNo;
	
	@Column(name="PAYEE_ACC_NO")
	private long payeeAccNo;
	
	@Column(name="TRANSACTION_TYPE")
	private String transactionType;
	
	@Column(name="DATE_AND_TIME")
	private Date date;
	
	@Column(name="TRANSFER_AMOUNT")
	private double ammount;
	
	@Column(name="STATUS")
	private String status;

	public TransactionActivity() {
		
	}

	public TransactionActivity(long transactionNo, String name, long accountNo, long payeeAccNo, String transactionType,
			Date date, double ammount, String status) {
		super();
		this.transactionNo = transactionNo;
		this.name = name;
		this.accountNo = accountNo;
		this.payeeAccNo = payeeAccNo;
		this.transactionType = transactionType;
		this.date = date;
		this.ammount = ammount;
		this.status = status;
	}

	public long getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(long transactionNo) {
		this.transactionNo = transactionNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public long getPayeeAccNo() {
		return payeeAccNo;
	}

	public void setPayeeAccNo(long payeeAccNo) {
		this.payeeAccNo = payeeAccNo;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmmount() {
		return ammount;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TransactionActivity [transactionNo=" + transactionNo + ", name=" + name + ", accountNo=" + accountNo
				+ ", payeeAccNo=" + payeeAccNo + ", transactionType=" + transactionType + ", date=" + date
				+ ", ammount=" + ammount + ", status=" + status + "]";
	}
	
	
	
}
