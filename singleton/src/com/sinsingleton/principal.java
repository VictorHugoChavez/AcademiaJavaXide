package com.sinsingleton;

public class principal {
	public static void main(String[] args) {
		
		Conexion con1= Conexion.getInstance();
		
		System.out.println(Conexion.contador);
	}
}
