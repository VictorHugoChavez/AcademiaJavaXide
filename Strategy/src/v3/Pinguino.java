package v3;

public class Pinguino {
	
	ComportamientoVolar cv=new NoVolar();
	void volar() {
		cv.ejecutarVuelo();
}
}
