package exam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) { // se defien el metodo main

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("aplicaciondeEscuelaWilfrido.xml"); //
		//ClassPathXmlApplicationContext es un objeto en donde por definicion se pone 
		//el archivo xml donde va leer la configuracion
		
		acercaDeLasMaterias materia = context.getBean("materiaEspaniol", acercaDeLasMaterias.class);
		//buscara la clase que conetenga dentro, en este caso es de materiaEspaniol por lo que 
		//si se cambia buscara la clase del spring
		
	
		System.out.println(materia.vistoEnClase());
		//va imprimir lo que diga la materia y ejecuta lo que se vioEnClase

		
		System.out.println(materia.getDailyFortune());
		//yama ala metodo de getDailyFortune 
		
		// close the context
		context.close();	
	}

}


