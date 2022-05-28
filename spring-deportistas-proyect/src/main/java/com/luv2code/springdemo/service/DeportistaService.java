package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Deportistas;

public interface DeportistaService {

	public List<Deportistas> getDeportista();

	public void saveDeportista(Deportistas jugador);

	public Deportistas getDeportista(int theId);

	public void deleteDeportista(int theId);
	
}
