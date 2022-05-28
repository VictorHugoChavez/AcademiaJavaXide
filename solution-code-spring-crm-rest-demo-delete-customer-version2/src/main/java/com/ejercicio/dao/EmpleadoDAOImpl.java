package com.ejercicio.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ejercicio.entity.Empleado;

@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Empleado> getEmpleados() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query<Empleado> theQuery = 
				currentSession.createQuery("from Empleado order by nombreCompleto",
											Empleado.class);
		
		// execute query and get result list
		List<Empleado> empleado = theQuery.getResultList();
				
		// return the results		
		return empleado;
	}

	@Override
	public void guardarEmpleado(Empleado empleado) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(empleado);
		
	}

	@Override
	public Empleado getEmpleado(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Empleado theCustomer = currentSession.get(Empleado.class, theId);
		
		return theCustomer;
	}

	@Override
	public void borrarEmpleado(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Empleado where id=:customerId");
		theQuery.setParameter("customerId", theId);
		
		theQuery.executeUpdate();		
	}

}











