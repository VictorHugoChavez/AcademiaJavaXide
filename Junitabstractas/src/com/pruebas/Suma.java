package com.pruebas;
					//Is-a
public class Suma extends getbinary {
	
	public Suma(Expresion izquierda, Expresion derecha) {
							super(izquierda, derecha);
						
						}

	//has-ha



	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return izquierda.getValor()+derecha.getValor();
	}

}
