package disign.observer.ejercicio;

public abstract class Observer {
	
	Subject subject; //Subject es mi atributo de mi instancia de clase
	
	public Observer(Subject subject) { // es mi constructor de la mi clase Observer
		this.subject = subject;
		subject.attach(this);//adjunta a mi texto de mi objeto a mi 
	}
	abstract void update();// este es mi metodo abstracto update
}
