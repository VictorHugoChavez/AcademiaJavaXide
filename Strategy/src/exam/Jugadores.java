package exam;

public abstract class Jugadores { //se crea la clase jugadores 
	Estrategia mov;// definivos nuestra variable de referencia llamad mov
	
	void jugadas() {// esta el metodo de jugadas de la clase donde el delegamos la accion
		mov.realizarMovimiento();//realiza la accion de realizar movimientos
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+": [mov=" + mov.getClass().getSimpleName() + "]";
	}
	

}
