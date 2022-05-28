package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		
		Predicado pre1 = new Predicado() {
			@Override
			public boolean prueba(String x) {
				return x.endsWith("mundo");
			}
		};
		
		boolean res = pre1.prueba("Hello mundo");
		System.out.println(res);
		
	}
	


}
