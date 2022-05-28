package disign.observer.ejercicio;

import java.util.*;

public abstract class Subject {
	
	List<Observer> listaObservadores = new ArrayList<>();// Se nos da entender que
	//habra una lista  de tipo Observer, y seran las unicas que va aceptar por la definicion de generics
	
	void attach(Observer o) {
		listaObservadores.add(o); //agrega las variables a mi lista 
	}
	
	void detach(Observer o) {
		listaObservadores.remove(o);//remueve el comoponente a mi lista 
	}
	
	void notificar() { // se ejecuta mi  variable 
		for ( Observer o:listaObservadores)
			o.update();
	}
	
}
