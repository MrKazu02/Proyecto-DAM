package bettertype;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
    protected Connection conexion;
    protected Statement stmt;
    protected String URL = "jdbc:sqlite:src/database/bettertype.db";
    
	public Database() {
	
		Connection conexion = null;
		
		try {
			this.conexion = DriverManager.getConnection(URL);	
			if (this.conexion != null) {
			 System.out.println("Se ha conectado a la base de datos");
			}
			
		} catch(SQLException e) {
			conexion = null;
			System.out.println("Desconectado de la base de datos");
		}
				
	}
	
	public int consultaPuntos() throws SQLException {
		
			Statement stmt = this.conexion.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT puntuacion FROM puntos WHERE puntuacion = (SELECT MAX(puntuacion) FROM puntos)");
			int puntos = 0;
			while (rs.next()) {
				int puntuacion = rs.getInt("puntuacion");
				puntos = puntuacion;
			}
			rs.close();
			stmt.close();
			

		return puntos;	
	}
	
	public void agregaPuntos(int puntos) {
		
		PreparedStatement stmt = null;
		try {
			stmt = (PreparedStatement) conexion.prepareStatement("INSERT INTO puntos (puntuacion) VALUES ("+puntos+")");
			stmt.execute();
			stmt.close();
		}catch (SQLException sqle) {
			System.out.println("Error");
		}
	}
	
	public void apagarDb() {
		if(conexion != null) {
			conexion = null;
			System.out.println("Se apagó la DB");
	}
	}
}
