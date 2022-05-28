package com.repaso;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder name = new StringBuilder("Patrobas");
		int edad = 20;
		
		Emplado emp1 = new Emplado(name,edad);
		System.out.println(emp1);
		
		System.out.println(name); //Patrobas Otro
		System.out.println(edad); //20

	}

}
