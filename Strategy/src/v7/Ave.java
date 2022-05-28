package v7;

public abstract class Ave {
	//HAS-A 
	ComportamientoVolar cv;
	 void volar() {
		 //DELEGAR
		 cv.ejecutarVuelo();
	 }
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " : [cv=" + cv.getClass().getSimpleName() + "]";
	}
	 
	 
}
