package com.lti.banking.core.daos;

import java.util.ArrayList;

import com.lti.banking.core.entities.Register;
import com.lti.banking.core.entities.UserDetail;
import com.lti.banking.core.exceptions.AdminException;
import com.lti.banking.core.exceptions.HrException;

public interface CustomerDao {

	public ArrayList<Register> userDetails() throws AdminException;
	public boolean setNewUser(long acc , String status) throws AdminException;
	public ArrayList<Register> unApprovedUserList() throws AdminException;
}
