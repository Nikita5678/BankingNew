package com.lti.banking.core.services;

import java.util.ArrayList;

import com.lti.banking.core.entities.PayeeDetail;
import com.lti.banking.core.exceptions.PayeeException;

public interface PayeeService {
	public ArrayList<PayeeDetail> getPayeeList() throws PayeeException;
	public boolean createNewPayee(PayeeDetail addpayee) throws PayeeException;
}
