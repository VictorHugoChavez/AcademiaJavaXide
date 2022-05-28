package peticiones.mensajes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensaje")  // es la direccion de las peticiones
public class peticionesRestController {

	// add code for the "/hello" endpoint
	
	@GetMapping("/hello") // puede haber varios getmapping porque la peticiones pueden ser
	public String sayHello() { // difernetes ademas cada uno hace diferentes acciones
		return "Hola Academy Xideral aprendiendo hacer un servicio Rest!";
	}
	@GetMapping("/despedia") // esto es para realizar una peticion desde el cliente y ver lo que esta pasando
	public String despedida() {   //en este caso envia un mensaje, peude ser resultados
		return "Fue un placer aver pertenecido en el bootcamp LaunchX de innovacion Virtual";
	}
	@GetMapping("/travesia") // esto es para realizar una peticion desde el cliente y ver lo que esta pasando
	public String travesia() {   //en este caso envia un mensaje, peude ser resultados
		return "Durante el bootcamp realice actiivdades FrontEnd y BackEnd aprendiendo con los Mision Comander";
	}
	
	
}
