package com.lti.banking.core.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.banking.core.daos.CustomerDao;
import com.lti.banking.core.entities.Register;
import com.lti.banking.core.exceptions.AdminException;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private CustomerDao dao;

	@Override
	public ArrayList<Register> getUserList() throws AdminException {

		return dao.userDetails();
	}

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public boolean setApprovedUser(long applNo, String status) throws AdminException {
		return dao.setNewUser(applNo, status);
	}

	@Override
	public ArrayList<Register> getRejectedUserList() throws AdminException {
		
		return dao.unApprovedUserList();
	}

}
