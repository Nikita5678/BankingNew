package com.lti.banking.core.services;

import com.lti.banking.core.entities.UserDetail;
import com.lti.banking.core.exceptions.UserDetailException;


public interface UserDetailService {

	public UserDetail getUserDetail(long accno) throws UserDetailException;
}
