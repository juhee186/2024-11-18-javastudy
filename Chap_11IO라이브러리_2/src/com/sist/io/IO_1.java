package com.sist.io;
/*
 * 	입출력
 * 		입력스트림			 출력스트림
 * 	키보드  =====> 자바프로그램 ======> 모니터
 * 			|				|
 * 		~inputStream	~OutputStream
 * 		~Reader			~Writer
 * 
 *	 ~inputStream / ~OutputStream
 *		=> 이미지나 동영상같은 바이트 형태의 데이터 입출력
 *		=> 업로드 / 다운로드
 *	
 *	 ~Reader / ~Writer
 *		=> 16bit 문자 데이터를 입출력
 *		=> 파일 글쓰기 / 파일 읽어오기
 *
 *	메모리에 모아서 한 번에 처리 => Buffered~
 *	=> 객체단위로 저장
 *	  -----------파일 프로그램
 *	=> 파일 => 데이터베이스 변경
 *	=> 파일에 저장
 *	  ---------Open API => 파싱
 *	  ---------크롤링 => 임시 저장 장소
 *		
 *	1. 데이터 종류
 *	 1) 정형화된 데이터 : 데이터베이스만 저장 => 공유
 *		=> 웹/윈도우에 출력한 데이터만
 *	 2) 반정형화된 데이터 : 구분만 된 데이터
 *		=> HTML/XML/JSON/CSV
 *			=>API
 *	 3) 비정형화된 데이터 : 구분이 없는 데이터
 *		=> 뉴스/줄거리/댓글
 *			=> 분석해서 필요한 데이터를 가지고와서 정형화된 데이터
 *				-------------------------------------빅데이터=>AI >> 정규식
 *	FileInputStream / FileOutputStream => 이미지/zip
 *	=> CheckException => 예외처리가 필요
 *		|					|
 *	  파일읽기				  파일쓰기		
 *
 */
import java.io.*;

import javax.annotation.processing.Filer;
public class IO_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileInputStream fis=null;
		FileReader fis=null;
		try
		{
			// 파일읽기 => 358페이지
			fis=new FileReader("C:\\javadev\\javastudy\\Chap_11IO라이브러리_2\\src\\com\\sist\\io\\IO_1.java");
			// 숫자 / 알파벳 => 정상수행
			int i=0; //read()=> int => char로 변환
			// 'A' => 65
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(Exception ex)
		{
			ex.printStackTrace(); //오류확인
		}
		finally
		{
			try
			{
				fis.close();
			}catch(Exception ex) {}
		}

	}

}
