package com.lti.banking.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.banking.core.daos.UserDetailDao;
import com.lti.banking.core.entities.UserDetail;
import com.lti.banking.core.exceptions.StatementException;
import com.lti.banking.core.exceptions.UserDetailException;

@Service
public class UserDetailServiceImpl implements UserDetailService {

	
	@Autowired
	private UserDetailDao dao;
	
	
	@Override
	public UserDetail getUserDetail(long accno) throws UserDetailException{
		
		return dao.getUserDetail(accno);
		
		
		
	}

}
