package v3;

public class Pato {
	ComportamientoVolar cv=new NoVolar();
	
	void volar() {
		cv.ejecutarVuelo();
		// System.out.println("VSolar"); el algoritmo interno cambio por requerimiento del cliente

	}
}
