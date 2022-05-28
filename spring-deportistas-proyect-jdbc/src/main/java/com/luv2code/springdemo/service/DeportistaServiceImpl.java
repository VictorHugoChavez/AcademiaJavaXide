package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.DeportistasDAO;
import com.luv2code.springdemo.entity.Deportistas;

@Service
public class DeportistaServiceImpl implements DeportistaService {

	// need to inject customer dao
	@Autowired
	@Qualifier("deportistasDAOjdbcImpl")
	private DeportistasDAO jugadorDAO;
	
	@Override
	@Transactional
	public List<Deportistas> getDeportista() {
		return jugadorDAO.getDeportistas();
	}

	@Override
	@Transactional
	public void saveDeportista(Deportistas jugador) {

		jugadorDAO.saveDeportistas(jugador);
	}

	@Override
	@Transactional
	public Deportistas getDeportista(int theId) {
		
		return jugadorDAO.getDeportistas(theId);
	}

	@Override
	@Transactional
	public void deleteDeportista(int theId) {
		
		jugadorDAO.deleteDeportistas(theId);
	}
}





