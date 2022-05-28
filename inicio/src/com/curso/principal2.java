package com.curso;

public class principal2 {
	public static void main(String[]args) {
		//String nombre="Tercio";
		//int edad=20;
		
		Emplado mexi=new Emplado("Tercio",20);
		System.out.println(mexi.toString());
		System.out.println(mexi.getNombre());
		System.out.println(mexi.getEdad());
		
		
		
		mexi.trabajar();

	}
}
