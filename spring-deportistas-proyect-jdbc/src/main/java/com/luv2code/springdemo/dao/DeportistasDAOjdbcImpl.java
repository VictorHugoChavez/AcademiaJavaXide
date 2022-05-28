package com.luv2code.springdemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Deportistas;

@Repository
public class DeportistasDAOjdbcImpl implements DeportistasDAO {

	// setup connection variables
	String user = "springstudent";
	String pass = "springstudent";

	String jdbcUrl = "jdbc:mysql://localhost:3306/deportistas?useSSL=false&serverTimezone=UTC";
	String driver = "com.mysql.jdbc.Driver";

	@Override
	public List<Deportistas> getDeportistas() {
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		List<Deportistas> listaJugadores = new ArrayList<>();
		
		// get connection to database
		try {
						
			Class.forName(driver);
			
			myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			// create sql statement
			String sql = "select * from deportistas_info";
			
			myStmt = myConn.createStatement();
			
			// execute query
			myRs = myStmt.executeQuery(sql);
			
			// process result set
			while (myRs.next()) {
							
				// retrieve data from result set row
				int id = myRs.getInt("id");
				String nombreCompleto = myRs.getString("nombre_Deportista");
				String apellidoPaterno = myRs.getString("apellido_paterno");
				String correo = myRs.getString("correo");
				String edadd=myRs.getString("edad");
				boolean profesional=myRs.getBoolean("profesional");
							
				// create new student object
				Deportistas jugador = new Deportistas(id,nombreCompleto,apellidoPaterno,correo,edadd,profesional);
							
				// add it to the list of students
				listaJugadores.add(jugador);				
			}
						
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return listaJugadores;

	}

	@Override
	public void saveDeportistas(Deportistas jugador) {
		// TODO Auto-generated method stub

	}

	@Override
	public Deportistas getDeportistas(int theId) {
		
		System.out.println("**PASO POR getCustomer JDBC");

		Customer theCustomer = null;
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
		try {
			
			// get connection to database
			Class.forName(driver);
			
			myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			// create sql to get selected student
			String sql = "select * from customer where id=?";
			
			// create prepared statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, theId);
			
			// execute statement
			myRs = myStmt.executeQuery();
			
			// retrieve data from result set row
			if (myRs.next()) {
				String nombreCompleto = myRs.getString("nombre_Deportista");
				String apellidoPaterno = myRs.getString("apellido_paterno");
				String correo = myRs.getString("correo");
				String edadd=myRs.getString("edad");
				boolean profesional=myRs.getBoolean("profesional");
				
				// use the studentId during construction
				theCustomer = new Customer(theId, firstName, lastName, email);
			}				
			
			return theCustomer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt, myRs);
		}
		return null;
	}
		

	@Override
	public void deleteDeportistas(int theId) {
		// TODO Auto-generated method stub

	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {

		try {
			if (myRs != null) {
				myRs.close();
			}

			if (myStmt != null) {
				myStmt.close();
			}

			if (myConn != null) {
				myConn.close(); // doesn't really close it ... just puts back in connection pool
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
