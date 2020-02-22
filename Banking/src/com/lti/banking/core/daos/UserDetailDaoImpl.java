package com.lti.banking.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.banking.core.entities.Account;
import com.lti.banking.core.entities.Register;
import com.lti.banking.core.entities.UserDetail;
import com.lti.banking.core.exceptions.StatementException;
import com.lti.banking.core.exceptions.UserDetailException;

@Repository
public class UserDetailDaoImpl implements UserDetailDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public UserDetail getUserDetail(long accno) throws UserDetailException {

		Query qry = manager.createQuery("select a from Account a where a.accountNo= :accno");
		qry.setParameter("accno", accno);
		Account acc = (Account) qry.getSingleResult();
		// Register reg = (Register) qry.getSingleResult();
		// System.out.println("Account data in dao: " + acc);
		long applNo = acc.getApplicationNo();
		UserDetail detail = new UserDetail();
		detail.setAccountNo(acc.getAccountNo());
		detail.setBalance(acc.getBalance());

		Query qry1 = manager.createQuery("select r from Register r where r.applicationNo= :applNo");
		qry1.setParameter("applNo", applNo);
		Register reg = (Register) qry1.getSingleResult();
		detail.setName(reg.getName());
		detail.setEmail(reg.getEmail());
		detail.setPhoneNo(reg.getPhoneNo());
		detail.setAadharNo(reg.getAadharNo());
		detail.setPan(reg.getPan());
		detail.setAddress(reg.getAddress());
		detail.setNominee(reg.getNominee());
		detail.setdOB(reg.getdOB());
		detail.setAccType(reg.getAcc_type());
		detail.setUser_id(reg.getUser_id());
		return detail;
	}

}
