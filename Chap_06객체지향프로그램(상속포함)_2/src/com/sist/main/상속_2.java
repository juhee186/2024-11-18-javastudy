package com.sist.main;
/*
 * 	메소드 오버라이딩 => 메소드의 기능 변경 => 유지보수
 * ---------------------------------------
 *  오버라이딩의 조건  *****인터페이스
 *  1. 상속 => 상속받은 메소드를 변경해서 사용
 *  2. 메소드명이 동일하다
 *  3. 매개변수가 동일
 *  4. 리턴형이 동일
 *  5. 접근지정어 확대 가능 ,축소는 불가능
 *  	
 *   class A
 *   {
 *   	void display(){}
 *   }
 *   class B extends A
 *   {
 *   	1.void display(){}
 *   	2.public void display(){} =>확장
 *   	3.protected void display(){} =>확장
 *   	4.private void display(){} == 오류(축소)
 *   
 *   }
 *   
 *   interface A
 *   {
 *   	(public abstract) void display(){}
 *   	int a;  == 오류 =>상수형 (값을 줘야한다)
 *   }
 *   class B implements A
 *   {
 *   	void display(){} ==오류 (축소)
 *   }
 */
class animal
{	int a=10;
	public void run()
	{
		System.out.println("걷는다");
	}
}
class dog extends animal
{	int a=20;
	public void run()
	{
		System.out.println("4발로 걷는다");
	}
}
class human extends animal
{	int a=30;
	public void run()
	{
		System.out.println("2발로 걷는다");
	}
}
/*
 * 		---------		-------------
 * 		 run()			 0X100=> 0X200
 * 		---------		-------------
 * 	new dog() ======> 0X100
 * 	new human() ====> 0X200
 * 
 * 	==> 정적바인딩 => 한 개의 주소 유지
 * 	==> 동적바인딩 => new 주소 변경
 * 	==> 가상함수
 */
public class 상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//관련된 클래스가 여러개 있는 경우 => 상위 클래스를 이용
		//객체를 한 개만 생성해서 사용
		animal ani= new dog();
		System.out.println(ani.a);
		ani.run();
		ani= new human();
		System.out.println(ani.a);
		ani.run();
		
		/*
		 *  변수 찾기
		 *  ------선언되는 클래스형
		 *  메소드 찾기
		 *  -------생성자
		 */
		
	}

}
