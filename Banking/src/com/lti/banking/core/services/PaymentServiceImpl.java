package com.lti.banking.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.banking.core.daos.PaymentDao;
import com.lti.banking.core.entities.Account;
import com.lti.banking.core.entities.TransactionActivity;
import com.lti.banking.core.exceptions.PaymentException;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDao dao;

	@Transactional
	@Override
	public boolean makeNewPayment(TransactionActivity pay) throws PaymentException {
		long acc1 = pay.getAccountNo();
		Account acc = dao.checkBalance(acc1);
		double bal = acc.getBalance();
		if (bal >= pay.getAmount()) {
			acc.setBalance(bal - pay.getAmount());
			pay.setStatus("success");
			dao.updateBalance(acc);
			return dao.makePayment(pay);
		}

		pay.setStatus("failed");
		return dao.makePayment(pay);

	}

}
