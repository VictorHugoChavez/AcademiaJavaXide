package disign.observer.ejercicio;

public class Periodico extends Subject {
	
	public void compra() { // solo contiene el metodo compra, al cual dentro de ella solo imprime y realiza lo que dice notificar de mi clase padre Subjetc
		System.out.println("Compraste el periodico el Universal");
		notificar(); // cuando se ejecuta compra tambien el el metodo de notificar se eejcuta
	}

}
