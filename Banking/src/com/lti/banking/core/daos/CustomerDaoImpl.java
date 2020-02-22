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
import com.lti.banking.core.entities.UserDetail;
import com.lti.banking.core.exceptions.AdminException;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	private EntityManager manager;

	
	@Override
	public ArrayList<Register> userDetails() throws AdminException {
		String strQry = "select r from Register r where r.applicationStatus= :status";
		Query qry = manager.createQuery(strQry);
		qry.setParameter("status", "Approved");
		List<Register> userList = qry.getResultList();
		return (ArrayList<Register>) userList;
	}

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public boolean setNewUser(long applNo, String status) throws AdminException {
		String strQry = "select r from Register r where r.applicationNo= :applNo";
		Query qry = manager.createQuery(strQry);
		qry.setParameter("applNo", applNo);
		Register reg = (Register) qry.getSingleResult();
		reg.setApplicationStatus(status);
		return true;
	}

	@Override
	public ArrayList<Register> unApprovedUserList() throws AdminException {
		String strQry = "select r from Register r where r.applicationStatus= :status";
		Query qry = manager.createQuery(strQry);
		qry.setParameter("status", "Rejected");
		List<Register> userList = qry.getResultList();
		return (ArrayList<Register>) userList;
	}

}
