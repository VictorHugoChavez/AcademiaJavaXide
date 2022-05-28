package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.model.Deportistas;

public interface CustomerService {

	public List<Deportistas> getCustomers();

	public void saveCustomer(Deportistas theCustomer);

	public Deportistas getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
