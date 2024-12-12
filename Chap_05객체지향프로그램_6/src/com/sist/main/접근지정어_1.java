package com.sist.main;

import java.util.Arrays;

/*
 * 	패키지 : 관련된 클래스를 모아서 관리 영역
 * -----폴더
 * 	com.회사명.클래스종류
 * 			 =>vo : 사용자 정의 데이터형
 * 			 =>dao : 오라클연동
 * 			  ======>테이블당 1개
 * 			 =>manager : open API, 크롤링
 * 			 =>model : 브라우저 연결 => 데이터 전송
 * 		***	 =>commons : 공통으로 사용되는 기능
 * 				=> 중복제거 => static => 공통모듈
 * 		***	 =>service : dao+ model
 * 		***	 =>controller : 사용자요청 -> model
 * 		=>view : 화면 UI
 * 		=>dao / vo / controller
 * 
 * 		=> client / server
 * 	 =>자바소스
 * 	-----------------------------------------------
 * 
 * 	접근지정어
 *  ------
 *   public / protected / default / private
 *   
 *   public : 클래스, 메소드, 필드, 생성자
 *   		  => 다른 클래스와 연결
 *   			--------------다른 패키지 연결
 *   			=> 클래스, 메소드, 생성자
 *   		  => 모든 클래스에서 사용가능
 *   
 *   protected : 메소드, 필드, 생성자
 *   			=> 같은 패키지에서만 사용 가능
 *   			  ---------프랜들리
 *   			=> 다른 패키지에서 상속받은 클래스는 사용 가능		
 *   			=> 사용빈도가 거의 없다
 *   
 *   default : 클래스, 메소드, 필드, 생성자
 *   			=> 같은 패키지에서만 사용 가능 
 *   			=> 윈도우 : button , menu..
 *   
 *   private : 메소드, 필드, 생성자
 *   			=> 자신의 클래스 영역에서만 사용 가능
 *   			=> 데이터 은닉화 => 필드(멤버변수)는 거의 대부분이 private 사용
 *   
 *   => 클래스 >> public (다른 클래스와 연동)
 *   => 메소드 >> public (다른 클래스와 통신)
 *   => 생성자 >> public
 *   => 멤버변수(필드) >> private
 *   
 *   패키지가 만들어지면 => 다른 패키지에 있는 클래스 사용시
 *   반드시 import 이용
 *   
 *   import com.sist.main.*;
 *   import com.sist.main.클래스명
 *   
 *   *** 140페이지
 *   메소드 : 한 개의 기능을 수행하는 명령문의 집합
 *   		=> 종류
 *   			1. 인스턴스 메소드 : 객체마다 따로 저장되는 메소드
 *   			2. static 메소드 : 여러개 객체가 공통으로 사용하는 메소드
 *   								=> 한 개만 저장 => 공통모듈
 *   			3. abstract 메소드 : 추상클래스
 *   			4. final 메소드 : 거의 사용빈도 없다
 *   
 *   	회원가입 메소드- 오라클 연결-오라클로 데이터전송(insert)-오라클 닫기
 *   	회원수정 메소드- 오라클 연결-오라클로 데이터전송(update)-오라클 닫기
 *   	회원탈퇴 메소드- 오라클 연결-오라클로 데이터전송(delete)-오라클 닫기
 *  				(static)					  (static)
 *  		*** 반복제거 ... => 메소드화
 *  
 *  	[접근지정어] [제어어] 리턴형 메소드명 (매개변수)
 *  	{		  -----
 *  			  static
 *  	}
 *  	
 *   제어어
 *  -----
 *  static / abstract / final 
 */
class util
{
	// 중복없는 난수 =>예약가능한 날
	/*
	 * 값 읽기 - 값 설정 - 존재 여부 - 삭제
	 * getXxx  setXxx  isXxx	remove,delete
	 */
	public int[] getrand(int count)
	{
		int[]com=new int [count];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*31)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		return com;
	}
	//call by reference
	public void getrand(int[]com)
	{
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*31)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		
	}
	
	// 정렬
	// 패키지가 없는 경우 => jsp사용이 안된다, jar파일을 못 만든다
//	public void display()
//	{
//		System.out.println("진입2-6");
//		System.out.println("기능처리3-7");
//		System.out.println("종료4-8");
//	}
}
public class 접근지정어_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		util util=new util();
		int day=(int)(Math.random()*16)+5;
		int[] arr=new int[day];
		util.getrand(arr);
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		
//		int day=(int)(Math.random()*16)+5;
//				
//		int[] arr=util.getrand(day);
//		//		  객체명.메소드명(값)
//		Arrays.sort(arr);
//		for(int i:arr)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println("main에서 호출전1");
//		util.display();
//		System.out.println("main에서 호출완료5");
//		util.display();
//		//메소드 호출시 처음부터 끝까지 수행 후 복귀한다
//		System.out.println("main 종료9");
		
		
		
	}

}
