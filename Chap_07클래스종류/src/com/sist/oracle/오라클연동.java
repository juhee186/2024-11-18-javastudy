package com.sist.oracle;
import java.sql.*;
public class 오라클연동 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//드라이브 설정
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		Connection conn=DriverManager.getConnection(url,"hr","happy");
		
		String sql="SELECT * FROM emp";
		PreparedStatement ps=conn.prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println(
					rs.getInt(1)+" "+
					rs.getString(2)+ " "+
					rs.getString(3)+ " "
					);
		}
	}

}
