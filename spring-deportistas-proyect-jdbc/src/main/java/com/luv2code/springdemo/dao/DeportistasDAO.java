package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Deportistas;

public interface DeportistasDAO {

	public List<Deportistas> getDeportistas();

	public void saveDeportistas(Deportistas jugador);

	public Deportistas getDeportistas(int theId);

	public void deleteDeportistas(int theId);
	
}
