package com.lti.banking.core.daos;
import com.lti.banking.core.entities.UserDetail;
import com.lti.banking.core.exceptions.UserDetailException;

public interface UserDetailDao {

	public UserDetail getUserDetail(long accno) throws UserDetailException;
}
