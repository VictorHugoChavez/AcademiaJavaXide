package com.examTestingCompos;
					//Is-a
public class Resta extends getbinary { //la clase Division es un elementos compuesto
	
	public Resta(Expresion izquierda, Expresion derecha) { //es mi constructor que se genera al momento de extender de getBinary 
							super(izquierda, derecha);// y por ultimo implmenta la interface Expresion
						}

	@Override
	public double getValor() {// es el metodo que se esta implmentando de mi interfaz expresion
		return izquierda.getValor()-derecha.getValor();//retorna dos valores  que se estan restando 
	}

}
