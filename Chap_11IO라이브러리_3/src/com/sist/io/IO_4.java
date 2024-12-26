package com.sist.io;
// 파일출력 => fileoutputStream / filewriter
// 필터 => bufferedoutputstream / bufferedwriter
//			=> byte ( 1글자 저장)  char=>여러문자열 저장 가능
import java.io.*;
public class IO_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fos=
					new FileOutputStream("c:\\java_data\\student.txt");
			// 파일이 없는 경우 자동 생성
			// 파일이 있는 경우 글쓰기가 된다
//			fos.write('A');
//			fos.write('B');
//			fos.write('C');
//			fos.write('D');
//			fos.write('E');
			
			String msg="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			fos.write(msg.getBytes());
			fos.close();
			System.out.println("저장완료");
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
