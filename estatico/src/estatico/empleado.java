package estatico;

public class empleado {
	private String nombre;
	private int edad;
	static int contador;// ya no pertenece a una variable del objeto, y se convierte a la variable de la clase
	// y es por eso que se el resultado es 2 y  y cuando se quita estatic sale 1
	public empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador ++; // contador= contador+1;
	}
	public int getContador() {
		return 10;
	}
	
	@Override
	public String toString() {
		return "empleado [nombre=" + nombre + ", edad=" + edad + "]";
	}
	

}
