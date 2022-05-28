package v7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal2 {

	public static void main(String[] args) {
		try (Connection conn = getConnection(); 
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from empleado")) { //se nesesitan implementar el autocroseibal
		    // ejecuta consulta
		    // cierra rs, stmt, conn
		    // interta en pojos
		} catch (Exception e) { 
		    // maneja cualquier exception
		} 
	}

	static Connection getConnection() {
		return null;
	}
}
