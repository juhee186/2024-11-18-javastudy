package com.sist.io;
// 문자 단위 저장 => write(String s)
import java.io.*;
public class IO_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter fw=new FileWriter("c:\\java_data\\student.txt",true);
//			String msg="Hello java => IO\n";
//			fw.write(msg);
//			fw.close();
			String msg="HELLO";
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(msg);
			bw.close();
			System.out.println("저장완료");
		}catch(Exception ex) {ex.printStackTrace();}
	}

}
