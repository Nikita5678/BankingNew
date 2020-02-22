package com.lti.banking.core.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.banking.core.daos.PayeeDao;
import com.lti.banking.core.entities.PayeeDetail;
import com.lti.banking.core.entities.Register;
import com.lti.banking.core.exceptions.HrException;
import com.lti.banking.core.exceptions.PayeeException;

@Service
public class PayeeServiceImpl implements PayeeService {

	@Autowired
	private PayeeDao dao;
	
	@Override
	public ArrayList<PayeeDetail> getPayeeList() throws PayeeException {
		return dao.getPayeeList();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	public boolean createNewPayee(PayeeDetail addpayee) throws PayeeException {
		return dao.insertNewPayee(addpayee);
	}

	

}
