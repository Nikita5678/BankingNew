package com.lti.banking.core.services;

import java.util.ArrayList;

import com.lti.banking.core.entities.Register;
import com.lti.banking.core.exceptions.AdminException;

public interface AdminService {

	public ArrayList<Register> getUserList() throws AdminException;
	public boolean setApprovedUser(long applNo , String status) throws AdminException;
	public ArrayList<Register> getRejectedUserList() throws AdminException;
}
