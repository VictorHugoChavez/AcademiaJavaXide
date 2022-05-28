package com.examEjercicio.equipo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.examEjercicio.equipo.entity.Deportistas;

@Repository
public class DeportistaDAOjdbcImpl implements DeportistaDAO {

	// setup connection variables
	String user = "springstudent";
	String pass = "springstudent";

	String jdbcUrl = "jdbc:mysql://localhost:3306/deportistas?useSSL=false&serverTimezone=UTC";
	String driver = "com.mysql.jdbc.Driver";

	@Override
	public List<Deportistas> getDeportista() {
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		List<Deportistas> jugadores = new ArrayList<>();
		
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
				String nombreDeportista = myRs.getString("nombre_Deportista");
				String apellidoPaterno = myRs.getString("apellido_paterno");
				String correo = myRs.getString("correo");
				int edad = myRs.getInt("edad");
				boolean profesional=myRs.getBoolean("profesional");
				
							
				// create new student object
				Deportistas jugador = new Deportistas(id,nombreDeportista,apellidoPaterno,correo,edad,profesional);
							
				// add it to the list of students
				jugadores.add(jugador);				
			}
						
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return jugadores;

	}

	@Override
	public void guardarDeportista(Deportistas jugador) {
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// get db connection
			Class.forName(driver);
			
			myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			String sql;
			
			if (jugador.getId() == 0) {
				System.out.println("**Save jugadores JDBC");

				// create sql for insert
				sql = "insert into deportistas_info "
						   + "(nombre_Deportista, apellido_paterno, correo, edad, profesional) "
						   + "values (?, ?, ?, ?, ?)";
			}else{
				System.out.println("**Update jugadores JDBC");
				// create SQL update statement
				sql = "UPDATE deportistas_info "
							+ "SET nombre_Deportista=?, apellido_paterno=?, correo=?, edad=?, profesional=? "+ "where id=?";
				
			}
			myStmt = myConn.prepareStatement(sql);
			
			// set the param values for the student
			myStmt.setString(1, jugador.getNombreDeportista());
			myStmt.setString(2, jugador.getApellidoPaterno());
			myStmt.setString(3, jugador.getCorreo());
			myStmt.setInt(4, jugador.getEdad());
			myStmt.setBoolean(5, jugador.getProfesional());
			
			
			if (jugador.getId() != 0)
				myStmt.setInt(6, jugador.getId());
			
			// execute sql insert
			myStmt.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt, null);
		}
	}

	@Override
	public Deportistas getDeportista(int id){
		System.out.println("**PASO POR getCustomer JDBC");

		Deportistas theCustomer = null;
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
		try {
			
			// get connection to database
			Class.forName(driver);
			
			myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			// create sql to get selected student
			String sql = "select * from deportistas_info where id=?";
			
			// create prepared statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, id);
			
			// execute statement
			myRs = myStmt.executeQuery();
			
			// retrieve data from result set row
			if (myRs.next()) {
				String nombreDeportista = myRs.getString("nombre_Deportista");
				String apellidoPaterno = myRs.getString("apellido_paterno");
				String correo = myRs.getString("correo");
				int edad = myRs.getInt("edad");
				boolean profesional=myRs.getBoolean("profesional");
				// use the studentId during construction
				theCustomer = new Deportistas(id,nombreDeportista,apellidoPaterno,correo,edad,profesional);
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
	public void borrarDeportista(int id) {
		int idDeportista=id;
		
		String sql="delete from deportistas_info where id=?";
		
		try (Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			PreparedStatement myStmt = myConn.prepareStatement(sql);) {
			myStmt.setInt(1, idDeportista);

			myStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

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
