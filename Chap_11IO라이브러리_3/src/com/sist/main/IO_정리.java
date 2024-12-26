package com.sist.main;
/*
 * 	IO => java.io => CheckException => 예외처리 후 사용
 * 					 --------------
 * 
 * 	1) 특징
 * 	= 단방향 => Input / Output
 * 		=> 동시 읽기쓰기 => 쓰레드 이용해서 처리
 * 		=> 네트워크 : 전송(쓰기) => 수신(읽기)
 * 				  ---------	  ---------thread
 * 		=> 쓰레드는 프로그램안에서 다른 프로그램 여러개를 동시 수행
 * 
 * 	2) 종류
 * 	= 바이트 송수신 => 바이트 스트림
 * 		=> 1바이트 읽기 / 1바이트 쓰기
 * 		=> 동영상 / 이미지 / zip
 * 		=> ~inputstream / ~outputstream
 * 		=> 웹) 업로드 / 다운로드 / 웹데이터 읽기
 * 			네트워크에서 주로 사용
 *  = 문자 송수신 - 문자 스크림
 *  	=> 2바이트 읽기 / 2바이트 쓰기
 *  	=> 한글을 포함한 한글제어
 *  	=> ~Reader / ~Writer
 *  = ~InPurStream / ~OutPutStream
 *  	=>FileInPutStream / FileOutPutStream
 *  	=>ObjectInputStream  / ObjectOutputStream 
 *  = ~Reader / ~Writer
 *  	=>FileReader / FileWriter
 *  = 속도 최적화 => 필터스트림
 *  	=>BufferedInputStream / BufferedOutPutStream
 *  	=>BufferedReader / BufferedWriter
 *  3) 사용되는 곳
 *  		입력스트림							출력스트림
 *  사용자 =================== 자바프로그램 ====================화면
 *  (키보드					 응용프로그램					(모니터
 *  마우스)												브라우저)
 *  
 *  메모리에서 입출력 : BufferedReader => readLine()
 *  파일에서 입출력
 *  	바이트 스트림 (~InputStream / ~OutPutStream)
 *  	- read() => 한글자씩 읽어온다
 *  		=>int => 글자의 코드번호
 *  	- read(byte[],int off, int len)
 *  			 => 한번에 여러개의 글자 읽기
 *  			 => int => 읽은 글자수
 *  	- write(int) 
 *  	- write(byte[]) => String을 byte[] 변환 => getbytes()
 *  	- close()
 *  	- 전송/ 정보
 *  문자스트림 (~reader / ~write)
 *  	- read() =>int
 *  	- read(char[],int,int)
 *  	- write(int) 
 *  	- write(char)
 *   	- write(String)***
 *   	- 파일 제어 => 읽기쓰기
 *  네트워크 입출력
 *  ---------------------스트림을 이용
 *  스트림 => 안전성
 *   | 메모리에 저장된 데이터를 읽어온다 -> 절대 잊어버리지 않는다
 *   | 소켓프로그램 => 신뢰성이 좋다
 *   	 | 이메일(smtp) 파일업로드(FTP), TELNET
 *   
 *   표준입출력
 *   = system.in / system.out
 *   public final class system
 *   {
 *   	public static inputstream in;
 *   					=> read()
 *   	public stati outputstream out;
 *   					=> print
 *   }
 *   
 *   4) 파일모드
 *   r => ~InputStream / ~Reader => 읽기 전용
 *   w => ~OutputStream / ~Writer => Create
 *   		=> 덮어쓴다
 *   a => new FileWriter("파일명",true)
 *   						   ------
 *   5) 객체단위 저장
 *     ----------
 *     ObjectInputStream / ObjectOutputStream
 *     --------------------------------------
 *     | 읽기 / 쓰기 / 수정 / 삭제 / 검색
 *     | 제어는 ArrayList => 저장 
 *     | 직렬화 / 역직렬화
 *     
 *   6) XML, CSV, JSON
 *   			  -----자바-자바스크립트 연결
 *   		----데이터베이스 백업용
 *    ----스프링(클래스 등록)
 *   7) 독릭적인 클래스 (.properties) => Map (키=값)
 *     ------------
 *     	File : 파일정보 / 디렉토리(폴더) 정보
 *     	생성
 *     	new File ("경로명\\폴더명")
 *     	new File ("경로명\\파일명")
 *      주요기능
 *      getName() : 파일명만
 *      getPath() : 경로명+파일명
 *      IsFile() : 파일여부 확인
 *      length() : 파일크기 => long
 *      -------------------------
 *      listFiles() : File[] => 폴더 안에 있는 모든 정보
 *      mkdir() : 폴더 만들기
 *      createNewFile() : 파일 만들기
 *      delete() : 파일 삭제
 *      existe() : 존재여부
 *      --------------------------------------------
 *      read() / write()
 *      => bufferesReader => readLine()
 *      => 파일은 반드시 닫기를 한다
 *    
 */
// 키보드로 입력을 받아서 처리
import java.util.*;
import java.io.*;
public class IO_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
//			BufferedReader in=
//					new BufferedReader(new InputStreamReader(System.in));
//			System.out.print("문자열 입력: ");
//			String msg=in.readLine();
//			System.out.println(msg);
			
			System.out.print("입력: ");
			int data=System.in.read();
			System.out.println((char)data);
			
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
