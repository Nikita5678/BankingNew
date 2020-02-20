package com.lti.banking.core.services;

import java.util.ArrayList;

import com.lti.banking.core.entities.TransactionActivity;
import com.lti.banking.core.exceptions.StatementException;

public interface AccStatementService {

	public ArrayList<TransactionActivity> getAccountStatement(long accno) throws StatementException;
}
