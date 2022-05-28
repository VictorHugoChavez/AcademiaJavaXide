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
public class DeportistaDAOjdbcImpl implements DeportistaDAO { //se implmenta la interfaz implemnetando sus metodos para implemnetar jdbc

	//este archivo viene con relacion a lo JDBC
	String user = "springstudent"; //se declara el usuario de nuestra bases de datos
	String pass = "springstudent"; // se declara la contraseña de nuestra base de datos para obtner crear base de datos y enlazarlos 

	String jdbcUrl = "jdbc:mysql://localhost:3306/deportistas?useSSL=false&serverTimezone=UTC"; // se conecta  a la base de datos con nuestro schema llamado deportistas 
	String driver = "com.mysql.jdbc.Driver"; // se define el driver 

	@Override
	public List<Deportistas> getDeportista() {
		
		Connection myConn = null; // son variables realcionadas con mi base de datos de la interfaz java.sql.connection
		Statement myStmt = null;	//la variable de referencia que no apunta pero es de la interfaz java.sql.statement
		ResultSet myRs = null;	// la variable de referencia que no apunta pero es de la interfaz java.sql.ResultSet
		
		//las tres variables tenene en relacion a Sql, base de datos 
		
		List<Deportistas> jugadores = new ArrayList<>(); // se crea una arraylist generic Deportistas (donde solo acepta los objetos de Deportistas) creando un objeto ArrayList
		try { // se declara la excpecion para cuando se ejecuta va probar ejecutar el programa en caso contrario se lanza las excepciones y se informa el motivo
						
			Class.forName(driver);// se conecta a mi driver
			
			myConn = DriverManager.getConnection(jdbcUrl, user, pass); //realiza la conexion a la base de datos con los valores jdbcUrl,user,pass como parametros
			// estos parametros lo piden mi getConeccion de mi clase drivermanager
			
			// crea y seleccionoa mi schema y la tabla llamada deportistas_info 
			String sql = "select * from deportistas_info";
			
			myStmt = myConn.createStatement(); //realiza la 
			
			// execute query
			myRs = myStmt.executeQuery(sql);
			
			// procesa el resultado de set
			while (myRs.next()) {
							
				//todas estas variables de referencia tienen que ver con la base de datos en particular las columnas donde se definen el tipo el nombre de la variable
				// y utilizando desde de mi clase myRs obtengo la informacion, esto va dependiendo del tipo de la variable por lo que si estan definidos
				// en la base de datos debe declararse igual dentro (getString,getInt,getBoolean....)
				int id = myRs.getInt("id");
				String nombreDeportista = myRs.getString("nombre_Deportista");
				String apellidoPaterno = myRs.getString("apellido_paterno");
				String correo = myRs.getString("correo");
				int edad = myRs.getInt("edad");
				boolean profesional=myRs.getBoolean("profesional");
				
							
				//Se crea un nuevo objeto Deportistas llamado jugador, teniendo como parametros de las variables de referencia anteriores de la base de datos 
				Deportistas jugador = new Deportistas(id,nombreDeportista,apellidoPaterno,correo,edad,profesional);
							
				//adjunta lo que contenga jugador a mi mi array lista definido anteriormenete
				jugadores.add(jugador);				
			}
						
			
		}
		catch (Exception exc) { // este es mi excepcion por loq ue en caso de haya un error nos dara excepcion relacionada en este caso de base de datos
			// puede tener otras excpeciones pero se definio que imprimiera cualquier excepcion
			exc.printStackTrace();
		}finally {
			// cierra los objetos de mi JDBC
			close(myConn, myStmt, myRs);
		}
		return jugadores; //regresa jugadores de mi metodo public List<Deportistas> getDeportista()

	}

