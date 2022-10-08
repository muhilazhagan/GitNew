package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	@Autowired
	MyRepo myRepo;
	
	
	public User add_user(User user) {
		// TODO Auto-generated method stub
		return myRepo.save(user);
	}
	
	
	

}
