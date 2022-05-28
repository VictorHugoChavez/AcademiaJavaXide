package exam;

public class Ataque implements Estrategia{//Se crea la clase ataque y se implementa la interfaz de estrategia en donde estamos implementando 
	//el metodo de la interfaz

	@Override
	public void realizarMovimiento() {//// al imolmentar la interfaz, el metodo se define y se le da una accion 
		System.out.println("Realiza la jugada de ataque al momento de estar cercas de la porteria");//Se le da una accion al metodo.
		
	}

}
