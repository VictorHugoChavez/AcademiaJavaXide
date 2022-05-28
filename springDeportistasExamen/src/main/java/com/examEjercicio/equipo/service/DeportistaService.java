package com.examEjercicio.equipo.service;

import java.util.List;

import com.examEjercicio.equipo.entity.Deportistas;

public interface DeportistaService {
	
	//esta es mi interface donde se declaran los metodos de mi service , como sabemos todos son abstractos y vacios

	public List<Deportistas> getDeportista();

	public void guardarDeportista(Deportistas jugador);

	public Deportistas getDeportista(int id);

	public void borrarDeportista(int id);
	
}
