package com.curso;

import java.util.Objects;

public class estudiante {
	
	String nombre;
	int edad;
	int grado;


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		estudiante other = (estudiante) obj;
		return Objects.equals(nombre, other.nombre);
	}
		estudiante(){
			
			this("Sin asignar",15);// inoca al constructor que recibe un string y un entero
			//System.out.println("Constructor generado");
			//nombre="Sin asignar";
			//edad=15;
		}

	
		estudiante(String nombre) {

		this.nombre = nombre;
	}



		estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}



		estudiante(String nombre, int edad, int grado) {
		this.nombre = nombre;
		this.edad = edad;
		this.grado = grado;
	}


	
	

}
