package com.luv2code.springdemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOjdbcImpl implements CustomerDAO {

	// setup connection variables
	String user = "springstudent";
	String pass = "springstudent";

	String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
	String driver = "com.mysql.jdbc.Driver";

	@Override
	public List<Customer> getCustomers() {
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		List<Customer> listaClientes = new ArrayList<>();
		
		// get connection to database
		try {
						
			Class.forName(driver);
			
			myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			// create sql statement
			String sql = "select * from customer";
			
			myStmt = myConn.createStatement();
			
			// execute query
			myRs = myStmt.executeQuery(sql);
			
			// process result set
			while (myRs.next()) {
							
				// retrieve data from result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");
							
				// create new student object
				Customer tempCustomer = new Customer(id, firstName, lastName, email);
							
				// add it to the list of students
				listaClientes.add(tempCustomer);				
			}
						
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return listaClientes;

	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// get db connection
			Class.forName(driver);
			
			myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			String sql;
			
			if (theCustomer.getId() == 0) {
				System.out.println("**Save customer JDBC");

				// create sql for insert
				sql = "insert into customer "
						   + "(first_name, last_name, email) "
						   + "values (?, ?, ?)";
			}else {
				System.out.println("**Update customer JDBC");

				// create SQL update statement
				sql = "update customer "
							+ "set first_name=?, last_name=?, email=? "
							+ "where id=?";
			}
			myStmt = myConn.prepareStatement(sql);
			
			// set the param values for the student
			myStmt.setString(1, theCustomer.getFirstName());
			myStmt.setString(2, theCustomer.getLastName());
			myStmt.setString(3, theCustomer.getEmail());
			
			if (theCustomer.getId() != 0)
				myStmt.setInt(4, theCustomer.getId());
			
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
	public Customer getCustomer(int theId){
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
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");
				
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
	public void deleteCustomer(int theId) {
		

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
