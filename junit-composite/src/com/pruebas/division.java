package com.pruebas;
					//Is-a
public class division implements Expresion {
	
	//has-ha
	Expresion izquierda; 
	Expresion derecha;
	

	public division(Expresion izquierda, Expresion derecha) {
		this.izquierda=izquierda;
		this.derecha=derecha;
	}



	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return izquierda.getValor()/derecha.getValor();
	}

}
