package com.curso;

import java.util.Objects;

public class Emplado {
	 private String nombre;
	 private int edad;


	//Constructor
	Emplado(){System.out.println("Se genera el constructor por defecto");}
	
	//Empelado(String nombreparametro)
	//{nombre=nombreparametro;
	
	
	Emplado(String nombre) {
		this.nombre=nombre;
	}

	Emplado(String nombre, int edad) {
		this.nombre = "otro "+nombre;
		this.edad = edad;
	}
	
	//getter y setter comportamiento
	
	
	
	public String getNombre() {
		return nombre;
	}

	public boolean setNombre(String nombre) {
		if(!nombre.isEmpty()) {
			this.nombre = nombre;
			return true;
		}else
			return false;
	}

	public int getEdad() {
		return edad;
	}

	public boolean setEdad(int edad) {
		if(edad>0) {
			this.edad = edad;
			return true;
		}else
			return false;
	}

	@Override
	public boolean equals(Object obj) {/// 0 cast
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emplado other = (Emplado) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Emplado [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public void trabajar() {System.out.println(nombre+" esta trabajando alegremente");}
	

}
