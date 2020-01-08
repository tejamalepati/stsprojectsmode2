package com.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.model.LoginPage;

public interface LoginDaoRepository extends CrudRepository<LoginPage, Integer> {


	public LoginPage findByUserId(int userId);
	@Query("select lp from LoginPage lp where userName=?1")
	public LoginPage findByUserName(String userName);
	public LoginPage findByUserId(LoginPage loginpage);

	
	

	
}
