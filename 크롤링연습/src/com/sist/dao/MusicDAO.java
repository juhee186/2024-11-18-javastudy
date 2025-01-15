package com.sist.dao;
import java.util.*;
import java.sql.*;
import com.sist.vo.*;
public class MusicDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	private static MusicDAO dao;
	// genie / melon
	public MusicDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	public static MusicDAO newmInstance()
	{
		if(dao==null)
			dao=new MusicDAO();
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
			if(ps!=null)ps.close();
			if(conn!=null)conn.close();
		}catch(Exception ex) {}
	}
	public void genieMusicInsert(MusicVO vo)
	{
		try
		{
			getconnection();
			String sql="insert into genie_music "
					+"values((select nvl(max(mno)+1,1) from genie_music),"
					+ "?,?,?,?,?,?,?,?,0)";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, vo.getCno());
			ps.setString(2, vo.getTitle());
			ps.setString(3, vo.getSinger());
			ps.setString(4, vo.getAlbum());
			ps.setString(5, vo.getPoster());
			ps.setInt(6, vo.getIdcrement());
			ps.setString(7, vo.getState());
			ps.setString(8, vo.getKey());
			ps.executeUpdate();
			
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
