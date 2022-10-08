package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	MyService myService;

	@GetMapping("/getstatus")
	public String getstatus() {
		return ("Application is up and running!!!");
	}

	@PostMapping(value = "/addUser")
	public User addUser(@RequestBody User user) {

		return myService.add_user(user);
	}

}
