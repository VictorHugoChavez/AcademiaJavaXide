package com.examEjercicio.equipo.dao;

import java.util.List;

import com.examEjercicio.equipo.entity.Deportistas;

public interface DeportistaDAO {

	public List<Deportistas> getDeportista();

	public void guardarDeportista(Deportistas jugador);

	public Deportistas getDeportista(int id);

	public void borrarDeportista(int id);
	
}
