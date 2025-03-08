package br.edu.ifgoiano.javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	public Connection c = null;
	
	public Connection connect() throws SQLException, Exception{
		//Class.forName("org.postgresql.Driver");
		c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/camara", "postgres", "postgres");
		return c;
	}
	
	public void close() throws SQLException, Exception{
		c.close();
	}

}
