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
		reg.setApplicationStatus("Unapproved");
		manager.persist(reg);
		return true;
	}


	@Override
	public ArrayList<Register> applicantDetails() throws HrException {
		String strQry = "select r from Register r where r.applicationStatus= :status";
		Query qry = manager.createQuery(strQry);
		qry.setParameter("status","Unapproved");
		List<Register> applicantList = qry.getResultList();
		return (ArrayList<Register>) applicantList;
	}
}
