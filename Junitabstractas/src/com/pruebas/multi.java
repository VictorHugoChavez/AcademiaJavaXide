package com.pruebas;
					//Is-a
public class multi extends getbinary {
	
	//has-ha



	public multi(Expresion izquierda, Expresion derecha) {
		super(izquierda, derecha);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return izquierda.getValor()*derecha.getValor();
	}

}
