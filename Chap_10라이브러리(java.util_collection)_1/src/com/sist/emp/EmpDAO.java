package com.sist.emp;
import java.sql.*;
import java.util.*;

public class EmpDAO {
	private Connection conn;
	private PreparedStatement ps;
	
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	private static EmpDAO dao;
	
	public EmpDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}catch(Exception ex) {}
	}
	public static EmpDAO newInstance()
	{
		if(dao==null)
			dao=new EmpDAO();
		return dao;
	}
	
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
	}
	public void disConnection()
	{
		try
		{
			if(ps!=null)ps.close();
			if(conn!=null) conn.close();
			//exit
		}catch(Exception ex) {}
	}
	//검색
	public TreeSet<String> empGetNames()
	{
		TreeSet<String> set=new TreeSet<String>();
		try
		{
			getConnection();
			String sql="SELECT ename FROM emp";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				set.add(rs.getString("ename"));
				// 자바 => 0 시작
				// 오라클 => 1
			}
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return set;
	}
	//직위=>중복 => 중복제거
	public HashSet<String> empGetJobs()
	{
		HashSet<String> set=
				new HashSet<String>();
		try
		{
			getConnection();
			String sql="SELECT job FROM emp";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				set.add(rs.getString(1));
			}
			rs.close();
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return set;
	}
	//사원의 모든 정보
	

}
