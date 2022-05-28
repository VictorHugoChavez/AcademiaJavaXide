package com.ejercicio.rest;

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

import com.ejercicio.entity.Empleado;
import com.ejercicio.service.EmpleadoService;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {

	// autowire the EmpleadoService
	@Autowired
	private EmpleadoService empleados;
	
	// add mapping for GET /customers
	@GetMapping("/empleado")
	public List<Empleado> getEmpleado() {
		
		return empleados.getEmpleado();
		
	}
	
	// add mapping for GET /customers/{customerId}
	
	@GetMapping("/empleado/{empleadoId}")
	public Empleado getCustomer(@PathVariable int empleadoId) {
		
		Empleado empleadoCredencialId = empleados.getEmpleado(empleadoId);
		
		if (empleadoCredencialId == null) {
			throw new EmpleadoNotFoundException("Empleado no encontrado - " + empleadoId);
		}
		
		return empleadoCredencialId;
	}
	
	// add mapping for POST /customers  - add new customer
	
	@PostMapping("/empleado")
	public Empleado agregaEmpleado(@RequestBody Empleado empeladoNom) {
		
		// also just in case the pass an id in JSON ... set id to 0
		// this is force a save of new item ... instead of update
		
		empeladoNom.setId(0);
		
		empleados.guardarEmpleado(empeladoNom);
		
		return empeladoNom;
	}
	
	// add mapping for PUT /customers - update existing customer
	
	@PutMapping("/empleado")
	public Empleado cargaEmpleado(@RequestBody Empleado empleadoSubir) {
		
		empleados.guardarEmpleado(empleadoSubir);
		
		return empleadoSubir;
		
	}
	
	// add mapping for DELETE /customers/{customerId} - delete customer
	
	@DeleteMapping("/empleado/{empleadoId}")
	public String eleminarEmpleado(@PathVariable int empleadoId) {
		
		Empleado delEmpleado = empleados.getEmpleado(empleadoId);
		
		// throw exception if null
		
		if (delEmpleado == null) {
			throw new EmpleadoNotFoundException("Empleado no esta en la base de datos - " + empleadoId);
		}
				
		empleados.borrarEmpleado(empleadoId);
		
		return "Se elemino exitosamente el empleado con el ID - " + empleadoId;
	}
	
}


















