package com.sist.exception;
/*
 * 	변수 => 데이터형
 * 	연산자 / 제어문
 * 	배열 => 1차원
 * 	클래스 / 객체 생성 / 메소드
 * 	상속 => 오버라이딩
 * 	인터페이스
 * 	예외처리
 * 	라이브러리 => 조립
 * 		=> collection / IO
 * 	-------------------------웹
 * 	=> 12장 필수(오라클)
 * 
 * 	8장 예외처리 => 263페이지
 * 		
 * 	목적 : 사전에 에러를 방지하는 목적
 * 		  우선시 => if
 * 		 ------> 처리가 어려운 경우 : 예외처리 사용
 * 		  => 비정상 종료를 방지하고 정상상태를 유지
 * 		  => 예외처리 => 에러발생시 에러를 건너뛴다
 * 			--------if
 *	에러발생
 *		사용자 => 잘못된 입력 => 유효성검사 => if (javascript)
 *		개발자 => 실수 => 배열인덱스, 정수변환, 형변환
 *		-----------------------------------
 *				 컴파일			  인터프리터
 *		A.Java ========> A.class ========> 화면출력 
 *				Javac			   Java
 *				  |					 |
 *				 에러					에러
 *								  ------ 에러처리
 *								  실시간 에러
 *								  RunTimeException
 *								 =>경우에 따라 예외처리
 *			확인) 컴파일시 반드시 예외처리 필요
 *		=> CheckException : 필수적으로 예외처리
 *			= IO (파일입출력)
 *				IPException
 *			= 네트워크 (서버 => URL, IP)
 *				MalformException
 *			= SQL (데이터베이스)
 *				SQLException
 *			= 쓰레드
 *				InterruptedException
 *		=> UnCheckException : 필요시에만 예외처리
 *			배열 범위 초과 / 정수 변환 / 0으로 나누는 경우
 *			객체가 null / 클래스 형변환..
 *		
 *
 *		1) 사전에 차단 (우선시 => if) => 예외처리
 *		2) 에러
 *			= 에러 => 소스상에서 수정이 불가능한 에러
 *					 메모리 부족, 이클립스..
 *					 치명적인 에러 => 처리할 수 없다
 *			= 예외처리 => 소스상에서 수정이 가능한 에러
 *					 파일읽기 => 경로명 / 파일명 틀린 경우
 *					 데이터베이스 => SQL문장이 틀린 경우
 *					 크롤링 => URL주소가 틀린 경우
 *					 배열 인덱스가 틀린 경우
 *		3) 예외처리방법
 *			= 예외복구 : try ~ catch
 *					  ---	------
 *					정상수행문장 	에러발생시 처리복구
 *								  => 직접처리 : 개발자가 직접 처리
 *			= 예외회피 (떠맡기기) : throws
 *							  -------간접처리 : 시스템에 맡기는 경우
 *											 라이브러리에 많이 존재
 *											 사용시에 예외처리 후 사용
 *			= 임의발생 => 견고한 프로그램 여부 확인
 *			= 지원하지 않는 예외 : 사용자 정의 예외처리
 *			----------------
 *				public class MyException extends Exception
 *				{
 *				}
 *		예외처리 하는 경우
 *		------------- 예외가 많이 예상되는 경우
 *		catch를 여러개 사용 가능
 *		-------------------순서가 존재
 *
 *		문자열 => 정수로 변경후 배열에 저장후 나눈값 출력
 *				--------  -------	--------
 *		=> 사전에 에러방지 => 에러 예상하면서 소스 코딩
 *		   --------------------------------
 *
 *		=> 266페이지
 *						Object
 *						   |
 *						Throwable
 *						   |
 *				-----------------------
 *				|					  |
 *			Error					Exception
 *			-----처리 불가능			---------
 *				 메모리 부족				  |
 *				=>ElasticSearch			-------------------------
 *				=>루씬=>구글(검색엔진)		|						|
 *				=>데이터베이스(NoSQL)	 Check					 UnCheck
 *									 -----반드시 예외처리		 -------필요시에만 예외처리
 *										  컴파일러가 감시				
 *									-------------------------------------
 *									|
 *								IOException : 입출력
 *									-> 파일
 *									-> 메모리
 *									-> 네트워크
 *								SQLException : 오라클 연동
 *									오라클(데이터베이스)
 *									 =>SQL문장
 *									 =>Insert / Update / Delete
 *									   Select
 *									  -------Join/Subquery
 *									  -------Function
 *									  -------Procedure
 *									  -------Trigger
 *									  입고 => 재고
 *									  출고 => 재고
 *									SQL
 *									 |
 *									DQL => Select(검색)
 *									DML => I/U/D
 *									DCL => Grant / Revoke
 *									TCL => Commit / Rollback
 *									DDL => Create / Alter /  Drop
 *								ClassNotFoundException
 *									Class.forName("패키지.클래스명")
 *									=> 리플렉션 => 클래스 정보
 *								InterrutedException : 충돌방지
 *									=> 쓰레드
 *								MalformedURLException 
 *									=> URL
 *
 *								=> java.io / java.sql / java.net
 *
 *								IllegalArgumentException : 매개변수에 잘못된 데이터를 전송
 *								---------------------------------------------------예외처리의 강제성
 *								웹 => 400 (Bad Request)
 *									 200 => 정상수행  404 => 파일 Not Found  415 => 한글변환코드
 *									 403 => 접근거부  *500 => 자바 소스오류 
 *							----------------------------------------------------------------
 *
 *								UnCheckException : 컴파일러가 제한하지 않는다
 *									=> 예외처리가 없음
 *									=> 에러가 많이 발생하는 부분에서는 예외처리를 하면 좋다
 *									=> 웹 / 윈도우 => 정수입력..
 *									=> " 10" => 정수형 변경이 안된다 => trim()
 *									=> 웹 => board_list.jsp?page= 10 ==> 오류코드
 *														        --공백
 *							=>	RunTimeException
 *
 *								ArrayIndexOutOfBoundsException : 배열범위 초과
 *									int[] arr=new int[2]; //0,1
 *									arr[2]=100; => 오류발생
 *								NullPointerException
 *									A a;
 *									a.display() => 객체 주소가 지정되지 않은 경우
 *								ArithmeticException : 0으로 나누는 경우
 *								ClassCastException
 *									class A
 *									class B extends A
 *					
 *									B b=new A(); => 오류
 *
 *									A a=new B(); 
 *									B b=(B)a;
 *
 *								NumberFormatException : 문자열을 정수형 변경시 에러
 *
 *							=> Catch여러개인 경우
 *								계층순서로 적용
 *							
 *						
 *							catch(NumberFormatException) => 예상된 에러
 *							catch(IOException e) => 예상된 에러
 *							catch(Exception e) => 기타 (예상외 에러를 잡기위해 사용)
 *
 *							=> 위로 올라갈수록 예외처리범위가 커진다
 *							  -----------------------------
 *							   catch는 반드시 작은순위 => 큰 순위로 설정
 *							=> 예외처리의 가장 클 클래스는 Exception 
 *
 *		===========> 예외처리의 기본
 *						try~catch : 가장 많이 사용되는 예외처리
 *						=> 정상수행 => 에러발생 => catch / 스킵
 *											 ------	 ----
 *										에러처리후 복구
 *										 에러위치 확인
 *
 *		try
 *		{
 *			정상으로 수행하는 문장
 *		}catch(예상되는 예외클래스) 
 *		{
 *			예외 발생시 처리하는 문장
 *		}
 *		
 *		=> 예)
 *		-------
 *		문장1
 *		문장2 ==> 에러 발생 => 종료 (비정상종료)
 *		문장3 
 *		-------
 *
 *		문장1
 *		문장2 => 에러발생 => 종료
 *		try
 *		{
 *			문장3
 *			문장4 => 에러발생2 => catch로 이동
 *			문장5 => 스킵
 *			----------에러 밑의 문장은 수행하지않는다
 *		}catch(예상되는 예외클래스) {
 *			문장6 => 문장5로 이동 => 복구
 *		}
 *		문장7
 *		문장8
 *
 *		=> 정상 출력시 문장6을 제외하고 실행
 *		=> 에러발생2 : 1-2-3-6-7-8
 */								
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread.sleep(100);
		int a=10;
		int b=a/0;
		System.out.println(b);

	}

}
