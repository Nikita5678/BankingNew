package com.lti.banking.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.banking.core.entities.TransactionActivity;
import com.lti.banking.core.exceptions.PaymentException;
import com.lti.banking.core.services.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService service;

	@PostMapping(value = "/pay", consumes = "application/json")
	public void makePayment(@RequestBody TransactionActivity pay) {
		// BankServiceImpl service = new BankServiceImpl();
		System.out.println(pay);
		try {
			service.makeNewPayment(pay);
			System.out.println(pay);
		} catch (PaymentException e) {
			e.printStackTrace();
		}
	}
}
