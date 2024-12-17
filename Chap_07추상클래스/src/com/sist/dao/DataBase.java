package com.sist.dao;
import java.sql.*;
public abstract class DataBase {
	//기능설정
	// => 같은 기능 => 구현
	public void driverConfig()
	{	
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
		
	}
	public Connection getConnection()
	{
		Connection conn=null;
		try
		{	String url="jdbc:oracle:thin:@localhost:1521:XE";
			conn=DriverManager.getConnection(url,"hr","happy");
		}catch (Exception ex) {}
		return conn;
	}
	// => 기능은 같으나 구현해야하는 내용이 다른 경우 => 미구현
	public abstract void listPrint();
	public abstract void findPrint();
	
}
