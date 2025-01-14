package com.sist.dao;
import java.util.*;
import com.sist.vo.*;
import java.sql.*;
// 로그인처리 => count
// 회원가입
public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	private static MemberDAO dao;
	
	public MemberDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
		public static MemberDAO newInstance()
		{
			if(dao==null)
				dao=new MemberDAO();
			return dao;
		}
		public void getConnection()
		{
			try
			{
				conn=DriverManager.getConnection(URL,"hr","happy");
			}catch (Exception ex) {}
		}
		public void disConnection()
		{
			try
			{
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
			}catch(Exception ex) {}
		}
	public MemberVO isLogin(String id,String pwd)
	{
		MemberVO vo=new MemberVO();
		try
		{
			getConnection();
			String sql="SELECT COUNT(*) FROM member WHERE id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			rs.next();
			int count=rs.getInt(1);
			rs.close();
			
			if(count==0)
			{
				vo.setMsg("NOID");
			}
			else
			{
				sql="SELECT pwd,name,sex,address FROM member WHERE id=?";
				ps=conn.prepareStatement(sql);
				ps.setString(1, id);
				rs=ps.executeQuery();
				rs.next();
				String db_pwd=rs.getString(1);
				String name=rs.getString(2);
				String sex=rs.getString(3);
				String address=rs.getString(4);
				rs.close();
				
				if(db_pwd.equals(pwd))
				{
					vo.setMsg("OK");
					vo.setName(name);
					vo.setSex(sex);
					vo.setAddress(address);
				}
				else
				{
					vo.setMsg("NOPWD");
				}
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return vo;
	}
}
