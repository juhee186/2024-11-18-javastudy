package com.sist.exception;
/*
 * 	예외처리 방법
 * ----------
 * 	1. 직접처리(예외복구)
 * 		Try
 * 		{
 * 			정상적으로 수행하는 문장
 * 				=> 오류발생 가능성 있다
 * 		}catch(예상되는 예외 클래스)
 * 		{
 * 			오류발생시 처리 복구
 * 			오류내용 확인
 * 		}
 * 		finally
 * 		{
 * 			닫기(서버,오라클,파일)=> 자원 반환
 * 			=> 무조건 수행 
 * 		}
 * 	2. 간접처리(throws)
 * 		=> 예외회피
 * 		=> 예상되는 예외 선언 => 이런 예외가 발생할 것 같다
 * 							------------------
 * 							컴파일러에게 알려준다
 * 		=> 이 메소드를 사용시에는 반드시 예외처리 후 사용 가능
 * 			=> throws / try~catch 이용
 * 		=> 사용자 정의는 사용빈도가 적다 / 라이브러리 많이 존재
 * 		  ----------------------
 * 			코딩 소스가 많은데 중간에 예외처리할 문장이 있는 경우
 * 
 * 		=> 형식)
 * 			public void display() throws 예외처리클래스..
 * 				=> 여러개일 경우 : , 로 구분
 * 				=> 순서가 없다
 * 				=> 예상되는 예외를 지정
 * 
 * 		Check				
 * 	  --------			  
 *   반드시 예외처리			  
 *   
 *   	Throwable
 *   	Exception
 *   	IOException
 *   	SQLException
 *   	ClassnotFoundException	
 *   
 *   	UnCheck
 * 	   ---------			
 *    필요시에만 예외처리 
 *    
 *    	RuntimeException
 *    	ArithmeticException
 *    	ArrayIndexOutOfException
 *    	NumberFormateException
 *    	NullPointerException
 *    	ClassCastException
 *    ===========================>> throws 뒤에서 사용하지 않는다
 *    ===========================>> 특별한 경우가 아니면 잘 사용하지 않는다 > 예외를 피하는 상태/시스템에 의해 처리
 *    									==> try~catch 사용 > 예외를 직접 잡아서 필요시 복구해서 사용 가능
 *   
 */
public class 예외처리_1 {
//	public int div(int a,int b) throws ArithmeticException
//	{
//		return a/b;
//	}
//	public void print()
//	{
//		int c=div(10,0);
//	}	
	
	public void display() throws Exception,ClassNotFoundException
	{
		System.out.println("display call..");
	}
	public void print()
	{
		try
		{
			display();
		}catch(ClassNotFoundException e) {}
		catch(Exception e) {}
		
	}
	public void print2()
	{
		try
		{
			display();
		}catch(Exception e) {}//catch(throwable e) {}
	}
	public void print3() throws Exception,ClassNotFoundException
	{
		display();
	}
	public void print4() throws Exception
	{
		display();
	}
	/*
	 *  소스가 없는 경우 => 새로운 메소드 만드는 경우
	 *  	try~catch => 개발
	 *  
	 *  이미 소스 코딩이 있는 경우 => 새로운 기능을 추가할 때
	 *  	throws => 유지보수
	 *  	------
	 *  	1. 예상되는 예외를 메소드 뒤에 선언
	 *  	2. 메소드 호출시 반드시 예외처리 후 사용
	 *  	-----------------------------
	 *  		=> 직접처리(***)
	 *  		=> 선언 후 사용할 수 있다
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
