package com.examEjercicio.equipo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.examEjercicio.equipo.entity.Deportistas;

@Repository
public class DeportistaDAOImpl implements DeportistaDAO {

	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Deportistas> getDeportista() {
		

		Session currentSession = sessionFactory.getCurrentSession();

		Query<Deportistas> theQuery = 
				currentSession.createQuery("from Deportistas order by apellido_paterno",
											Deportistas.class);
		//este seleccionara mi tabla de deportistas ordenando por apellido_paterno
		List<Deportistas> jugador = theQuery.getResultList();
				
		
		return jugador;
	}

	@Override
	public void guardarDeportista(Deportistas jugador) {


		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(jugador);
		
	}

	@Override
	public Deportistas getDeportista(int id) {

		Session currentSession = sessionFactory.getCurrentSession();

		Deportistas jugador = currentSession.get(Deportistas.class, id);
		
		return jugador;
	}

	@Override
	public void borrarDeportista(int id) {


		Session currentSession = sessionFactory.getCurrentSession();
		

		Query theQuery = 
				currentSession.createQuery("delete from Deportistas where id=:customerId");
		theQuery.setParameter("customerId", id);
		
		theQuery.executeUpdate();		
	}

}











