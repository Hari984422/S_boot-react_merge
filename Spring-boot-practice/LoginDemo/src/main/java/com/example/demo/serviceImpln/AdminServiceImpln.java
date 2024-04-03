package com.example.demo.serviceImpln;

import org.springframework.stereotype.Service;

import com.example.demo.exception.DataNotFoundException;
import com.example.demo.service.AdminService;

@Service
public class AdminServiceImpln implements AdminService{

	@Override
	public String login(String email, String pswd) {
		if(email.equals("admin@gmail.com")&&pswd.equals("admin@123")) {
			return "6543";
		}
		else {
			throw new DataNotFoundException("Admin","email or pswd","Invalid");
			
		}
	}


}
