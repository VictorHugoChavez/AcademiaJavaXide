package com.ejercicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejercicio.dao.EmpleadoDAO;
import com.ejercicio.entity.Empleado;

@Service
public class EmpleadoServiceImplementar implements EmpleadoService {

	// need to inject customer dao
	@Autowired
	private EmpleadoDAO empleadoDAO;
	
	@Override
	@Transactional
	public List<Empleado> getEmpleado() {
		return empleadoDAO.getEmpleados();
	}

	@Override
	@Transactional
	public void guardarEmpleado(Empleado elEmpleado) {

		empleadoDAO.guardarEmpleado(elEmpleado);
	}

	@Override
	@Transactional
	public Empleado getEmpleado(int theId) {
		
		return empleadoDAO.getEmpleado(theId);
	}

	@Override
	@Transactional
	public void borrarEmpleado(int theId) {
		
		empleadoDAO.borrarEmpleado(theId);
	}
}





