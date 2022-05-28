package com.examEjercicio.equipo.rest;

public class DeportistaErrorRespuesta {
	//en esta clase se encuentran los valores que tendran al momento de que haya un errror de un valir que no haya sido encontrado
	//en este caso viene el estatus ya sea 200,400,500 de lo que estan en el protocolo HTTP, tambien estara el mensage que nosotrso definamos
	// y por ultimo el tiempo actual, en esta clase vienen sobre los getes y seter y ademas acerca de la sobrecarga de constructores

	private int estatus;
	private String mensage;
	private long tiempoActual;
	
	public DeportistaErrorRespuesta() {
		
	}

	public DeportistaErrorRespuesta(int estatus, String mensage, long tiempoActual) {
		this.estatus = estatus;
		this.mensage = mensage;
		this.tiempoActual = tiempoActual;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public String getMensage() {
		return mensage;
	}

	public void setMensage(String mensage) {
		this.mensage = mensage;
	}

	public long getTiempoActual() {
		return tiempoActual;
	}

	public void setTiempoActual(long tiempoActual) {
		this.tiempoActual = tiempoActual;
	}

	
}