package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LoginDaoRepository;
import com.model.LoginPage;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDaoRepository loginDaoRepository;

	@Override
	public LoginPage create(LoginPage loginpage) {

		return this.loginDaoRepository.save(loginpage);
	}

	@Override
	public LoginPage readById(int userId) {
		return this.loginDaoRepository.findByUserId(userId);

	}

	@Override
	public LoginPage readByuserName(String userName) {

		return this.loginDaoRepository.findByUserName(userName);
	}

	@Override
	public LoginPage updateUser(LoginPage loginpage) {
		
		return this.loginDaoRepository.findByUserId(loginpage);
	}


	@Override
	public void delete(int userId) {
		
		this.loginDaoRepository.deleteById(userId);;
	}

	

	
	
}
