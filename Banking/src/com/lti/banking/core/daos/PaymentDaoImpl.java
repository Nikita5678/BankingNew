package com.lti.banking.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.banking.core.entities.Account;
import com.lti.banking.core.entities.TransactionActivity;

import com.lti.banking.core.exceptions.PaymentException;

@Repository
public class PaymentDaoImpl implements PaymentDao {

	@PersistenceContext
	private EntityManager manager;

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean makePayment(TransactionActivity pay) throws PaymentException {
		manager.persist(pay);
		return true;
	}

	@Override
	public Account checkBalance(long accNo) throws PaymentException {
		Query qry = manager.createQuery("select a from Account a where a.accountNo= :acc");
		qry.setParameter("acc", accNo);
		Account acc = (Account) qry.getSingleResult();
		//double bal = acc.getBalance();
		return acc;
	}

	@Override
	public void updateBalance(Account acc) throws PaymentException {
		double bal = acc.getBalance();
		long accNo = acc.getAccountNo();
		manager.merge(acc);
//		System.out.println(acc);
//		Query qry = manager.createQuery("update Account a set a.balance= :bal where a.accountNo= :acc");
//		qry.setParameter("acc", accNo);
//		qry.setParameter("bal", bal);
//		 qry.getSingleResult();
	}

}
