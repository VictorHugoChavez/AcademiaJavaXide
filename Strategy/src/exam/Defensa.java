package exam;

public class Defensa implements Estrategia{//Se crea la clase  defensa y se implementa la interfaz de estrategia en donde estamos implementando 
	//el metodo de la interfaz

	@Override
	public void realizarMovimiento() {//// al imolmentar la interfaz, el metodo se define y se le da una accion 
		System.out.println("Defiende cuanto el equipo contrario este cercas de la porteria");//Se le da una accion al metodo.
		
	}

}
