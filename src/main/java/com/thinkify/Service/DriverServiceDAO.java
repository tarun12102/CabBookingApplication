package com.thinkify.Service;

import java.util.List;

import com.thinkify.Model.Driver;

public interface DriverServiceDAO {
	
	public void add_driver(String person,String car,int current_x,int current_y);
	public List<Driver> get_drivers();
	
}
