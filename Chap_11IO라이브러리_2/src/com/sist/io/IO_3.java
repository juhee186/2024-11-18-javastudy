package com.sist.io;
// 파일제어 => 파일 읽기쓰기
//			----------Reader / Writer
import java.io.*;
import java.util.*;
public class IO_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileWriter
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("c:\\java_data\\sawon.txt",true);
			// true => append모드 (이어서 저장 가능)
			// sawon.txt 파일이 없는 경우 자동 생성
			fw.write("3|박문수|영업부|부산|3000\r\n");
			System.out.println("등록완료");
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}catch(Exception ex) {}
		}

	}

}
