package com.lti.banking.core.daos;

import java.util.ArrayList;

import com.lti.banking.core.entities.Register;
import com.lti.banking.core.exceptions.HrException;

public interface BankDao {
	
	public boolean insertNewUser(Register reg) throws HrException; 
	public ArrayList<Register> applicantDetails() throws HrException;
}
