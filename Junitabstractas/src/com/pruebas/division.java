package com.pruebas;
					//Is-a
public class division extends getbinary {
	
	public division(Expresion izquierda, Expresion derecha) {
							super(izquierda, derecha);
							// TODO Auto-generated constructor stub
						}


	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return izquierda.getValor()/derecha.getValor();
	}

}
