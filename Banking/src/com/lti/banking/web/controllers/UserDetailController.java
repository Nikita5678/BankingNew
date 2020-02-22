package com.lti.banking.web.controllers;





import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.lti.banking.core.entities.Account;
import com.lti.banking.core.entities.UserDetail;
import com.lti.banking.core.exceptions.UserDetailException;
import com.lti.banking.core.services.UserDetailService;

@CrossOrigin
@RestController
public class UserDetailController {

	@Autowired
	private  UserDetailService service;
	
	
	@GetMapping(value = "/userDetail", produces = "application/json")
	public @ResponseBody UserDetail getUserDetail(@PathParam("acc") long acc) {
		
		//long accNo=(long) acc;
		UserDetail user=null;
		
		
			try {
				user=service.getUserDetail(acc);
			} catch (UserDetailException e) {
				e.printStackTrace();
			}
		    return user;
	}
}
