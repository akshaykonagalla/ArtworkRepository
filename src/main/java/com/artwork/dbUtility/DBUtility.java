package com.artwork.dbUtility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility 
{
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/art_work","root","root"); 
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;	
	}
  
}
