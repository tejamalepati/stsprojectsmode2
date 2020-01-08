package com.service;



import com.model.LoginPage;

public interface LoginService  {
	public LoginPage create(LoginPage loginpage);
	public LoginPage readById(int userId);
	public LoginPage readByuserName(String userName);
	public LoginPage updateUser(LoginPage loginpage);
	public void delete(int userId);
	
	
	

}
