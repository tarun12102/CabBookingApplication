package com.thinkify.Repository;

import java.util.List;

import com.thinkify.Model.Driver;

public interface DriverRepository {
	
	public void add_driver(String name, String gender, int age, String carName, String carNumber, int current_x, int current_y);
	public List<Driver> get_drivers();

}
