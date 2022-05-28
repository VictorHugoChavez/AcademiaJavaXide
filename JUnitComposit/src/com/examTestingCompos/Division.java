package com.examTestingCompos;
					//Is-a
public class Division extends getbinary { //la clase Division es un elementos compuesto
	
	public Division(Expresion izquierda, Expresion derecha) { //es mi constructor que se genera al momento de extender de getBinary 
							super(izquierda, derecha);
						}
	@Override
	public double getValor() { //es el metodo que se implemneta de mi interfaz Expresion
		return izquierda.getValor()/derecha.getValor();//retorna dos valores  que se estan dividiendo  dos valores
	}

}
