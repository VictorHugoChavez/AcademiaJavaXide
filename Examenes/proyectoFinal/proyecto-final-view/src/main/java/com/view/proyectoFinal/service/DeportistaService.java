package com.view.proyectoFinal.service;

import java.util.List;

import com.view.proyectoFinal.entity.Deportistas;

public interface DeportistaService {

	public List<Deportistas> getDeportista();

	public void saveDeportista(Deportistas jugador);

	public Deportistas getDeportista(int theId);

	public void deleteDeportista(int theId);
	
}
