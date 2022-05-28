package com.examTestingCompos;
					//Is-a
public class Suma extends getbinary {
	
	public Suma(Expresion izquierda, Expresion derecha, Expresion enMedio) { //es el constructor que se genera en automatico por 
		super(izquierda, derecha, enMedio);  // mi clase padre donde recibe tres parametros

	}

	@Override
	public double getValor() {   // es el metodo que se esta implmentando de mi interfaz expresion      
		return izquierda.getValor()+enMedio.getValor()+derecha.getValor();//retorna tres valores que se estan sumando  
	}
}