package com.sist.board;
import java.util.*;
import java.io.*;
public class BoardIOSetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectOutputStream oos=null;
		try
		{
			List<BoardVO>list=
					new ArrayList<BoardVO>();
			FileOutputStream fos=
					new FileOutputStream("c:\\java_data\\board.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(list);
			System.out.println("파일에 저장공간 생성");
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}

		finally
		{
			try
			{
				oos.close();
			}catch (Exception ex) {}
			
		}
	}

}
