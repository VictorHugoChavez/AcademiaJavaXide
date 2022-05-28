package com.examTestingCompos;

public class Constante implements Expresion { // implemneta lo de constante 

	private double valor;

	public Constante(double valor) { ///es ele contructor de mi clase Constante 
		this.valor=valor;
	}
	
	@Override
	public double getValor() {// se implementa el metodo getvlaor dodne retorna un valor de tipo double 
		return valor;
	}
	
	
}
