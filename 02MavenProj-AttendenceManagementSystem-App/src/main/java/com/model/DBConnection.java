package com.model;

import java.sql.Connection;
import static com.model.DBInfo.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	public static Connection con = null;
	
	private DBConnection() {}
	
	static
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			con = DriverManager.getConnection(dbUrl, uName, pWord);
		}
		catch(ClassNotFoundException | SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	public static Connection getInstance()
	{
		return con;
	}
}
