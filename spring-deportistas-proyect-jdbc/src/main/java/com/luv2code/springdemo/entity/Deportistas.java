package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deportistas_info")
public class Deportistas {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre_Deportista")
	private String nombreCompleto;
	
	@Column(name="apellido_paterno")
	private String apellidoPaterno;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="edad")
	private String edad;
	
	@Column(name="profesional")
	private boolean profesional;

	public Deportistas() {
		
	}

	
	
	public Deportistas(int id, String nombreCompleto, String apellidoPaterno, String correo, String edad,
			boolean profesional) {
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.apellidoPaterno = apellidoPaterno;
		this.correo = correo;
		this.edad = edad;
		this.profesional = profesional;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
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
		return "Deportistas [id=" + id + ", nombreCompleto=" + nombreCompleto + ", apellidoPaterno=" + apellidoPaterno
				+ ", correo=" + correo + ", edad=" + edad + ", profesional=" + profesional + "]";
	}

	
	
}





