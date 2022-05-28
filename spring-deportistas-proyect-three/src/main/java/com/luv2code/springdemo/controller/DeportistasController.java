package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Deportistas;
import com.luv2code.springdemo.service.DeportistaService;

@Controller
@RequestMapping("/jugador")
public class DeportistasController {

	// need to inject our customer service
	@Autowired
	private DeportistaService JugadorService;
	
	@GetMapping("/listas")
	public String listaJugadores(Model modelo) {
		
		// get customers from the service
		List<Deportistas> jugadores = JugadorService.getDeportista();
				
		// add the customers to the model
		modelo.addAttribute("jugadores", jugadores);
		return "lista-jugadores";
	}
	
	@GetMapping("/mostrarFormulario")
	public String mostrarFormularioAgregar(Model modelo) {
		
		// create model attribute to bind form data
		Deportistas jugador = new Deportistas();
		
		modelo.addAttribute("jugador", jugador);
		
		return "formulario-jugador";
	}
	
	@PostMapping("/guardarJugador")
	public String guardarJugador(@ModelAttribute("jugador") Deportistas jugador) {
		
		// save the customer using our service
		JugadorService.saveDeportista(jugador);	
		
		return "redirect:/jugador/listas";
	}
	
	@GetMapping("/actualizarJugador")
	public String actualizarJugador(@RequestParam("jugadorId") int identificacion,
									Model modelo) {
		
		// get the customer from our service
		Deportistas jugador = JugadorService.getDeportista(identificacion);	
		
		// set customer as a model attribute to pre-populate the form
		modelo.addAttribute("jugador", jugador);
		
		// send over to our form		
		return "formulario-jugador";
	}
	
	@GetMapping("/eliminar")
	public String eliminarJugador(@RequestParam("jugadorId") int identificacion) {
		
		// delete the customer
		JugadorService.deleteDeportista(identificacion);
		
		return "redirect:/jugador/listas";
	}
}










