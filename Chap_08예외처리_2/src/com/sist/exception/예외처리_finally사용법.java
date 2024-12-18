package com.sist.exception;
// try~catch~finally
//			 -------생략가능
// 사용처 => 파일닫기, 오라클 연결해제, 서버연결 해제
// try(정상수행) catch(오류발생) 상관없이 무조건 수행
import java.io.*;
/*
 *  FileReader fr=new FileReader()
 *  
 */
public class 예외처리_finally사용법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FileReader fr=null; //메모리 주소 배정전
//		try
//		{
//			fr=new FileReader("C:\\javadev\\seoul_nature.txt");
//			int i=0; // 한글자씩 읽어온다
//			// 정수형으로 'A' => 65
//			while((i=fr.read())!=-1)
//			{
//					// -1 => EOF
//				System.out.print((char)i);
//			}
//		}catch(IOException e)
//		{
//			e.printStackTrace(); //에러확
//		}
//		finally
//		{	//무조건 파일 닫기
//			try
//			{
//				fr.close();
//			}catch(IOException e)
//			{
//				
//			}
//		}
		// 자동 => 리소스
		try(FileReader fr=new FileReader("C:\\javadev\\seoul_nature.txt"))
		{
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			//자동으로 파일 닫기가 가능
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
