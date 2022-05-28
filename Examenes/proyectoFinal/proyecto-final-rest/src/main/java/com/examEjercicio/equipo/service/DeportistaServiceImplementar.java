package com.examEjercicio.equipo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examEjercicio.equipo.dao.DeportistaDAO;
import com.examEjercicio.equipo.entity.Deportistas;

@Service
public class DeportistaServiceImplementar implements DeportistaService {
	//Se implementa lo que dice DeportistaService ya aqui es donde nos encargamos de la logica de negocio
	//@Transactional quiere decir que todas las operaciones se deben ejecutar al mismo tiempo o nnguna
	
	@Autowired  ///realizamos la iyeccion de depencias 
	@Qualifier("deportistaDAOjdbcImpl")// indicamos que se va inyectar por medio del archivo que nosotros le indiquemos por jdbc
	private DeportistaDAO deportistaDAO;
	
	@Override
	@Transactional
	public List<Deportistas> getDeportista() {
		return deportistaDAO.getDeportista();
	}

	@Override
	@Transactional
	public void guardarDeportista(Deportistas jugador) {

		deportistaDAO.guardarDeportista(jugador);
	}

	@Override
	@Transactional
	public Deportistas getDeportista(int id) {
		
		return deportistaDAO.getDeportista(id);
	}

	@Override
	@Transactional
	public void borrarDeportista(int id) {
		
		deportistaDAO.borrarDeportista(id);
	}
}





