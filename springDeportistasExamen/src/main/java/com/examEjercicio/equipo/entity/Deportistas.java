package com.examEjercicio.equipo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//este es mi archivos donde hacemos la relacion con nuestro pojo y base de datos
//definiedo la tabla  y los atributos de cada uno 
//Id,GenerateValue significa que es el Id y que es la llave principal
//@Column son las columnas de mi tabla

@Entity
@Table(name="deportistas_info") //hace referencia a la tabla de mi base de datos
public class Deportistas { // es mi clase java declarado como Deportistas

	@Id //indicamos que es un id unico  y que se va estar generando en automatico 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id") //es la comlumna correspondiente de MySQL
	private int id;
	
	@Column(name="nombre_Deportista") //es la comlumna correspondiente de MySQL
	private String nombreDeportista; 
	
	@Column(name="apellido_paterno") //es la comlumna correspondiente de MySQL
	private String apellidoPaterno;
	
	@Column(name="correo") //es la comlumna correspondiente de MySQL
	private String correo;
	
	@Column(name="edad") //es la comlumna correspondiente de MySQL
	private int edad;
	
	@Column(name="profesional") //es la comlumna correspondiente de MySQL, en este caso es de tipo
	private boolean profesional;//boolean por lo que va aparecer en en la base de datos 1 y 0 
	
	public Deportistas() {
		
	}
	//de aqui viene todos los metodos get y set de las variables de mi clase 
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
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





