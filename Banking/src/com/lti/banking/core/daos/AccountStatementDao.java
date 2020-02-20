package com.lti.banking.core.daos;

import java.util.ArrayList;
import java.util.List;

import com.lti.banking.core.entities.TransactionActivity;
import com.lti.banking.core.exceptions.StatementException;

public interface AccountStatementDao {

	public ArrayList<TransactionActivity> getStatementList(long accno) throws StatementException;
}
