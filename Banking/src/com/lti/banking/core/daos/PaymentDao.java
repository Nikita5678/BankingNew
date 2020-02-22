package com.lti.banking.core.daos;


import com.lti.banking.core.entities.Account;
import com.lti.banking.core.entities.TransactionActivity;
import com.lti.banking.core.exceptions.HrException;
import com.lti.banking.core.exceptions.PaymentException;

public interface PaymentDao {

	public boolean makePayment(TransactionActivity pay) throws PaymentException; 
	public Account checkBalance(long accNo) throws PaymentException;
	public void updateBalance(Account acc) throws PaymentException; 
}
