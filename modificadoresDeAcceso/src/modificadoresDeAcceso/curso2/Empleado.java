package modificadoresDeAcceso.curso2;

public class Empleado {
	private String nombre;
	protected int edad;
	boolean esContratado; //Default
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
