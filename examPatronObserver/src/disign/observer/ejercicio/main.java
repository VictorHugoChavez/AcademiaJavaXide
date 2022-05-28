package disign.observer.ejercicio;

public class main {

	public static void main(String... args) {
		
		System.out.println("Patron Observer ejercicio");
		//el objetivo del patron server es que se define una dependencia entre los objetos para transmitir todos los cambios
		//de un objeto concreto de la forma mas sencilla
		
		
		Periodico papel = new Periodico(); //se crea un objeto de tipo Peridico, lo que quiere decir es que tiene solo el metodo comprar, pero al momento de que se ejecuta
		//dentro del metodo se va ejecutar otro metodo llamado notificar que es el que viene de subject por mi herencia 
		new Suscriptor1("Evento Tomorrowland",papel); // se crea un objeto sin un avariable de referencia que al momento de crearse revice dos parametros uno es de tipo String
		// y el otro es de Subject , este se lo la va llevar el garbagecollector
		new Suscriptor3("Cruz Azul es el campeon ",papel);// se crea un objeto sin un avariable de referencia que al momento de crearse revice dos parametros uno es de tipo String
		// y el otro es de Subject
		
		papel.compra();// se va jecutar el metodo compra
		
		System.out.println("----------------");
		new Suscriptor2(" La nueva obra del El sastre de la mafia Nada por aqui, nada por alla",papel);//se crea el objeto suscriptor 
		// y se envia como parametro los datos y papael, tendra que pasar y por ultimo lo que se mostrara en mi consola
		// notificando lo  anterior  y lo que se agrego y tambien aplicaria en caso de que  se remueva de mi lista, y la finalidad
		// del patron observer es notificar el estado de los demas
		papel.compra();
		
		System.out.println("----------------");
		new Suscriptor1("Entresvista con el equipo que participara en EUA sobre aeronaves no tripuladas",papel);
		papel.compra(); // cada vez que se ejecute el patron Observer, va informar lo que paso
		//por eso en mi consola va aumentando cada vez que se ejecuta  el metodo de la clase periodico
	}

}
