package com.lti.banking.core.services;

import com.lti.banking.core.entities.TransactionActivity;
import com.lti.banking.core.exceptions.PaymentException;

public interface PaymentService {

	public boolean makeNewPayment(TransactionActivity pay) throws PaymentException;
}
