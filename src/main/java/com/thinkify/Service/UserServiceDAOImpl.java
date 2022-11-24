package com.thinkify.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thinkify.Repository.UserRepositoryImpl;

@Component
public class UserServiceDAOImpl implements UserServiceDAO{

	@Autowired
	UserRepositoryImpl userDao ;
	
	public void add_user(String user)
	{
		String[] userDetails = user.split(",");
		
		String name = userDetails[0].trim();
		String gender =  userDetails[1].trim();
		int age = Integer.parseInt(userDetails[2].trim());
		
		userDao.add_user(name, gender, age);
		
	}
}
