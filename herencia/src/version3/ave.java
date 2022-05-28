package version3;

public class ave {
	
	String nombre;
	int edad;
	
	//public Ave() {}
	
	public ave(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public void volar() {
		System.out.println("Volar como " + this.getClass().getSimpleName() );// las clases hijas no tienen nada pero con ayuda del getcllas y get simplenme nos el objeto y su nombre en tiempo de ejecucuion
	}

	@Override
	public String toString() {
		String nombreClase = this.getClass().getSimpleName();
		return nombreClase + " [nombre=" + nombre + ", edad=" + edad + "]";
	}
}
