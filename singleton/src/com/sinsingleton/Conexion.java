package com.sinsingleton;

public class Conexion {
	private String nombre;
	static int contador;
	static private Conexion conector;
	
	private Conexion(String nombre) {
		this.nombre=nombre;
		contador++;
	}
	static public Conexion getInstance() {
		if(conector == null) {
			conector=new Conexion("BdOracle");
			return conector;
		}else
		return conector;
	}
	@Override
	public String toString() {
		return "Conexion [nombre=" + nombre + "]";
	}
	

}
