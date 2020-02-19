package com.lti.banking.core.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.banking.core.daos.BankDao;
import com.lti.banking.core.daos.BankDaoImpl;
import com.lti.banking.core.entities.Register;
import com.lti.banking.core.exceptions.HrException;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private BankDao dao;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	public boolean createNewUser(Register reg) throws HrException {

		return dao.insertNewUser(reg);
	}

	@Override
	public ArrayList<Register> getApplicantList() throws HrException {
		return dao.applicantDetails();	
	}
}
