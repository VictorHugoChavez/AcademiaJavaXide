package com.ejercicio.dao;

import java.util.List;

import com.ejercicio.entity.Empleado;

public interface EmpleadoDAO {

	public List<Empleado> getEmpleados();

	public void guardarEmpleado(Empleado elEmpleado);

	public Empleado getEmpleado(int theId);

	public void borrarEmpleado(int theId);
	
}
