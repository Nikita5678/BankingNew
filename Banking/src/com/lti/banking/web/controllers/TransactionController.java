package com.lti.banking.web.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.banking.core.entities.Account;
import com.lti.banking.core.entities.TransactionActivity;
import com.lti.banking.core.exceptions.StatementException;
import com.lti.banking.core.services.AccStatementService;

@RestController
public class TransactionController {
	
	@Autowired
	private AccStatementService service;
	
	@PutMapping(value = "/accountStatement", produces = "application/json")
	public @ResponseBody ArrayList<TransactionActivity> getAccStatement(@RequestBody Account acc){
		
		long accNo=acc.getAccountNo();
		ArrayList<TransactionActivity> stmt=null;
		
		try {
			stmt=service.getAccountStatement(accNo);
		} catch (StatementException e) {
			
			e.printStackTrace();
		}
		return stmt;
	}

}
