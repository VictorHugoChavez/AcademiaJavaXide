package com.pruebas;

public class Constante implements Expresion {

	private double valor;

	public Constante(double valor) {
		this.valor=valor;
	}
	
	@Override
	public double getValor() {
		return valor;
	}
	
	
}
