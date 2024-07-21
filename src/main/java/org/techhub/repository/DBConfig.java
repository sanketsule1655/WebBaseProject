package org.techhub.repository;
import java.util.*;
import java.sql.*;
import java.io.*;
public class DBConfig 
{
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	private static DBConfig db=null;
	private DBConfig(String path)
	{
		try
		{
			FileInputStream fin = new FileInputStream(path);
			Properties p = new Properties();
			System.out.println(path);
			p.load(fin);
			String username = p.getProperty("db.username");
			String password = p.getProperty("db.password");
			String url = p.getProperty("db.url");
			String driverClassName = p.getProperty("db.driverClassName");
			Class.forName(driverClassName);
			conn = DriverManager.getConnection(url,username,password);
			if(conn!=null)
			{
				System.out.println("Database is Connected");
			}
			else
			{
				System.out.println("Database is not connected");
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is:"+ex);
		}
	}
	public static DBConfig getInstance(String path)
	{
		if(db==null)
		{
			db=new DBConfig(path);
		}
		return db;
	}
	public Connection getConnection()
	{
		return conn;
	}
	public PreparedStatement getPreparedStatement()
	{
		return stmt;
	}
	public ResultSet getResultSet()
	{
		return rs;
	}
}
