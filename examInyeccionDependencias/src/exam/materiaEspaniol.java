package exam;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  //aqui es donde va implementar las dependencias por eso lo define  desde la clase
public class materiaEspaniol implements acercaDeLasMaterias {

	//@Autowired  //AUTOWIRED es el que 
	//@Qualifier("randomClases") //
	private informeHackthon fortuneService; //este es la variable tipo private, el cual es de tipo FortuneService
	
	// define a default constructor
	public materiaEspaniol() { //es el constructor por default, sirve para revisar que todo esta pasando correctamente
		System.out.println(">> Se inico la materia de espaniol a las 7am pasando por el constructor ");
	}

	// define my init method
	@PostConstruct //este metodo indica cuando realiza la inyeccion de independencias, cuando se contruye
	public void inicioClase() {
		System.out.println(">>La profesora pasa lista antes de dar la clase");
	}
	
	// define my destroy method
	@PreDestroy // este metodo se destruye despues de que se le inyecto la variable 
	public void finClase() { 
		System.out.println(">>La profesora daja la tarea en cuanto termina la clase");		
	}
		
	@Override // el metodo es implementado por mi interfaz acerca de las materias 
	public String vistoEnClase() {
		return "En la clase se discutio sobre la importancia de los temas de los valores";
	}
	
	@Autowired
	public materiaEspaniol(@Qualifier("randomClases") informeHackthon fortuneService) { // se realiza el iyeccion de indeendencias por el medio de constructor 
		this.fortuneService = fortuneService;											// por lo cual este el Qualifer debe estar dentro ya que si esta por fuera dara un error
	}																					// ademas de que  se implementa por variables 

	@Override
	public String getDailyFortune() {// el metodo  es implementado por mi interfaz de acerca de las materias
		return fortuneService.getFortune();
	}

}
