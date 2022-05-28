package com.examEjercicio.equipo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examEjercicio.equipo.entity.Deportistas;
import com.examEjercicio.equipo.service.DeportistaService;

@RestController
@RequestMapping("/equipo") //este es como se va mapear, se utiliza para indicar que todos van iniciar con lo que nosotros definamos al mapeo
public class DeportistaRestController {

	// autowire the DeportistaService
	@Autowired
	private DeportistaService jugador;
	
	///en este caso tenemos el get Mapping para en primera indicando que es un get y se esta mappenado con esto para consultar nuestra informacion
	 // en la base de datos por la peticion "http://localhost:8080/spring-crm-rest/equipo/jugador", en la base de datos por la peticion "http://localhost:8080/spring-crm-rest/equipo/jugador",
	//
	@GetMapping("/jugador")  
	public List<Deportistas> getDeportista() {   
		return jugador.getDeportista();
	}
	

	
	@GetMapping("/jugador/{jugadorId}")// en esta caso se mapea con el get pero en este caso particular esta indicando que para tener un un jugador en particular 
	public Deportistas getDeportista(@PathVariable int jugadorId) {  // se debe ingresas el jugador y un numero que este dentro de nuestra base de datos /jugador/2
																	// pero si nosotros ingresamos un valor que no se encuentre en la base de datos nos dara un exception 
		Deportistas jugadorCredencialId = jugador.getDeportista(jugadorId);// para en este caso por eso tenemos que nuestro variable de referencia "jugadorCredencialId"
		if (jugadorCredencialId == null) {									//tendra que  pasar por una condicion donde si la variable es igual null de nuestra base de datos tendra que crear
			throw new DeportistaNotFoundException("Deportistas no encontrado - " + jugadorId);// una excepcion e indicar que el jugador no fue encontrado 
		}
		
		return jugadorCredencialId; //pero si es encontrado en la base de datos, regresara el jugador de la id asignado
	}
	
	@PostMapping("/jugador")  /// Se crea un nuevo jugador atra vez de la peticion post con mapeo /jugador indicando que de esta forma se hara el post, pero esto lo realizara
	public Deportistas agregaDeportista(@RequestBody Deportistas jugadorNuevo) {// atra vez de una JSON, que en realidad las personas encragadas de hacerlo son los 		
		jugadorNuevo.setId(0);                                                   //front-end, para nosotrs realizamos el postman enviando la peticion en formato JSON
		jugador.guardarDeportista(jugadorNuevo);								//En este caso se crea un Id no existe y continuo a nuestra base de datos parea cargar una nueva informacion
		return jugadorNuevo;													//{ // se envia con todos lo sparametros
	}																			//"id": 9,
																				// "nombreDeportista": "Enesto",
																				// "apellidoPaterno": "Chavez",
																				// "correo": "Ernesto@mexico.com",
																				//"edad": 30,
    																			//"isprofesional": true
																				//}
	
	@PutMapping("/jugador")   	//para en este caso esta el put que significa actualizar, por lo que se hara por el mapeo /jugador, este nos ayuda mucho para corregir datos eerornes que tenemos en nuestra base de datos
	public Deportistas actualizarDeportista(@RequestBody Deportistas actualizacionJugador) { // el requesbody  indica que el parametro se enlazara al cuerpo de la solicitud web
		jugador.guardarDeportista(actualizacionJugador);
		return actualizacionJugador;
		
	}
	//por lo que este lo hara a travez del postman por medio del Json indicando el el id y los datos que se van a corregir y spring lo hara el ajuste y en la base de datos 
	// de vera reflejado
 //   "id": 9,
 //   "nombreDeportista": "Nayli",
 //   "apellidoPaterno": "Trejo",
 //   "correo": "Nayli@mexico.com",
 //   "edad": 23,
 //   "isprofesional": true
	
	
	@DeleteMapping("/jugador/{jugadorId}") // para el delete se realiza realiza el mismo caso que post, el mapero es con /jugador/id osea el numero del id que contiene
	public String eleminarJugador(@PathVariable int jugadorId) {//en nuestra base de datos http://localhost:8080/spring-crm-rest/equipo/jugador/4 por lo que la peticion se eliminara el datos con ese Id
		Deportistas jugadores = jugador.getDeportista(jugadorId);
		if (jugadores == null) {
			throw new DeportistaNotFoundException("Deportistas no esta en la base de datos - " + jugadorId);
		}
				
		jugador.borrarDeportista(jugadorId);
		
		return "Se elemino exitosamente el jugador con el ID - " + jugadorId; //elimina el jugador en caso de que se encuentre el id en la base de datos, caso contrario realizara un excepcion diciendo que el deportista no esta en la base de datos
	}
	
	//GET,PUT tienen la misma forma para mapear pero lo unico que los diferencia son los verbos de get y put por lo que con eso inidicamos la accion que queremos que realice
	//POST, DELETE tienen la misma forma para mapear pero lo unico que los diferencia son los verbos de get y delet por lo que con eso inidicamos la accion que queremos que realice
	
}


