	@Override
	public void guardarDeportista(Deportistas jugador) {//se realiza el metodo guardarDeportista, esta es proveniente de mi  interfaz DeportistaDao
		Connection myConn = null; //se crea un avariable de referencia de Coneccion llamada myCon, esta es una clase de java
		PreparedStatement myStmt = null; //se crea una variable de referencia de PreparedStatement que no esta puntando a null
		
		try { // se le indica prueba y si hay un error va arrojar una exception, mostrando cual fue la excpetion que se muestra en la pantalla
	
			Class.forName(driver);//
			
			myConn = DriverManager.getConnection(jdbcUrl, user, pass);// realiza la conexion trayendo con el mismo la informacion para conectarse a la base de datos, como
			// la informacion de donde se va conectar a la base de datos, el usuario y password
			
			String sql;// se declara un avariable de referencia llamada sql
			
			if (jugador.getId() == 0) {  //se indica que si nuestro jugador de nuestra variable de referencia  del metodo es igual a cero va guardar los
				//parametros de nombre deportista,apelido paterno, correo, profesional, edad
				System.out.println("**SALVANDO jugadores DE  JDBC ..............."); //se imprime en consola la informacion de salvado jugadores

				// creamos el comando de SQL  indicando que se ingrese los deporstista_info los datos
				sql = "insert into deportistas_info "
						   + "(nombre_Deportista, apellido_paterno, correo, edad, profesional) "
						   + "values (?, ?, ?, ?, ?)";
			}else{ // en caso contario solo se va realizar un update, es decir una actualizacion de los datos de mi base de datos
				System.out.println("**ACTUALIZACION jugadores JDBC"); 
				// create SQL update statement
				sql = "UPDATE deportistas_info " // S indica a travez de los comando de mysql que actualice la informacion de mi id que s ele indique
							+ "SET nombre_Deportista=?, apellido_paterno=?, correo=?, edad=?, profesional=? "+ "where id=?";
				
			}
			myStmt = myConn.prepareStatement(sql); //se trae la informacion de mi if dependiendo el caso si obtuvo el get Id sea igual a 0 o sea diferente a 0
			
			// establec los valores valores que se obtuvieron de nuestro parametro de deportista
			myStmt.setString(1, jugador.getNombreDeportista()); // se obtien la informacion del nombre deprotista
			myStmt.setString(2, jugador.getApellidoPaterno()); // se obtien la informacion de apellido paterno
			myStmt.setString(3, jugador.getCorreo()); //  // se obtien la informacion del correo
			myStmt.setInt(4, jugador.getEdad());  // se obtien la informacion de la edad
			myStmt.setBoolean(5, jugador.getProfesional());  // se obtien la informacion del nombre de profesional
			
			
			if (jugador.getId() != 0) // se indica que si getid es diferente a 0 se debe obtener el valor del id
				myStmt.setInt(6, jugador.getId());
			
			// executa el comando de sql en caso de que sea igual a 0 insertandolo
			myStmt.execute();
		} catch (Exception e) { // se indicia que en caos de que haya una excepcion se nos muestre en consola que expecion nos arroja
			e.printStackTrace(); // imprime la excepcion que cacho 
		}
		finally {
			//limpia la actualizacion de mi JDBC y por ultimo los cierra
			close(myConn, myStmt, null);
		}
	}

	@Override
	public Deportistas getDeportista(int id){
		System.out.println("*****************PASO POR OBTENER DEPORTISTA JDBC*****************");

		Deportistas jugador = null;  // se crea un avariable de referencia llamado jugador que no apunta a null
		
		Connection myConn = null; // son variables realcionadas con mi base de datos de la interfaz java.sql.connection
		PreparedStatement myStmt = null; //la variable de referencia que no apunta pero es de la interfaz java.sql.statement
		ResultSet myRs = null; // la variable de referencia que no apunta pero es de la interfaz java.sql.ResultSet
		
		try { // se le indica que prueba realiza el codigo pero en caso de haya un erro no los muestre atravez de las excepciones
			
			// lee la conexion de nuestra base de datos
			Class.forName(driver);
			
			myConn = DriverManager.getConnection(jdbcUrl, user, pass); // realiza la conexion a Mysql con la url, usuario y paswrod que nosotrso definimos
			
			// crea el archivo de los coamndos donde se ejecuta indicando que selecione mi tabla de deportistas_info  donde mi id es que obtendra
			String sql = "select * from deportistas_info where id=?";
			
			myStmt = myConn.prepareStatement(sql);
			
			myStmt.setInt(1, id);
			
			myRs = myStmt.executeQuery();
			
			// retrieve data from result set row
			if (myRs.next()) {
				String nombreDeportista = myRs.getString("nombre_Deportista");
				String apellidoPaterno = myRs.getString("apellido_paterno");
				String correo = myRs.getString("correo");
				int edad = myRs.getInt("edad");
				boolean profesional=myRs.getBoolean("profesional");
				// use the studentId during construction
				jugador = new Deportistas(id,nombreDeportista,apellidoPaterno,correo,edad,profesional);
			}				
			
			return jugador;
		} catch (Exception e) { // cacha la excepcion  en caso de que haya teneido algun porblema al ejecutarse
			e.printStackTrace(); //me muestra en consola la excepcion 
		}
		finally {
			// limpia el JDMC de mi objeto
			close(myConn, myStmt, myRs);
		}
		return null;
	}

	@Override
	public void borrarDeportista(int id) { //este es de mi interfaz donde indico que se borrar Deportista
		int idDeportista=id; // obtendo de mi variable local el valor de mi id y se lo asigno a mi idDeportista
		
		String sql="delete from deportistas_info where id=?"; // se crea un archivo de sql donde se le indica que atravez de los comando de sql se va eliminar 
		//buscando solo el id
		try (Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass); // realiza la conexion a la base de datos 
			PreparedStatement myStmt = myConn.prepareStatement(sql);) {
			myStmt.setInt(1, idDeportista);// el set Int indicamos el valor de uno y el segundo es valor que se desea eliminar de la base de datos

			myStmt.execute();//se ejecuta mi comado de sql para que eleimne la fila que deseada
		} catch (SQLException e) { // se cacha la excepcion en caso de que haya un error al momento de ejecutarse
			e.printStackTrace(); // imprime en consola la excepcin y el estado
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
