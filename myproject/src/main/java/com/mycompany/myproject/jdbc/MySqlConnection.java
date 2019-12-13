package com.mycompany.myproject.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	
	private static Connection connection=null;
	
	private MySqlConnection() throws SQLException
	{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Passw0rd@1234");
	}
	
	public static Connection getMyConnection() throws SQLException
	{
		if(connection==null)
		{
			new MySqlConnection();
		}
		return connection;
	}

}
