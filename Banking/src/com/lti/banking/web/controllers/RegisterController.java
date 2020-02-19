package com.lti.banking.web.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.banking.core.entities.Register;

import com.lti.banking.core.exceptions.HrException;
import com.lti.banking.core.services.BankService;
import com.lti.banking.core.services.BankServiceImpl;


@RestController
public class RegisterController {

	@Autowired
	private BankService service;

	@PostMapping(value = "/register", consumes = "application/json")
	public void register(@RequestBody Register reg) {
//		BankServiceImpl service = new BankServiceImpl();
		System.out.println(reg);
		try {
			service.createNewUser(reg);
		} catch (HrException e) {
			e.printStackTrace();
		}
	}
	
	@GetMapping(value = "/applicantList", produces = "application/json") 
	public @ResponseBody ArrayList<Register> getApplicantList() {
		ArrayList<Register> applicantList = null;
		try {
			applicantList = service.getApplicantList();
			//System.out.println(applicantList);
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return applicantList;
	}
}
