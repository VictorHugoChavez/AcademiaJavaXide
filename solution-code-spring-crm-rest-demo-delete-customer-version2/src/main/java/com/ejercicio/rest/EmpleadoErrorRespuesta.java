package com.ejercicio.rest;

public class EmpleadoErrorRespuesta {

	private int estatus;
	private String mensage;
	private long tiempoActual;
	
	public EmpleadoErrorRespuesta() {
		
	}

	public EmpleadoErrorRespuesta(int estatus, String mensage, long tiempoActual) {
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