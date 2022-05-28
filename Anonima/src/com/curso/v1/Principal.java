package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Predicado pre1 = new ImplementarPredicado();//implemtar interfaces 
		
		boolean res = pre1.prueba("hola mundo");
		System.out.println(res);
		
	}

}
