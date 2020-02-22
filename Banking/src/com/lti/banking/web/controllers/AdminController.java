package com.lti.banking.web.controllers;

import java.util.ArrayList;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.banking.core.entities.Register;
import com.lti.banking.core.exceptions.AdminException;
import com.lti.banking.core.services.AdminService;

@CrossOrigin
@RestController
public class AdminController {
	
	@Autowired
	private AdminService service;

	@GetMapping(value = "/userList", produces = "application/json") 
	public @ResponseBody ArrayList<Register> getUserList() {
		ArrayList<Register> userList = null;
		try {
			userList = service.getUserList();
			//System.out.println(applicantList);
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return userList;
	}
	
	@PostMapping(value = "/approvedUser", produces = "application/json")
	public @ResponseBody void approvedUser(@PathParam(value = "applNo") long applNo,@PathParam(value = "status") String status){
		
		//long accNo=acc.getAccountNo();
		//ArrayList<TransactionActivity> stmt=null;
		
		try {
		service.setApprovedUser(applNo , status);
		} catch (AdminException e) {
			
			e.printStackTrace();
		}
	}
	
	@GetMapping(value = "/rejectedUserList", produces = "application/json") 
	public @ResponseBody ArrayList<Register> getRejectedUserList() {
		ArrayList<Register> rejectedUserList = null;
		try {
			rejectedUserList = service.getRejectedUserList();
			//System.out.println(applicantList);
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rejectedUserList;
	}
}
