package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Deportistas;

@Repository
public class DeportistasDAOImpl implements DeportistasDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sesionDeFabrica;
			
	@Override
	public List<Deportistas> getDeportistas() {
		
		// get the current hibernate session
		Session currentSession = sesionDeFabrica.getCurrentSession();
				
		// create a query  ... sort by last name
		Query<Deportistas> theQuery = 
				currentSession.createQuery("from Deportistas order by nombre_Deportista",
											Deportistas.class);
		
		// execute query and get result list
		List<Deportistas> jugadores = theQuery.getResultList();
				
		// return the results		
		return jugadores;
	}

	@Override
	public void saveDeportistas(Deportistas jugador) {

		// get current hibernate session
		Session currentSession = sesionDeFabrica.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(jugador);
		
	}

	@Override
	public Deportistas getDeportistas(int theId) {

		// get the current hibernate session
		Session currentSession = sesionDeFabrica.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Deportistas jugador = currentSession.get(Deportistas.class, theId);
		
		return jugador;
	}

	@Override
	public void deleteDeportistas(int theId) {

		// get the current hibernate session
		Session currentSession = sesionDeFabrica.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Deportistas where id=:customerId");
		theQuery.setParameter("customerId", theId);
		
		theQuery.executeUpdate();		
	}

}











