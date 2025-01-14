package com.sist.dao;
import java.util.*;
import java.sql.*;
public class EmpDeptDAO {
	private Connection conn;
	private PreparedStatement  ps;
		private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
		private static EmpDeptDAO dao;
		
		public EmpDeptDAO()
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		public static EmpDeptDAO newInstance()
		{
			if(dao==null)
				dao=new EmpDeptDAO();
			return dao;
		}
		public void getconnection()
		{
			try
			{
				conn=DriverManager.getConnection(URL,"hr","happy");
			}catch(Exception ex) {}
		}
		public void disconnection()
		{
			try
			{
				if(ps!=null) ps.close();
				if(conn!=null)conn.close();
			}catch(Exception ex) {}
		}
		
		public void sqlexecute()
		{
			try
			{
				getconnection();
				String sql="select empno,ename,job,hiredate,sal,rank,dname,loc,grade"
						+ " from (select empno,ename,job,hiredate,sal,"
						+ "	Rank() over(order by sal desc) rank, dname,loc,grade"
						+ "	from emp,dept,salgrade"
						+ "	where emp.deptno=dept.deptno "
						+ "	and sal between losal and hisal)";
				ps=conn.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					System.out.println(
							rs.getInt(1)+" "
							+rs.getString(2)+" "
							+rs.getString(3)+" "
							+rs.getDate(4).toString()+" "
							+rs.getInt(5)+" "
							+rs.getInt(6)+" "
							+rs.getString(7)+" "
							+rs.getString(8)+" "
							+rs.getInt(9)
							);
					
				}
				rs.close();
			}catch(Exception ex) 
			{
				ex.printStackTrace();
			}
			finally
			{
				disconnection();
			}
		}
		public void viewexecute()
		{
			try
			{
				getconnection();
				String sql="select * from empAllData";
				ps=conn.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					System.out.println(
							rs.getInt(1)+" "
							+rs.getString(2)+" "
							+rs.getString(3)+" "
							+rs.getDate(4).toString()+" "
							+rs.getInt(5)+" "
							+rs.getInt(6)+" "
							+rs.getString(7)+" "
							+rs.getString(8)+" "
							+rs.getInt(9)
							);
					
				}
				rs.close();
			}catch(Exception ex) 
			{
				ex.printStackTrace();
			}
			finally
			{
				disconnection();
			}
		}
}
