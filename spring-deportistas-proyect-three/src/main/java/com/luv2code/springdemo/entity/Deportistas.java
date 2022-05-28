package com.luv2code.springdemo.entity;


public class Deportistas {

	private int id;

	private String nombreDeportista;
	
	private String apellidoPaterno;
	
	private String correo;

	private String edad;

	private boolean profesional;

	public Deportistas() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getNombreDeportista() {
		return nombreDeportista;
	}

	public void setNombreDeportista(String nombreDeportista) {
		this.nombreDeportista = nombreDeportista;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public boolean getProfesional() {
		return profesional;
	}

	public void setProfesional(boolean profesional) {
		this.profesional = profesional;
	}

	@Override
	public String toString() {
		return "Deportistas [id=" + id + ", nombreDeportista=" + nombreDeportista + ", apellidoPaterno="
				+ apellidoPaterno + ", correo=" + correo + ", edad=" + edad + ", profesional=" + profesional + "]";
	}

	
}





