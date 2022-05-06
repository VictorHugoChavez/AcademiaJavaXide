package singleton;

public class CuentaAdminstrador {
	
	private String nombre, correo;// Se crean las  variable de instancia de
	//clase de nombre y correo se ponen de caracter privado para que no se puedan modificar
	private int contrasenia;// Se crea la variable de instancia de clase de contraseña
	//y es privado 
	static int contador; //se crea una variable de referencia de clase llamado contador
	//para identificar que es lo que pasa cuando se crea el objeto
	static private CuentaAdminstrador admin1;//Se crea una variable de referencia objeto de clase
	//llamado de la misma forma que la clase.
	
	private CuentaAdminstrador(String nombre,String correo,int contrasenia) {//se crea un constructor privado  para 
	//que solo lo pueda utilizar la clase y nadie mas , lo que contiene se les llama variables de 
		//de  referencia local "String nombre,String correo,int contrasenia"
		this.nombre=nombre;
		this.correo=correo;
		this.contrasenia=contrasenia;
		contador++;// cada vez que se llame al constructor el contador debe aumentar +1
	}
	public static CuentaAdminstrador getInstance() { // el metodo es estatico ya que 
	
		if(admin1 == null) {// si nuestra variable de referencia es nulo (es decir que no apuente a un objeto) tendra que crear un objeto 
			admin1=new CuentaAdminstrador("Adminstrador","victor94436@innovacion.com.mx",2014110239);
			return admin1;// regresa lo que contega admin que en este caso es el objeto new CuentaAdminstrador(...)
		}
		return admin1;// en caso contrario de que admin ya este apuntado aun objeto solo regresa lo que apunta admin, sin craer un nuevo objeto
	}
	@Override
	public String toString() {// se crea el metedo string para revisar los datos y ver lo que regresa.
		return "CuentaAdminstrador [nombre=" + nombre + ", correo=" + correo + ", contrasenia=" + contrasenia + "]";
	}
	
	
}
