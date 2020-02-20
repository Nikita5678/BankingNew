package com.lti.banking.core.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.banking.core.daos.AccountStatementDao;
import com.lti.banking.core.entities.TransactionActivity;
import com.lti.banking.core.exceptions.StatementException;

@Service
public class AccStatementServiceImpl implements AccStatementService {

	@Autowired
	private AccountStatementDao dao;
	@Override
	public ArrayList<TransactionActivity> getAccountStatement(long accno) throws StatementException {
		return  dao.getStatementList(accno);
	}

}
