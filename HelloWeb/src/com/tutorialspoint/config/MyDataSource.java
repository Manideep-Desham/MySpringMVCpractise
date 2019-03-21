package com.tutorialspoint.config;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDataSource {
	public Connection getMyConnection() 
			throws ClassNotFoundException, SQLException
	
	{
		Class.forName("org.postgresql.Driver");

		Connection c = null;

		c = DriverManager.getConnection(
				"jdbc:postgresql://127.0.0.1:5432/contactApp", "manideepd",
				"Maniword9!@dec");

		return c ;
		
		
	}
	public ResultSet getResultSet(Connection c, String query) throws SQLException
	{
		Statement stmt = c.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		return rs;
		
	}

}
