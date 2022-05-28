package com.curso;

public class Cliente implements Comparable <Cliente>{
	
	private String nombre;
	private int cuenta;
	private double pagoRecibido;
	
	
	public Cliente(String nombre, int cuenta, double pagoRecibido) {
		super();
		this.nombre = nombre;
		this.cuenta = cuenta;
		this.pagoRecibido = pagoRecibido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCuenta() {
		return cuenta;
	}


	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}


	public double getPagoRecibido() {
		return pagoRecibido;
	}


	public void setPagoRecibido(double pagoRecibido) {
		this.pagoRecibido = pagoRecibido;
	}
	
	
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", cuenta=" + cuenta + ", pagoRecibido=" + pagoRecibido + "]";
	}


	@Override
	public int compareTo(Cliente o) {
		if (this.nombre.compareTo(o.nombre) > 0)
			return 100;
		if (this.nombre.compareTo(o.nombre) < 0)
			return -100;
		return 0;
		
	}

	//@Override
	//public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		//return (int) (o.pagoRecibido - this.pagoRecibido);
	//}


	//@Override
	//public int compareTo(Cliente c) {
		//if (this.nombre.compareTo(c.nombre) > 0)
			//return -100;
		//if (this.nombre.compareTo(c.nombre) < 0)
			//return 100;
		//return this.cuenta - c.cuenta;
		//}

	
}
