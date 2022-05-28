package com.examTestingCompos;
					//Is-a
public class Multi extends getbinary { //la clase Multi es un elementos compuesto

	public Multi(Expresion izquierda, Expresion derecha) {//es mi constructor que se genera al momento de extender de getBinary 
		super(izquierda, derecha);

	}

	
	@Override
	public double getValor() {//es el metodo que se implemneta de mi interfaz Expresion
		return izquierda.getValor()*derecha.getValor();//se multiplican y se retornan 
	}

}
