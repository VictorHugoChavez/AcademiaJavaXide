package v7;

public class NoVolar implements ComportamientoVolar {

	@Override
	public void ejecutarVuelo() {
		System.out.println("No vuelo");
	}
	
}
