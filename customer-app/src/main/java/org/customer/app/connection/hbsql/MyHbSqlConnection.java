package org.customer.app.connection.hbsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyHbSqlConnection {
	
	private static Connection connection=null;
	
	private MyHbSqlConnection() throws SQLException
	{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Passw0rd@1234");
	}
	
	public static Connection getMyConnection() throws SQLException
	{
		if(connection==null)
		{
			new MyHbSqlConnection();
		}
		return connection;
	}

}
