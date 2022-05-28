package com.repaso;


public class Emplado {
	private StringBuilder name;
	private int edad;
	
	public Emplado(StringBuilder name, int edad) {
		System.out.println("Del inicio constructor: "+edad);
		name = name.append(" Otro");
		edad = 10;
		this.name = name;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + name + ", edad=" + edad + "]";
	} 
	
}
