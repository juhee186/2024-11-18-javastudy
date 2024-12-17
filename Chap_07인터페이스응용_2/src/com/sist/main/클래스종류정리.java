package com.sist.main;
/*
 * 	응용(x)
 * -------
 * => 목적
 * 		=> 추상클래스 / 인터페이스 => 같은 기능
 * 					--------
 * 					| 추상클래스의 기능을 보완
 * 					| 기능별로 모아서 처리
 * 					  ----
 * 					 = 윈도우 이벤트 처리
 * 					 = collection
 * 					 1) 순서가 있다 , 중복 데이터 저장 허용
 * 						List => ArrayList / LinkedList / stack
 * 											 |Queue
 * 					 2) 순서가 없다 , 중복 데이터 저장 미허용
 * 						Set => treeSet / HashSet
 * 					 3) 키 , 값 동시 저장 , 키는 중복(x), 값 중복(O)	
 * 						Map => HashMap / HashTable
 * 					  = 기능별 분리
 * 					  = 데이터베이스
 * 						= COnnection / Statement / ResultSet
 * 					  = 네트워크 연결
 * 						= Socket
 * 					  = 쓰레드
 * 						= Thread => run()
 * 					----------------------------------라이브러리
 * 					사용자정의 => 인터페이스 , 추상클래스
 * 							=> 공통으로 적용되는 기능
 * 							=> 웹 : 사용자요청 받기
 * 									처리 결과값 보내기
 * 					| 관련된 클래스 모아서 관리
 * 					  ------------------인터페이스
 * => 형식
 * => 기능 : 상속 / 형변환 / 오버라이딩
 * 			------------------- 
 * 
 * => 상속
 * 	  --- 기존의 클래스의 기능을 받아서 재사용
 * 	  --- 추상클래스 : extends => 단일 상속
 * 	  --- 인터페잇 : implements => 다중 상속
 * 								-------윈도우
 * 	  ---MVC구조를 만드는 경우 => 인터페이스 => 어노테이션
 * 	  ---라이브러리에서 지원하는 인터페이스를 주로 사용
 * 		 -------------
 * 		 | 기능 처리가 여러개인 경우
 * 			CGV / 롯데시네마 / 메가박스 => 기능 구현(선언)
 *		 | 기능 설계 => 개발속도가 빠르다 
 * 		  --------
 * => 상속시 메모리 할당
 * 		=> 상속받은 클래스만 이용
 * 		=> class A
 * 		   class B extends A
 * 
 * 			=> B b=new B();
 * 		=> 상속내리는 클래스 이용
 * 		   class A
 * 		   class B extends A
 * 
 * 			=> A a=new B(); => 추상클래스 / 인터페이스
 * 							   -----------------
 * 								| 자신의 생성자를 이용해서 메모리 할당
 * 			=> 클래스가 미완성이기 때문에 메모리 할당할 수 없다
 * 					 -----
 * 					 | 메소드가 구현이 안 된 상태
 * 		=> 상속 : extends
 * 			=> 제외 : static / 초기화블럭 / 생성자
 * 		=> 상속
 * 			상속을 받은 내용을 그대로 사용 or 변경해서 사용
 * 									 -------------오버라이딩
 * 			오버라이딩 => 추상클래스 / 인터페이스
 * 			-------
 * 			1) 상속
 * 			2) 메소드, 리턴형, 매개변수 동일
 * 			3) 접근지정어는 확대만 가능
 * 				=> 클래스간의 크기
 * 				상속내린 클래스 > 상속받은 클래스 : is-a
 * 				클래스 안에 클래스를 포함하는 경우 : has-a
 * 			----------------------------------------
 * 			class A
 * 		    class B   => 비교불가능
 * 
 * 			class A
 * 		    class B extends A => A>B
 * 
 * 			class A
 * 			{
 * 			}
 * 			class B
 * 			{
 * 				A a=new A(); B>A 포함
 * 			}
 * 
 * 			class String extends Object
 * 			class StingBuffer extends Object
 * 	
 * 				Object
 * 				  |
 * 			--------------
 * 			|			 |
 * 		String		StringBuffer	
 */
public class 클래스종류정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj=new Object();
		String str="";
		StringBuffer sb=new StringBuffer();
		
		if(obj instanceof Object)
		{
			System.out.println("객체");
		}
		

	}

}
