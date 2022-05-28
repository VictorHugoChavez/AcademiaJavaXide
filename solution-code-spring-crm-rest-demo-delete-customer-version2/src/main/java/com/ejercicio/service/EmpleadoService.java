package com.ejercicio.service;

import java.util.List;

import com.ejercicio.entity.Empleado;

public interface EmpleadoService {

	public List<Empleado> getEmpleado();

	public void guardarEmpleado(Empleado theCustomer);

	public Empleado getEmpleado(int theId);

	public void borrarEmpleado(int theId);
	
}
