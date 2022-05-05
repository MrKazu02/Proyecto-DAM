package bettertype;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
    protected Connection conexion = null;
    protected Statement stmt = null;

	public Connection conectar() {
		
		final String URL = "jdbc:sqlite:./database/bettertype.db";
		
		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection(URL);	
			System.out.println("Conectado a la base de datos");
			stmt = conexion.createStatement();
			String sql = "CREATE TABLE puntos" + "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
												 "puntuacion INTEGER NOT NULL)";
			stmt.executeUpdate(sql);
			stmt.close();
			conexion.close();
			
		} catch(SQLException e) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		
		System.out.println("Table created successfully");
		
		return conexion;		
	}

}
