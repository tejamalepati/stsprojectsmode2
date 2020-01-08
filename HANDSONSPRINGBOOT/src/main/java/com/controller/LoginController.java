package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.LoginPage;
import com.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/first")
	public String Login() {
		return "Welcome to Login Page";
	}

	@PostMapping(value = "/create")
	public LoginPage createByUserId(@RequestBody LoginPage loginpage) {
		return this.loginService.create(loginpage);
	}

	@RequestMapping(value = "/getbyid/{userId}")
	public LoginPage getUserbyId(@PathVariable int userId) {
		return this.loginService.readById(userId);
	}

	@RequestMapping(value = "/getbyname/{userName}")
	public LoginPage getUserbyId(@PathVariable String userName) {
		return this.loginService.readByuserName(userName);
	}
	
	@PutMapping(value ="/update")
	public LoginPage updateByUserID(@RequestBody LoginPage loginpage){
		
		return this.loginService.create(loginpage);
	}

	@DeleteMapping(value = "/delete/{userId}")
	public void deletebyId(@PathVariable int userId) {
		this.loginService.delete(userId);
	}
	}
