package com.thinkify.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thinkify.Model.Driver;
import com.thinkify.Repository.DriverRepositoryImpl;

@Component
public class DriverServiceDAOImpl implements DriverServiceDAO{
	
	@Autowired
	DriverRepositoryImpl driverDao;
	
	@Override
	public void add_driver(String person,String car,int current_x,int current_y)
	{
		String[] personDetails = person.split(",");
		
		String name = personDetails[0].trim();
		String gender =  personDetails[1].trim();
		int age = Integer.parseInt(personDetails[2].trim());
		
		String[] carDetails = car.split(",");
		
		String carName = carDetails[0].trim();
		String carNumber = carDetails[1].trim();
		
		driverDao.add_driver(name, gender, age, carName, carNumber, current_x, current_y);
		
	}
	
	@Override
	public List<Driver> get_drivers()
	{
		return driverDao.get_drivers();
	}
}
