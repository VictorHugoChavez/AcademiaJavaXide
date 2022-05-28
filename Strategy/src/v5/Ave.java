package v5;

public abstract class Ave {
	//HAS-A 
	ComportamientoVolar cv= new Sivolar();
	 void volar() {
		 //DELEGAR
		 cv.ejecutarVuelo();
	 }
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " Ave [cv=" + cv + "]";
	}
	 
	 
}
