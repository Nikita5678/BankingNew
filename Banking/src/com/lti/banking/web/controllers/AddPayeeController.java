package com.lti.banking.web.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.banking.core.entities.PayeeDetail;
import com.lti.banking.core.entities.Register;
import com.lti.banking.core.exceptions.HrException;
import com.lti.banking.core.exceptions.PayeeException;
import com.lti.banking.core.services.PayeeService;


@RestController
@CrossOrigin
public class AddPayeeController {

	@Autowired
	private PayeeService service;
	
	@PostMapping(value = "/addPayee", consumes = "application/json")
	public boolean addPayee(@RequestBody  PayeeDetail payee) {
		System.out.println(payee);
		
		try {
			service.createNewPayee(payee);
		} catch (PayeeException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	@GetMapping(value = "/payeeList", produces = "application/json") 
	public @ResponseBody ArrayList<PayeeDetail> getPayeeList() {
		ArrayList<PayeeDetail> payeeList = null;
		try {
			payeeList = service.getPayeeList();
			//System.out.println(applicantList);
		} catch (PayeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return payeeList;
	}
	
}
