package com.lti.banking.core.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.lti.banking.core.entities.TransactionActivity;
import com.lti.banking.core.exceptions.StatementException;



@Repository
public class AccountStatementDaoImpl implements AccountStatementDao {

	@PersistenceContext
	EntityManager manager;

	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public ArrayList<TransactionActivity> getStatementList(long accno) throws StatementException {
		
		Query qry=manager.createQuery("select t from TransactionActivity t where t.accountNo= :accountno");
		qry.setParameter("accountno", accno);
		List<TransactionActivity> list = qry.getResultList();
		return (ArrayList<TransactionActivity>) list;
	}
	
	/*@PersistenceContext
	private EntityManager manager;
	
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public ArrayList<TransactionActivity> getStatementList(long accno) throws StatementException {
		
		List<TransactionActivity> activity= (List<TransactionActivity>) manager.find(TransactionActivity.class, accno);
		return (ArrayList<TransactionActivity>) activity;
	}*/

}
