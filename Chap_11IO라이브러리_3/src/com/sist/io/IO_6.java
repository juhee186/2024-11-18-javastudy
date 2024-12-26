package com.sist.io;
// fileinputstream => reader 변경
import java.io.*;
public class IO_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis=
					new FileInputStream("c:\\javadev\\seoul_nature.txt");
			BufferedReader br
			=new BufferedReader(new InputStreamReader(fis));
			int i=0;
//			while((i=br.read())!=-1)
//			{
//				System.out.print((char)i);
//			}
			while(true)
			{
				String msg=br.readLine();
				if(msg==null) break;
				System.out.println(msg);
			}
			fis.close();
			
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
