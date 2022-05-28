package singlenton;

public class Conexion {
	private String nombre;
	static int contador;
	private Conexion conector; //conector va ser tipo conexion
	
	private Conexion(String nombre) {
		this.nombre=nombre;
		contador++;
	}
	
	public Conexion getInstance() {
		return conector;
	}
	
}


