package com.lti.banking.core.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.banking.core.entities.Register;
import com.lti.banking.core.exceptions.HrException;


@Repository
public class BankDaoImpl implements BankDao{
	@PersistenceContext
	private EntityManager manager;

	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean insertNewUser(Register reg) throws HrException {
		manager.persist(reg);
		return true;
	}


	@Override
	public ArrayList<Register> applicantDetails() throws HrException {
		String strQry = "from Register";
		Query qry = manager.createQuery(strQry);
		List<Register> applicantList = qry.getResultList();
		return (ArrayList<Register>) applicantList;
	}
}
