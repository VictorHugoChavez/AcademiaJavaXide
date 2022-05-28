package com.pruebas;

public abstract class getbinary implements Expresion{
	Expresion izquierda; 
	Expresion derecha;
	
	public getbinary(Expresion izquierda, Expresion derecha) {
		this.izquierda = izquierda;
		this.derecha = derecha;
	}
	
	
}
